package ejercicioVentaOrdenadores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;

@SuppressWarnings("unused")
public class VentaOrdenadores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private ButtonGroup monitor;
	private ButtonGroup discoDuro;
	private ButtonGroup memoria;
	private ButtonGroup procesador;
	private JButton btnSalir, botonAniadir, btnBuscar, btnEliminar, btnCancelar;
	private JLabel etiquetaNombreCli, etiquetaLocalidad;
	private JTextField txtNombreCli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaOrdenadores frame = new VentaOrdenadores();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public VentaOrdenadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiquetaNombreCli = new JLabel("Nombre del Cliente");
		etiquetaNombreCli.setBounds(48, 35, 131, 14);
		contentPane.add(etiquetaNombreCli);
		
		etiquetaLocalidad = new JLabel("Localidad");
		etiquetaLocalidad.setBounds(48, 114, 90, 14);
		contentPane.add(etiquetaLocalidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(new Color(255, 128, 192)));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Villalba", "Alpedrete", "Colmenar Viejo", "Moralzarzal"}));
		comboBox.setBounds(189, 110, 106, 22);
		contentPane.add(comboBox);
		
		txtNombreCli = new JTextField();
		txtNombreCli.setBorder(new LineBorder(new Color(255, 128, 192)));
		txtNombreCli.setBounds(189, 32, 155, 20);
		contentPane.add(txtNombreCli);
		txtNombreCli.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Lista de clientes");
		lblNewLabel_1.setBounds(391, 35, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButtonMenuItem rb1_1 = new JRadioButtonMenuItem("P4 3.0Gb");
		rb1_1.setBounds(10, 202, 133, 26);
		contentPane.add(rb1_1);
		
		JRadioButtonMenuItem rb1_2 = new JRadioButtonMenuItem("P4 3.2Gb");
		rb1_2.setBounds(10, 239, 133, 26);
		contentPane.add(rb1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Procesador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(48, 177, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Memoria");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(194, 177, 77, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Monitor");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(325, 177, 77, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Disco Duro");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_3.setBounds(446, 177, 77, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Opciones");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4.setBounds(547, 177, 77, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Grabadora DVD");
		chckbxNewCheckBox.setBounds(547, 209, 125, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxWifi = new JCheckBox("WiFi");
		chckbxWifi.setBounds(547, 236, 125, 23);
		contentPane.add(chckbxWifi);
		
		JCheckBox chckbxSintonizadorTv = new JCheckBox("Sintonizador TV");
		chckbxSintonizadorTv.setBounds(547, 262, 153, 23);
		contentPane.add(chckbxSintonizadorTv);
		
		JCheckBox chckbxBackupRestore = new JCheckBox("Backup/Restore");
		chckbxBackupRestore.setBounds(547, 288, 153, 23);
		contentPane.add(chckbxBackupRestore);
		
		botonAniadir = new JButton("Añadir");
		botonAniadir.setBounds(10, 382, 97, 36);
		contentPane.add(botonAniadir);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(112, 382, 90, 36);
		contentPane.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(206, 382, 89, 36);
		contentPane.add(btnEliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(583, 429, 89, 36);
		contentPane.add(btnSalir);
		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(583, 382, 89, 36);
		contentPane.add(btnCancelar);
		
		procesador = new ButtonGroup();
		procesador.add(rb1_1);
		procesador.add(rb1_2);
		JRadioButtonMenuItem rb1_3 = new JRadioButtonMenuItem("P4 Celeron");
		rb1_3.setBounds(10, 276, 133, 26);
		contentPane.add(rb1_3);
		procesador.add(rb1_3);
		
		JRadioButtonMenuItem rb1_4 = new JRadioButtonMenuItem("AMD 650");
		rb1_4.setBounds(10, 313, 133, 26);
		contentPane.add(rb1_4);
		
		JRadioButtonMenuItem rb2_1 = new JRadioButtonMenuItem("128Mb");
		rb2_1.setBounds(153, 202, 133, 26);
		contentPane.add(rb2_1);
		
		JRadioButtonMenuItem rb2_2 = new JRadioButtonMenuItem("256Mb");
		rb2_2.setBounds(153, 239, 133, 26);
		contentPane.add(rb2_2);
		
		JRadioButtonMenuItem rb2_3 = new JRadioButtonMenuItem("512Mb");
		rb2_3.setBounds(153, 276, 133, 26);
		contentPane.add(rb2_3);
		
		JRadioButtonMenuItem rb2_4 = new JRadioButtonMenuItem("1024Mb");
		rb2_4.setBounds(153, 313, 133, 26);
		contentPane.add(rb2_4);
		
		memoria=new ButtonGroup();
		memoria.add(rb2_1);
		memoria.add(rb2_2);
		memoria.add(rb2_3);
		memoria.add(rb2_4);
		
		JRadioButtonMenuItem rb4_1 = new JRadioButtonMenuItem("60Gb");
		rb4_1.setBounds(436, 202, 133, 26);
		contentPane.add(rb4_1);
		
		JRadioButtonMenuItem rb4_2 = new JRadioButtonMenuItem("80Gb");
		rb4_2.setBounds(436, 239, 133, 26);
		contentPane.add(rb4_2);
		
		JRadioButtonMenuItem rb4_3 = new JRadioButtonMenuItem("120Gb");
		rb4_3.setBounds(436, 276, 133, 26);
		contentPane.add(rb4_3);
		
		JRadioButtonMenuItem rb4_4 = new JRadioButtonMenuItem("200Gb");
		rb4_4.setBounds(436, 313, 133, 26);
		contentPane.add(rb4_4);
		
		discoDuro= new ButtonGroup();
		discoDuro.add(rb4_1);
		discoDuro.add(rb4_2);
		discoDuro.add(rb4_3);
		discoDuro.add(rb4_4);
		
		JRadioButtonMenuItem rb3_1 = new JRadioButtonMenuItem("15\"");
		rb3_1.setBounds(296, 202, 106, 26);
		contentPane.add(rb3_1);
		
		JRadioButtonMenuItem rb3_2 = new JRadioButtonMenuItem("17\"");
		rb3_2.setBounds(296, 239, 106, 26);
		contentPane.add(rb3_2);
		
		JRadioButtonMenuItem rb3_3 = new JRadioButtonMenuItem("TFT 15\"");
		rb3_3.setBounds(296, 276, 106, 26);
		contentPane.add(rb3_3);
		
		JRadioButtonMenuItem rb3_4 = new JRadioButtonMenuItem("TFT 17\"");
		rb3_4.setBounds(296, 313, 106, 26);
		contentPane.add(rb3_4);
		
		monitor= new ButtonGroup();
		monitor.add(rb3_1);
		monitor.add(rb3_2);
		monitor.add(rb3_3);
		monitor.add(rb3_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(495, 35, 201, 115);
		contentPane.add(textArea);
		
		btnSalir.addActionListener(accionSalir);
		btnCancelar.addActionListener(accionCancelar);
	}

	ActionListener accionSalir=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnSalir) {
				System.exit(0);
			}
		}
	};
	ActionListener accionCancelar=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnCancelar) {
				txtNombreCli.setText("");
			}
			
		}
	};
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

