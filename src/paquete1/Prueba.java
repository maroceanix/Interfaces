package paquete1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Prueba extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel para, correoLabel, correoCopiaLabel, asuntoLabel;
	private JButton botonEnviar;
	private JTextField parat, correo, correoCopia, asunto;
	private JTextArea area;
	private JScrollPane barra;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		para=new JLabel("Para:");
		para.setBounds(30, 20, 55, 14);
		getContentPane().add(para);
		
		asuntoLabel=new JLabel("Asunto:");
		asuntoLabel.setBounds(30, 50, 55, 14);
		getContentPane().add(asuntoLabel);
		
		correoLabel=new JLabel("CC:");
		correoLabel.setBounds(30, 80, 55, 14);
		getContentPane().add(correoLabel);
		
		correoCopiaLabel= new JLabel("CCO:");
		correoCopiaLabel.setBounds(30, 110, 55, 14);
		getContentPane().add(correoCopiaLabel);
		
		parat=new JTextField();
		parat.setBounds(100, 20, 140, 14);
		getContentPane().add(parat);
		
		asunto=new JTextField();
		asunto.setBounds(100, 50, 140, 14);
		getContentPane().add(asunto);
		
		
		correo=new JTextField();
		correo.setBounds(100, 80, 140, 14);
		getContentPane().add(correo);
		
		correoCopia=new JTextField();
		correoCopia.setBounds(100, 110, 140, 14);
		getContentPane().add(correoCopia);
		
		area=new JTextArea();
		area.setBounds(100, 140, 250, 250);
		getContentPane().add(area);
		
		botonEnviar=new JButton("Enviar");
		botonEnviar.setBounds(332, 401, 85, 29);
		getContentPane().add(botonEnviar);
		
		barra=new JScrollPane(area);
		barra.setBounds(100, 140, 250, 250);
		add(barra);
		
		botonEnviar.addActionListener(ac);
		
	}
	
	ActionListener ac=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==botonEnviar) {
				correoCopia.setText("");
				correo.setText("");
				parat.setText("");
				asunto.setText("");
				area.setText("");
			}
		}
	};
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
