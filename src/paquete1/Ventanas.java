package paquete1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;

@SuppressWarnings("unused")
public class Ventanas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanas frame = new Ventanas();
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
	public Ventanas() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton uno = new JButton("1");
		JButton dos = new JButton("2");
		dos.setBounds(160, 82, 46, 23);
		contentPane.add(dos);
		
		uno.setBounds(91, 82, 46, 23);
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==uno) {
					System.exit(0);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(uno);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(91, 48, 244, 23);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
	
	
		
		JButton tres = new JButton("3");
		tres.setBounds(226, 82, 46, 23);
		contentPane.add(tres);
		
		JButton cuatro = new JButton("4");
		cuatro.setBounds(91, 116, 46, 23);
		contentPane.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setBounds(160, 116, 46, 23);
		contentPane.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setBounds(226, 116, 46, 23);
		contentPane.add(seis);
		
		JButton siete = new JButton("7");
		siete.setBounds(91, 150, 46, 23);
		contentPane.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setBounds(160, 150, 46, 23);
		contentPane.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setBounds(226, 150, 46, 23);
		contentPane.add(nueve);
		
		JButton cero = new JButton("0");
		cero.setBounds(160, 184, 46, 23);
		contentPane.add(cero);
		
		JButton borrar = new JButton("AC");
		borrar.setBounds(91, 184, 46, 23);
		borrar.setForeground(new Color(255, 105, 180));
		contentPane.add(borrar);
		
		
		JButton igualA = new JButton("=");
		igualA.setForeground(new Color(30, 144, 255));
		igualA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		igualA.setBounds(226, 184, 46, 23);
		contentPane.add(igualA);
		
		JButton division = new JButton("%");
		division.setBounds(289, 82, 46, 23);
		contentPane.add(division);
		
		JButton suma = new JButton("+");
		suma.setBounds(289, 116, 46, 23);
		contentPane.add(suma);
		
		JButton resta = new JButton("-");
		resta.setBounds(289, 150, 46, 23);
		contentPane.add(resta);
		
		JButton multi = new JButton("*");
		multi.setBounds(289, 184, 46, 23);
		contentPane.add(multi);
		
		JLabel Label1 = new JLabel("Calculadora");
		Label1.setBounds(91, 25, 80, 14);
		contentPane.add(Label1);

		
	}
}
