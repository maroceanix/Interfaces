package ejercicioEmpleados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class AgregarEmp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApe;
	private JLabel nombreL, apellidosL, puebloL;
	private JComboBox cb;
	private JLabel genL;
	private ButtonGroup genero;
	private JRadioButtonMenuItem rb_chico, rb_chica;
	private JLabel sxdL;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarEmp frame = new AgregarEmp();
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
	public AgregarEmp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Agregar Empleados");
		
		nombreL = new JLabel("Nombre:");
		nombreL.setBounds(25, 30, 69, 14);
		contentPane.add(nombreL);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(104, 27, 138, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		apellidosL = new JLabel("Apellidos:");
		apellidosL.setBounds(25, 95, 69, 14);
		contentPane.add(apellidosL);
		
		tfApe = new JTextField();
		tfApe.setColumns(10);
		tfApe.setBounds(104, 92, 138, 20);
		contentPane.add(tfApe);
		
		puebloL = new JLabel("Pueblo: ");
		puebloL.setBounds(25, 151, 69, 14);
		contentPane.add(puebloL);
		
		cb = new JComboBox();
		cb.setBounds(104, 147, 138, 22);
		contentPane.add(cb);
		cb.setModel(new DefaultComboBoxModel(new String[] {"Villalba", "Alpedrete", "Pueblo"}));
		
		genL = new JLabel("Género:");
		genL.setBounds(25, 208, 69, 14);
		contentPane.add(genL);
		
		genero=new ButtonGroup();
		rb_chico= new JRadioButtonMenuItem("Hombre");
		rb_chico.setBounds(104, 196, 87, 26);
		contentPane.add(rb_chico);
		rb_chica= new JRadioButtonMenuItem("Mujer");
		rb_chica.setBounds(104, 233, 87, 26);
		contentPane.add(rb_chica);
		genero.add(rb_chico);
		genero.add(rb_chica);
		
		sxdL = new JLabel("Salario*Día");
		sxdL.setBounds(25, 291, 69, 14);
		contentPane.add(sxdL);
		
		textField = new JTextField();
		textField.setBounds(104, 288, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
}
