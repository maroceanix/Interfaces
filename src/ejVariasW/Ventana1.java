package ejVariasW;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Ventana1 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton irVentana1, irVentana2, irVentana3;

    public static void main(String[] args) { 
    	EventQueue.invokeLater(new Runnable() {
    	 public void run() {
    		 try { 
    			 Ventana1 frame = new Ventana1(); 
    			 frame.setVisible(true); 
    	} catch (Exception e) { e.printStackTrace(); 
    	} 
    	} 
    	}); 
    	}

    public Ventana1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); 
        setContentPane(contentPane);
        setTitle("Ventana 1");
        
        //botones
        irVentana2 = new JButton("Ir a Ventana 2");
        irVentana2.setBounds(120, 60, 150, 40);
        irVentana2.addActionListener(this);
        contentPane.add(irVentana2); 
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == irVentana2) {
        	new Ventana2().setVisible(true); // abre la siguiente
            dispose();
            
        }
    }
}

