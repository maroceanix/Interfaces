package paquete1;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Checkbox extends JFrame implements ChangeListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	@SuppressWarnings("unused")
	private JCheckBox ck1, ck2, ck3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkbox frame = new Checkbox();
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
	public Checkbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ck1= new JCheckBox("Inglés");
		ck1.setBounds(20, 20, 80, 50);
		ck1.addChangeListener(this);
		add(ck1);
		
		ck2=new JCheckBox("Alemán");
		ck2.setBounds(20, 70, 80, 50);
		add(ck2);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		String cad="";
		if(ck1.isSelected()==true) {
			cad=cad+"Inglés ";
		}
		if(ck2.isSelected()==true) {
			cad=cad+"Alemán ";
		}
		setTitle(cad);
		
	}

}
