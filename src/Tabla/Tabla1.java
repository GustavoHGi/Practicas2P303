package Tabla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla1 {

	 JFrame frmRegistroJuegos;
	 private JTextField txtNP;
	 private JLabel lblNewLabel_1;
	 private JTextField txtTP;
	 private JScrollPane PanelExel;
	 private JTable tlbPoke;
	 private JButton btnTabla;
	 public DefaultTableModel modelo=new DefaultTableModel();
	 public ArrayList<Pokemon>listaPokemones=new ArrayList<Pokemon>();
	 private JButton btnAgregar;
	 private JButton btnBorrar;
	 private JLabel lblNewLabel_2;
	 private JTextField txtAño;
	 private JLabel lblNewLabel_3;
	 private JTextField txtGenero;
	 private JLabel lblNewLabel_4;
	 private JTextField txtClasi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Tabla1 window = new Tabla1();
					window.frmRegistroJuegos.setVisible(true);
				
	}

	/**
	 * Create the application.
	 */
	public Tabla1() {
		initialize();
	}

	public void borrarTabla() {
		listaPokemones.clear();
		actualizarTabla();
	}
	public void actualizarTabla() {
		while (modelo.getRowCount()>0) {
			modelo.removeRow(0);
		}
		for(Pokemon pokemon:listaPokemones) {
			Object o[]=new Object[5];
			o[0]=pokemon.getNombrePokemon();
			o[1]=pokemon.getTipoPokemon();
			o[2]=pokemon.getAño();
			o[3]=pokemon.getGenero();
			o[4]=pokemon.getClasificación();
			modelo.addRow(o);
			
		}
		tlbPoke.setModel(modelo);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroJuegos = new JFrame();
		frmRegistroJuegos.setIconImage(Toolkit.getDefaultToolkit().getImage(Tabla1.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmRegistroJuegos.setTitle("Registro de Juegos");
		frmRegistroJuegos.setBounds(100, 100, 413, 527);
		frmRegistroJuegos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroJuegos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre Juego");
		lblNewLabel.setBounds(10, 37, 167, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmRegistroJuegos.getContentPane().add(lblNewLabel);
		
		txtNP = new JTextField();
		txtNP.setBounds(155, 39, 160, 19);
		txtNP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNP.getText().length()>=20) {
					e.consume();
				}
			}
		});
		frmRegistroJuegos.getContentPane().add(txtNP);
		txtNP.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Marca Juego");
		lblNewLabel_1.setBounds(10, 83, 133, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmRegistroJuegos.getContentPane().add(lblNewLabel_1);
		
		txtTP = new JTextField();
		txtTP.setBounds(155, 85, 160, 19);
		frmRegistroJuegos.getContentPane().add(txtTP);
		txtTP.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pokemon Juego=new Pokemon();
				Juego.setNombrePokemon(txtNP.getText());
				Juego.setTipoPokemon(txtTP.getText());
				Juego.setAño(txtAño.getText());
				Juego.setGenero(txtGenero.getText());
				Juego.setClasificación(txtClasi.getText());
				listaPokemones.add(Juego);
				actualizarTabla();
			}
		});
		btnAgregar.setBounds(41, 250, 85, 21);
		frmRegistroJuegos.getContentPane().add(btnAgregar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNP.setText("");
				txtTP.setText("");
				txtAño.setText("");
				txtGenero.setText("");
				txtClasi.setText("");
				
			}
		});
		btnBorrar.setBounds(155, 250, 85, 21);
		frmRegistroJuegos.getContentPane().add(btnBorrar);
		
		PanelExel = new JScrollPane();
		PanelExel.setBounds(10, 281, 379, 181);
		frmRegistroJuegos.getContentPane().add(PanelExel);
		
		tlbPoke = new JTable();
		PanelExel.setViewportView(tlbPoke);
		modelo.addColumn("Nombre del Juego");
		modelo.addColumn("Marca del Juego");
		modelo.addColumn("Año");
		modelo.addColumn("Genero");
		modelo.addColumn("Clasificación");
		tlbPoke.setModel(modelo);
		
		
		btnTabla = new JButton("Borrar Tabla");
		btnTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTabla();
			}
		});
		btnTabla.setBounds(271, 250, 104, 21);
		frmRegistroJuegos.getContentPane().add(btnTabla);
		
		lblNewLabel_2 = new JLabel("Año");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 123, 60, 13);
		frmRegistroJuegos.getContentPane().add(lblNewLabel_2);
		
		txtAño = new JTextField();
		txtAño.setColumns(10);
		txtAño.setBounds(155, 122, 160, 19);
		frmRegistroJuegos.getContentPane().add(txtAño);
		
		lblNewLabel_3 = new JLabel("Genero");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 166, 94, 21);
		frmRegistroJuegos.getContentPane().add(lblNewLabel_3);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(155, 169, 160, 19);
		frmRegistroJuegos.getContentPane().add(txtGenero);
		
		lblNewLabel_4 = new JLabel("Clasificación");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 210, 116, 19);
		frmRegistroJuegos.getContentPane().add(lblNewLabel_4);
		
		txtClasi = new JTextField();
		txtClasi.setColumns(10);
		txtClasi.setBounds(155, 212, 160, 19);
		frmRegistroJuegos.getContentPane().add(txtClasi);
		frmRegistroJuegos.setLocationRelativeTo(null);
		
	}
}
