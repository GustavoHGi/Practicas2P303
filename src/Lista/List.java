package Lista;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class List {

	private JFrame frmLista;
	private JTextField textList;
	private JLabel lblNewLabel;
	private JList lstNombre;
	private JLabel lblH;
	DefaultListModel model=new DefaultListModel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List window = new List();
					window.frmLista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public List() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLista = new JFrame();
		frmLista.setIconImage(Toolkit.getDefaultToolkit().getImage(List.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmLista.setTitle("Lista");
		frmLista.setBounds(100, 100, 450, 300);
		frmLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLista.setLocationRelativeTo(null);
		frmLista.getContentPane().setLayout(null);
		
		lstNombre = new JList();
		lstNombre.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				lblH.setText("Hola "+lstNombre.getSelectedValue());
				String hex="#"+(String) lstNombre.getSelectedValue();
				Color color = Color.decode(hex);
				lblH.setBackground(color);
			}
		});
		lstNombre.setBounds(10, 108, 165, 145);
		frmLista.getContentPane().add(lstNombre);
		
		textList = new JTextField();
		textList.setBounds(10, 57, 165, 19);
		frmLista.getContentPane().add(textList);
		textList.setColumns(10);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 34, 117, 13);
		frmLista.getContentPane().add(lblNewLabel);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(textList.getText());
				lstNombre.setModel(model);
			}
		});
		btnAgregar.setBounds(10, 77, 85, 21);
		frmLista.getContentPane().add(btnAgregar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textList.setText("");
				model.clear();
				lstNombre.setModel(model);
				lblH.setText("");
			}
		});
		btnBorrar.setBounds(105, 77, 85, 21);
		frmLista.getContentPane().add(btnBorrar);
		
		lblH = new JLabel("");
		lblH.setOpaque(true);
		lblH.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblH.setBounds(226, 129, 159, 47);
		frmLista.getContentPane().add(lblH);
	}
}
