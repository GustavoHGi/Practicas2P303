package RedSOcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.management.modelmbean.ModelMBean;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


import javax.swing.table.DefaultTableModel;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

import miprimercrud.Alumno;
import miprimercrud.DataAlumno;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

public class crudUsuarioo {

	public JFrame CrudUsuario;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtPassword;
	private JTextField txtNombre;
	private JButton btnBorrar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	private JButton btnAgregar;
	private JLabel lblIDD;
	private JScrollPane tablass;
	private JTable tblUsuarios;
	ArrayList<Usuario> listaUsuario = null;
	DataUsuario da=new DataUsuario();
	public DefaultTableModel modelo = new DefaultTableModel();
	Usuario x = null;
	int fila = 0;
	int id = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crudUsuarioo window = new crudUsuarioo();
					window.CrudUsuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public crudUsuarioo() {
		initialize();
		actualizarTabla();
	}

	public void actualizarTabla() {
		DataUsuario da = new DataUsuario();

		while (modelo.getRowCount() > 0) {
			modelo.removeRow(0);
		}
		listaUsuario = da.selctUsuario();
		for (Usuario U: listaUsuario) {
			Object o[] = new Object[5];
			o[0] = U.getIdUser();
			o[1] = U.getCorreo();
			o[2] = U.getTelefono();
			o[3] = U.getPassword();
			o[4] = U.getNombre();
			

			modelo.addRow(o);

		}
		tblUsuarios.setModel(modelo);
	}
	
	private void initialize() {
		CrudUsuario = new JFrame();
		CrudUsuario.setBounds(100, 100, 717, 654);
		CrudUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CrudUsuario.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id user");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(34, 10, 81, 39);
		CrudUsuario.getContentPane().add(lblNewLabel);
		
		lblIDD = new JLabel("");
		lblIDD.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblIDD.setBounds(125, 10, 91, 39);
		CrudUsuario.getContentPane().add(lblIDD);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCorreo.setBounds(34, 59, 81, 39);
		CrudUsuario.getContentPane().add(lblCorreo);
		
		
		
		txtCorreo = new JTextField();
		txtCorreo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCorreo.getText().length()>=100) {
					e.consume();
				}
				
			}
		});
		txtCorreo.setBounds(125, 71, 246, 19);
		CrudUsuario.getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtTelefono.getText().length()>=100) {
					e.consume();
				}
			}
		});
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(125, 124, 246, 19);
		CrudUsuario.getContentPane().add(txtTelefono);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelefono.setBounds(34, 112, 81, 39);
		CrudUsuario.getContentPane().add(lblTelefono);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(34, 161, 81, 39);
		CrudUsuario.getContentPane().add(lblPassword);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombre.setBounds(34, 216, 81, 39);
		CrudUsuario.getContentPane().add(lblNombre);
		
		txtPassword = new JTextField();
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPassword.getText().length()>=100) {
					e.consume();
				}
			}
		});
		txtPassword.setColumns(10);
		txtPassword.setBounds(125, 173, 246, 19);
		CrudUsuario.getContentPane().add(txtPassword);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNombre.getText().length()>=100) {
					e.consume();
				}
			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(125, 228, 246, 19);
		CrudUsuario.getContentPane().add(txtNombre);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario x = new Usuario();
					x.setCorreo(txtCorreo.getText());
					x.setTelefono(txtTelefono.getText());
					x.setPassword(encriptarPassword(txtPassword.getText()));
					x.setNombre(txtNombre.getText());
					

					if (x.insertarUsuario()) {
						JOptionPane.showMessageDialog(null, "Se Inserto Correctamente");
						actualizarTabla();
						limpiarFormulario();

					} else {
						JOptionPane.showMessageDialog(null, "Error");
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error");
				}

			}
		});
			
		
		
		btnAgregar.setIcon(new ImageIcon(crudUsuarioo.class.getResource("/RedSOcial/OIP.ico")));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAgregar.setBounds(424, 35, 148, 47);
		CrudUsuario.getContentPane().add(btnAgregar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					x.setCorreo(txtCorreo.getText());
					x.setTelefono(txtTelefono.getText());
					x.setPassword(encriptarPassword(txtPassword.getText()));
					x.setNombre(txtNombre.getText());
					

					if (x.ActualizarUsuario()) {
						JOptionPane.showMessageDialog(null, "Se actualizo Correctamente");
						actualizarTabla();
						limpiarFormulario();

					} else {
						JOptionPane.showMessageDialog(null, "Error");
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error");
				}

			}

		});
			
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnActualizar.setBounds(424, 92, 148, 39);
		CrudUsuario.getContentPane().add(btnActualizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int op = JOptionPane.showConfirmDialog(null, "estas seguro de eliminar este registro?", "ELIMINAR",
							JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
					
					if (op == 0) {
						if (x.eliminarUsuario()) {
							JOptionPane.showMessageDialog(null, "Se elimino Correctamente");
							actualizarTabla();
							limpiarFormulario();
							x=null;
						} else {
							JOptionPane.showMessageDialog(null, "ERROR");
						}
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Se elimino correctamente");
				}
			}
		});
				
			
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEliminar.setBounds(424, 153, 148, 39);
		CrudUsuario.getContentPane().add(btnEliminar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBorrar.setBounds(424, 214, 148, 39);
		CrudUsuario.getContentPane().add(btnBorrar);
		
		tablass = new JScrollPane();
		tablass.setBounds(34, 280, 626, 279);
		CrudUsuario.getContentPane().add(tablass);
		
		tblUsuarios = new JTable();
		tblUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fila = tblUsuarios.getSelectedRow();
				x = listaUsuario.get(fila);
				lblIDD.setText("" + x.getIdUser());
				txtCorreo.setText(x.getCorreo());
				txtTelefono.setText(x.getTelefono());
				txtPassword.setText(x.getPassword());
				txtNombre.setText(x.getNombre());
			}
		});
		actualizarTabla();
			modelo.addColumn("ID USER");
			modelo.addColumn("CORREO");
			modelo.addColumn("TELEFONO");
			modelo.addColumn("PASSWORD");
			modelo.addColumn("NOMBRE");
			tblUsuarios.setModel(modelo);
			actualizarTabla();
		tablass.setViewportView(tblUsuarios);
		
		
	
	}
	public void limpiarFormulario() {
		lblIDD.setText("");
		txtCorreo.setText("");
		txtTelefono.setText("");
		txtPassword.setText("");
		txtNombre.setText("");
		

	}
	public String encriptarPassword (String password) {
		MessageDigest md;
		byte[] encoded=null;
		try {
			md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
			md.update(password.getBytes());
		      byte[] digest = md.digest();

		      // Se escribe byte a byte en hexadecimal
		      for (byte b : digest) {
		         //System.out.print(Integer.toHexString(0xFF & b));
		      }
		      System.out.println();

		      // Se escribe codificado base 64. Se necesita la librería
		      // commons-codec-x.x.x.jar de Apache
		      encoded = Base64.encodeBase64(digest);
		      //System.out.println(new String(encoded));
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(encoded);
	}
	
}
