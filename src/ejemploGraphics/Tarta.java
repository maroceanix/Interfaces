package ejemploGraphics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tarta extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int PLAIN = 0;
	private JPanel contentPane;
	private JTextField tfRojo;
	private JTextField tfAzul;
	private JTextField tfRosa;
	private JButton btnGraphs;
	private int[] values = {40, 30, 20}; 
    private Color[] colors = {Color.RED, Color.PINK, Color.CYAN};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarta frame = new Tarta();
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
	public Tarta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		
		JLabel lblColorFav = new JLabel("Color Favorito");
		lblColorFav.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblColorFav.setBounds(174, 11, 90, 23);
		contentPane.add(lblColorFav);
		
		JLabel lblRojo = new JLabel("Rojo:");
		lblRojo.setBounds(10, 411, 46, 14);
		contentPane.add(lblRojo);
		
		JLabel lblAzul = new JLabel("Azul:");
		lblAzul.setBounds(10, 453, 46, 14);
		contentPane.add(lblAzul);
		
		JLabel lblRosa = new JLabel("Rosa:");
		lblRosa.setBounds(10, 501, 46, 14);
		contentPane.add(lblRosa);
		
		tfRojo = new JTextField();
		tfRojo.setBounds(59, 408, 86, 20);
		contentPane.add(tfRojo);
		tfRojo.setColumns(10);
		
		tfAzul = new JTextField();
		tfAzul.setColumns(10);
		tfAzul.setBounds(59, 450, 86, 20);
		contentPane.add(tfAzul);
		
		tfRosa = new JTextField();
		tfRosa.setColumns(10);
		tfRosa.setBounds(59, 498, 86, 20);
		contentPane.add(tfRosa);
		
		btnGraphs = new JButton("Graficar");
		btnGraphs.setBounds(311, 449, 89, 23);
		contentPane.add(btnGraphs);
		
		JPanel panelTarta = new JPanel() {
		    @Override
		    protected void paintComponent(Graphics g) {
		    	
		        super.paintComponent(g);
				

		        int total = 0;
		        for (int v : values) total += v;

		        int startAngle = 0;

		        for (int i = 0; i < values.length; i++) {
		            int arcAngle = (int) Math.round(values[i] * 360.0 / total);
		            g.setColor(colors[i]);
		            g.fillArc(20, 20, 300, 300, startAngle, arcAngle);
		            startAngle += arcAngle;
		        }
		    }
		};
		
		panelTarta.setBounds(20, 40, 350, 350);
		contentPane.add(panelTarta);

		btnGraphs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	values[0] = Integer.parseInt(tfRojo.getText());
            	values[1] = Integer.parseInt(tfRosa.getText());
            	values[2] = Integer.parseInt(tfAzul.getText());

            	panelTarta.repaint();
            }
        });

	}	
}
