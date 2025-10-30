package ejercicioPrueba;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prub {
	private static final int COLUMNAS=3;
	private static final int FILAS=3;
	int cont=0;
		public static void main(String[] args) {
			JFrame frame= new JFrame();
			frame.getContentPane().setLayout(new GridLayout(FILAS,COLUMNAS));	
			frame.setBounds(500, 500, 500, 500);
			frame.setVisible(true);
			
			JButton b1[][]=new JButton[COLUMNAS][FILAS];
		
		
		}
}

