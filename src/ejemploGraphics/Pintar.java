package ejemploGraphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Pintar extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int PLAIN = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pintar frame = new Pintar();
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
	public Pintar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d=(Graphics2D) g;
		
		//Línea
		g2d.setColor(Color.PINK);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawLine(30, 70, 770, 70);
		
		//Rectángulo (relleno y borde)
		g2d.setColor(Color.BLUE);
		g2d.fillRect(30, 100, 350, 60);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(30, 100, 350, 60);
		
		//Rectángulo redondeado
		g2d.setColor(Color.CYAN);
		g2d.drawRoundRect(420, 100, 350, 60, 50, 50);
		
		//Óvalo y lo relleno
		//g2d.setColor(Color.MAGENTA);
		//g2d.drawOval(30, 100, 350, 60);
		//g2d.fillOval(30, 100, 350, 60);
		
		//ARCO
		g2d.setColor(Color.PINK);
		g2d.drawArc(450, 200, 100, 100, 125, 80);
		
		g2d.setColor(Color.PINK);
		g2d.drawArc(452, 200, 100, 100, 125, -120);
		
		//POLIGONO 3 LADOS
		int[] trianglo_x= {450, 510, 570};
		int [] triangulo_y= {300, 200, 300};
		g2d.setColor(Color.YELLOW);
		//numero de lados 3
		g2d.drawPolygon(trianglo_x, triangulo_y, 3);

		//POLÍGONO DE 5 LADOS RELLENADO
		int [] pentagono_x= {670, 650, 700, 750, 730};
		int[] pentagono_y= {300, 245, 200, 245, 300};
		g2d.setColor(Color.MAGENTA);
		//número de lados 5
		g2d.fillPolygon(pentagono_x, pentagono_y, 5);
		g2d.setColor(Color.ORANGE);
		g2d.drawPolygon(pentagono_x, pentagono_y, 5);
		
		//texto
		g2d.setColor(Color.RED);
		g2d.setFont(new Font("Arial", PLAIN, 32));
		g2d.drawString("Rojo", 30, 400);
		
		//imagen
		Toolkit t= Toolkit.getDefaultToolkit();
		Image imagen=t.getImage("src/foto.png");
		g2d.drawImage(imagen, 30, 450, this);
		
		//degradado (el degradado empieza en el 30)
		GradientPaint d= new GradientPaint(30, 350, Color.PINK, 770, 550, Color.GRAY);
		g2d.setPaint(d);
		g2d.fillRect(400, 350, 370, 200);
		g2d.setPaint(d);
		g2d.fillOval(30, 300, 370, 60);
		
	}
	

}
