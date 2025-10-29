package ejercicioVentaOrdenadores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

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
	private JRadioButtonMenuItem rb1_1, rb1_2, rb1_3,rb1_4, rb2_1, rb2_2, rb2_3, rb2_4, rb3_1, rb3_2, rb3_3, rb3_4, rb4_1, rb4_2, rb4_3, rb4_4;
	private JComboBox comboBox;
	private JList clientes;
	private JCheckBox chckbxGrabadora, chckbxWifi, chckbxSintonizadorTv, chckbxBackupRestore;
	private JScrollPane desliz;
	private DefaultListModel<String> listaModelClientes;
	private ArrayList<Venta> listaVentas = new ArrayList<>();


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
		
		comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(new Color(255, 128, 192)));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Villalba", "Alpedrete", "Galapagar", "Moralzarzal", "Guadarrama"}));
		comboBox.setBounds(189, 110, 106, 22);
		contentPane.add(comboBox);
		
		txtNombreCli = new JTextField();
		txtNombreCli.setBorder(new LineBorder(new Color(255, 128, 192)));
		txtNombreCli.setBounds(189, 32, 155, 20);
		contentPane.add(txtNombreCli);
		
		txtNombreCli.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        if (txtNombreCli.getText().length() >= 15) { // límite de caracteres
		            e.consume(); 
		        }
		    }
		});
		
		txtNombreCli.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (!txtNombreCli.getText().trim().isEmpty()) {
		            activarComponentesVenta();
		        }
		    }
		});
		txtNombreCli.setColumns(10);
		
		//jlabels
		
		JLabel lblNewLabel_1 = new JLabel("Lista de clientes");
		lblNewLabel_1.setBounds(391, 35, 101, 14);
		contentPane.add(lblNewLabel_1);
		
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
		
		//checkbox
		
		chckbxGrabadora = new JCheckBox("Grabadora DVD");
		chckbxGrabadora.setBounds(547, 209, 125, 23);
		contentPane.add(chckbxGrabadora);
		
		chckbxWifi = new JCheckBox("WiFi");
		chckbxWifi.setBounds(547, 236, 125, 23);
		contentPane.add(chckbxWifi);
		
		chckbxSintonizadorTv = new JCheckBox("Sintonizador TV");
		chckbxSintonizadorTv.setBounds(547, 262, 153, 23);
		contentPane.add(chckbxSintonizadorTv);
		
		chckbxBackupRestore = new JCheckBox("Backup/Restore");
		chckbxBackupRestore.setBounds(547, 288, 153, 23);
		contentPane.add(chckbxBackupRestore);
		
		//botones
		botonAniadir = new JButton("Añadir");
		botonAniadir.setBounds(10, 382, 97, 36);
		contentPane.add(botonAniadir);
		botonAniadir.addActionListener(accionAniadir);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(112, 382, 90, 36);
		contentPane.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(206, 382, 89, 36);
		contentPane.add(btnEliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(583, 429, 89, 36);
		contentPane.add(btnSalir);
		btnSalir.addActionListener(accionSalir);
		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(583, 382, 89, 36);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(accionCancelar);
		
		
		//radiobuttons
		procesador = new ButtonGroup();
		rb1_1 = new JRadioButtonMenuItem("P4 3.0Gb");
		rb1_1.setBounds(10, 202, 133, 26);
		contentPane.add(rb1_1);
		
		rb1_2 = new JRadioButtonMenuItem("P4 3.2Gb");
		rb1_2.setBounds(10, 239, 133, 26);
		contentPane.add(rb1_2);
		
		rb1_3 = new JRadioButtonMenuItem("P4 Celeron");
		rb1_3.setBounds(10, 276, 133, 26);
		contentPane.add(rb1_3);
		
		
		rb1_4 = new JRadioButtonMenuItem("AMD 650");
		rb1_4.setBounds(10, 313, 133, 26);
		contentPane.add(rb1_4);
		
		procesador.add(rb1_1);
		procesador.add(rb1_2);
		procesador.add(rb1_3);
		procesador.add(rb1_4);
		
		rb2_1 = new JRadioButtonMenuItem("128Mb");
		rb2_1.setBounds(153, 202, 133, 26);
		contentPane.add(rb2_1);
		
		rb2_2 = new JRadioButtonMenuItem("256Mb");
		rb2_2.setBounds(153, 239, 133, 26);
		contentPane.add(rb2_2);
		
		rb2_3 = new JRadioButtonMenuItem("512Mb");
		rb2_3.setBounds(153, 276, 133, 26);
		contentPane.add(rb2_3);
		
		rb2_4 = new JRadioButtonMenuItem("1024Mb");
		rb2_4.setBounds(153, 313, 133, 26);
		contentPane.add(rb2_4);
		
		memoria=new ButtonGroup();
		memoria.add(rb2_1);
		memoria.add(rb2_2);
		memoria.add(rb2_3);
		memoria.add(rb2_4);
		
		rb4_1 = new JRadioButtonMenuItem("60Gb");
		rb4_1.setBounds(436, 202, 133, 26);
		contentPane.add(rb4_1);
		
		rb4_2 = new JRadioButtonMenuItem("80Gb");
		rb4_2.setBounds(436, 239, 133, 26);
		contentPane.add(rb4_2);
		
		rb4_3 = new JRadioButtonMenuItem("120Gb");
		rb4_3.setBounds(436, 276, 133, 26);
		contentPane.add(rb4_3);
		
		rb4_4 = new JRadioButtonMenuItem("200Gb");
		rb4_4.setBounds(436, 313, 133, 26);
		contentPane.add(rb4_4);
		
		discoDuro= new ButtonGroup();
		discoDuro.add(rb4_1);
		discoDuro.add(rb4_2);
		discoDuro.add(rb4_3);
		discoDuro.add(rb4_4);
		
		rb3_1 = new JRadioButtonMenuItem("15\"");
		rb3_1.setBounds(296, 202, 106, 26);
		contentPane.add(rb3_1);
		
		rb3_2 = new JRadioButtonMenuItem("17\"");
		rb3_2.setBounds(296, 239, 106, 26);
		contentPane.add(rb3_2);
		
		rb3_3 = new JRadioButtonMenuItem("TFT 15\"");
		rb3_3.setBounds(296, 276, 106, 26);
		contentPane.add(rb3_3);
		
		rb3_4 = new JRadioButtonMenuItem("TFT 17\"");
		rb3_4.setBounds(296, 313, 106, 26);
		contentPane.add(rb3_4);
		
		monitor= new ButtonGroup();
		monitor.add(rb3_1);
		monitor.add(rb3_2);
		monitor.add(rb3_3);
		monitor.add(rb3_4);
		
		listaModelClientes = new DefaultListModel<>();
		clientes = new JList<>(listaModelClientes);
		desliz = new JScrollPane(clientes);
		desliz.setBounds(495, 35, 201, 115);
		contentPane.add(desliz);
		
		
		desactivarComponentes(contentPane);//desactivo los componentes que quiero al iniciar
		
	}

	//método para activar los componentes
	
	private void activarComponentesVenta() {

	    comboBox.setEnabled(true);

	    // Configuración inventada
	    rb1_2.setSelected(true);
	    rb2_4.setSelected(true); 
	    rb3_4.setSelected(true); 
	    rb4_4.setSelected(true); 

	    chckbxGrabadora.setSelected(true);
	    chckbxWifi.setSelected(true);

	    //activo los componentes
	    rb1_1.setEnabled(true);
	    rb1_2.setEnabled(true);
	    rb1_3.setEnabled(true);
	    rb1_4.setEnabled(true);

	    rb2_1.setEnabled(true);
	    rb2_2.setEnabled(true);
	    rb2_3.setEnabled(true);
	    rb2_4.setEnabled(true);

	    rb3_1.setEnabled(true);
	    rb3_2.setEnabled(true);
	    rb3_3.setEnabled(true);
	    rb3_4.setEnabled(true);

	    rb4_1.setEnabled(true);
	    rb4_2.setEnabled(true);
	    rb4_3.setEnabled(true);
	    rb4_4.setEnabled(true);

	    chckbxGrabadora.setEnabled(true);
	    chckbxWifi.setEnabled(true);
	    chckbxSintonizadorTv.setEnabled(true);
	    chckbxBackupRestore.setEnabled(true);

	    botonAniadir.setEnabled(true);
	    btnBuscar.setEnabled(true);

	    // foco localidad
	    comboBox.requestFocusInWindow();
	}
	
	//método para desactivar los componentes
	
	private void desactivarComponentes(Container contenedor) {
	    for (Component c : contenedor.getComponents()) {
	        if (c instanceof Container) {
	            desactivarComponentes((Container) c);
	        }

	        //no quiero desactivar esto
	        if (c == txtNombreCli || c instanceof JTextArea || c == btnCancelar || c == btnSalir) {
	            c.setEnabled(true);
	        } else {
	            c.setEnabled(false);
	        }
	    }
	}
	
	ActionListener accionAniadir = new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        String nombre = txtNombreCli.getText();
	        if (!nombre.isEmpty()) {
	            listaModelClientes.addElement(nombre);
	            txtNombreCli.setText("");
	            txtNombreCli.requestFocusInWindow();
	        } else {
	            JOptionPane.showMessageDialog(null, "El campo está vacío", "Aviso", JOptionPane.WARNING_MESSAGE);
	        }
	    }
	};
	
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

