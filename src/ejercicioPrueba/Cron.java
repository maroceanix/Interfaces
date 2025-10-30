package ejercicioPrueba;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.Timer;
public class Cron extends JFrame {
	private int centesimas;
	private boolean corriendo;
	private JLabel label;
	private Timer reloj;
	private JButton inciciarPausa, reiniciar;
	
	public Cron() {
		centesimas=0;
		
	}
}
