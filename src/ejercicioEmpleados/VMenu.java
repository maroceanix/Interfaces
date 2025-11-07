package ejercicioEmpleados;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VMenu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem m1, m2, m3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VMenu frame = new VMenu();
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
	public VMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Menú");
		
		mb= new JMenuBar();
		setJMenuBar(mb);
		
		menu1= new JMenu("Opciones");
		mb.add(menu1);
		
		m1= new JMenuItem("Agregar Empleados");
		m1.addActionListener(irAgregarEmp);
		menu1.add(m1);
		
		m2= new JMenuItem("Ver Empleados");
		m2.addActionListener(irVerEmp);
		menu1.add(m2);
	}

	ActionListener irAgregarEmp= new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			AgregarEmp ae1= new AgregarEmp();
			ae1.setVisible(true);
			//ae1.addFocusListener(null);
		}
	};
	
	
	ActionListener irVerEmp= new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			VerEmp ve1=new VerEmp();
			ve1.setVisible(true);
			dispose();
		}
	};
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
