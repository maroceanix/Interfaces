package ejVariasW;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana2 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton irVentana1, irVentana3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Ventana 2");
		
		//botones
		irVentana1= new JButton("Ir a Ventana 1");
		contentPane.add(irVentana1);
		irVentana1.setBounds(120, 60, 150, 40);
		
		
		irVentana3=new JButton("Ir a Ventana 3");
		contentPane.add(irVentana3);
		irVentana3.setBounds(120,100, 150, 40);
		
		
		irVentana1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana1 v1=new Ventana1();
				v1.setVisible(true);
				dispose();
				
			}
		});
		
		irVentana3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana3 v3= new Ventana3();
				v3.setVisible(true);
				dispose();
				
			}
		});
	}

		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
