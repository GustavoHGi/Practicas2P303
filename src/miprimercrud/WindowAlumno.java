package miprimercrud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Tabla.Pokemon;

import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowAlumno {

	public JFrame frmFormularioAlumno;
	public DefaultTableModel modelo=new DefaultTableModel();
	 public ArrayList<Alumno>listaPokemones=new ArrayList<Alumno>();
	private JTextField textNc;
	private JTextField textnom;
	private JTextField textAm;
	private JTextField textAp;
	private JTextField textCurp;
	private JTextField textFn;
	private JTextField textDic;
	private JTextField textTel;
	private JTextField textCorreo;
	private JTextField textGrup;
	private JTextField textCarre;
	private JTable tbA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		WindowAlumno window = new WindowAlumno();
		window.frmFormularioAlumno.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public WindowAlumno() {
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
		for(Alumno pokemon:listaPokemones) {
			Object o[]=new Object[12];
			o[0]=pokemon.getId();
			o[1]=pokemon.getNumcontrol();
			o[2]=pokemon.getNombre();
			o[3]=pokemon.getApellidom();
			o[4]=pokemon.getApellidop();
			o[5]=pokemon.getCurp();
			o[6]=pokemon.getFecha();
			o[7]=pokemon.getDireccion();
			o[8]=pokemon.getTelefono();
			o[9]=pokemon.getCorreo();
			o[10]=pokemon.getGrupo();
			o[11]=pokemon.getCarrea();
			
					
					
			
			modelo.addRow(o);
			
		}
		tbA.setModel(modelo);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormularioAlumno = new JFrame();
		frmFormularioAlumno.setIconImage(Toolkit.getDefaultToolkit().getImage(WindowAlumno.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmFormularioAlumno.setTitle("Formulario Alumno");
		frmFormularioAlumno.setBounds(100, 100, 1322, 682);
		frmFormularioAlumno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormularioAlumno.getContentPane().setLayout(null);
		frmFormularioAlumno.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Numero de control");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(23, 102, 158, 33);
		frmFormularioAlumno.getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(242, 30, 72, 33);
		frmFormularioAlumno.getContentPane().add(lblNombre);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblId.setBounds(62, 30, 40, 33);
		frmFormularioAlumno.getContentPane().add(lblId);
		
		JLabel lblApellidoM = new JLabel("Apellido M");
		lblApellidoM.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellidoM.setBounds(242, 102, 88, 33);
		frmFormularioAlumno.getContentPane().add(lblApellidoM);
		
		JLabel lblApellidoP = new JLabel("Apellido P");
		lblApellidoP.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellidoP.setBounds(422, 30, 88, 33);
		frmFormularioAlumno.getContentPane().add(lblApellidoP);
		
		JLabel lblCurp = new JLabel("curp");
		lblCurp.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurp.setBounds(437, 102, 48, 33);
		frmFormularioAlumno.getContentPane().add(lblCurp);
		
		JLabel lblFechaDeNacimiento = new JLabel("fecha de nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFechaDeNacimiento.setBounds(583, 30, 154, 33);
		frmFormularioAlumno.getContentPane().add(lblFechaDeNacimiento);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDireccion.setBounds(608, 102, 88, 33);
		frmFormularioAlumno.getContentPane().add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTelefono.setBounds(831, 30, 88, 33);
		frmFormularioAlumno.getContentPane().add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCorreo.setBounds(831, 102, 65, 33);
		frmFormularioAlumno.getContentPane().add(lblCorreo);
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGrupo.setBounds(1045, 30, 88, 33);
		frmFormularioAlumno.getContentPane().add(lblGrupo);
		
		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarrera.setBounds(1045, 102, 88, 33);
		frmFormularioAlumno.getContentPane().add(lblCarrera);
		
		textNc = new JTextField();
		textNc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textNc.getText().length()>=14) {
					e.consume();				}
			}
		});
		textNc.setBounds(23, 160, 128, 19);
		frmFormularioAlumno.getContentPane().add(textNc);
		textNc.setColumns(10);
		
		textnom = new JTextField();
		textnom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textnom.getText().length()>=30) {
					e.consume();
				}
			}
		});
		textnom.setBounds(218, 73, 145, 19);
		frmFormularioAlumno.getContentPane().add(textnom);
		textnom.setColumns(10);
		
		textAm = new JTextField();
		textAm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textAm.getText().length()>=30) {
					e.consume();
				}
			}
		});
		textAm.setBounds(218, 160, 145, 19);
		frmFormularioAlumno.getContentPane().add(textAm);
		textAm.setColumns(10);
		
		textAp = new JTextField();
		textAp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textAp.getText().length()>=30) {
					e.consume();
				}
			}
		});
		textAp.setBounds(407, 73, 135, 19);
		frmFormularioAlumno.getContentPane().add(textAp);
		textAp.setColumns(10);
		
		textCurp = new JTextField();
		textCurp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textCurp.getText().length()>=18) {
					e.consume();
				}
			}
		});
		textCurp.setColumns(10);
		textCurp.setBounds(407, 160, 135, 19);
		frmFormularioAlumno.getContentPane().add(textCurp);
		
		textFn = new JTextField();
		textFn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textFn.getText().length()>=100) {
					e.consume();
				}
			}
		});
		textFn.setColumns(10);
		textFn.setBounds(583, 73, 154, 19);
		frmFormularioAlumno.getContentPane().add(textFn);
		
		textDic = new JTextField();
		textDic.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textDic.getText().length()>=100) {
					e.consume();
				}
			}
		});
		textDic.setColumns(10);
		textDic.setBounds(583, 160, 154, 19);
		frmFormularioAlumno.getContentPane().add(textDic);
		
		textTel = new JTextField();
		textTel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textTel.getText().length()>=10) {
					e.consume();
				}
			}
		});
		textTel.setColumns(10);
		textTel.setBounds(796, 73, 154, 19);
		frmFormularioAlumno.getContentPane().add(textTel);
		
		textCorreo = new JTextField();
		textCorreo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textCorreo.getText().length()>=100) {
					e.consume();
				}
			}
		});
		textCorreo.setColumns(10);
		textCorreo.setBounds(796, 160, 154, 19);
		frmFormularioAlumno.getContentPane().add(textCorreo);
		
		textGrup = new JTextField();
		textGrup.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textGrup.getText().length()>=50) {
					e.consume();
				}
			}
		});
		textGrup.setColumns(10);
		textGrup.setBounds(990, 73, 178, 19);
		frmFormularioAlumno.getContentPane().add(textGrup);
		
		textCarre = new JTextField();
		textCarre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textCarre.getText().length()>=50) {
					e.consume();
				}
			}
		});
		textCarre.setColumns(10);
		textCarre.setBounds(990, 160, 178, 19);
		frmFormularioAlumno.getContentPane().add(textCarre);
		
		JScrollPane TablaExel = new JScrollPane();
		TablaExel.setBounds(118, 304, 965, 301);
		frmFormularioAlumno.getContentPane().add(TablaExel);
		
		tbA = new JTable();
		TablaExel.setViewportView(tbA);
		modelo.addColumn("id");
		modelo.addColumn("Numero de Control");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido M");
		modelo.addColumn("Apellido P");
		modelo.addColumn("Curp");
		modelo.addColumn("Fecha N");
		modelo.addColumn("Direccion");
		modelo.addColumn("Telefono");
		modelo.addColumn("Correo");
		modelo.addColumn("Grupo");
		modelo.addColumn("Carrera");
		tbA.setModel(modelo);
		
		
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alumno x=new Alumno();
				x.setNumcontrol(textNc.getText());
				x.setNombre(textnom.getText());
				x.setApellidom(textAm.getText());
				x.setApellidop(textAp.getText());
				x.setCurp(textCurp.getText());
				x.setNombre(textFn.getText());
				x.setNombre(textDic.getText());
				x.setNombre(textTel.getText());
				x.setNombre(textCorreo.getText());
				x.setNombre(textGrup.getText());
				x.setNombre(textCarre.getText());
				if(x.insertarAlumno()) {
					JOptionPane.showMessageDialog(null,"Se Inserto Correctamente");
				}else {
					JOptionPane.showMessageDialog(null,"Error");
				}
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAgregar.setBounds(129, 227, 157, 33);
		frmFormularioAlumno.getContentPane().add(btnAgregar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBorrar.setBounds(486, 227, 157, 33);
		frmFormularioAlumno.getContentPane().add(btnBorrar);
		
		JButton btnBorrartabla = new JButton("BorrarTabla");
		btnBorrartabla.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBorrartabla.setBounds(876, 227, 157, 33);
		frmFormularioAlumno.getContentPane().add(btnBorrartabla);
		
		JLabel lblId_1 = new JLabel("Id");
		lblId_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblId_1.setBounds(62, 76, 40, 33);
		frmFormularioAlumno.getContentPane().add(lblId_1);
	}
}
