package paquete1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("unused")
public class PruebaBox extends JFrame implements ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> combo1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaBox frame = new PruebaBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		combo1= new JComboBox<String>();
		combo1.setBounds(20, 20, 80, 30);
		add(combo1);
		combo1.addItem("Rosa");
		combo1.addItem("Lila");
		combo1.addItem("Celeste");
		combo1.addItemListener(this);
		

	}


	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==combo1) {
			String seleccionade=(String)combo1.getSelectedItem();
			setTitle(seleccionade);
		}
	}
}
