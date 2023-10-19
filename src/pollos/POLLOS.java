package pollos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class POLLOS {

	private JFrame frmLosPollosHermanos;
	private JTextField txtCantidad;
	private JLabel lblTipoDePollo;
	private JLabel lblTotal;
	private JRadioButton rdbRanchero;
	private JRadioButton rdbRostizado;
	String Tipo;
	int Total=0;
	int Precio=0;
	private JLabel lblTipoDePollo_1;
	private JTextPane txtpnPrecio;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POLLOS window = new POLLOS();
					window.frmLosPollosHermanos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public POLLOS() {
		initialize();
	}

	public void Rec() {
		
		switch (Tipo) {
		case "Rostizado":
			Precio=80;
			break;
		case "Ranchero":
			Precio=100;
			break;
		}
		int Cant=Integer.parseInt(txtCantidad.getText());
		Total=Cant*Precio;
		lblTotal.setText("Tu Orden es: "+Tipo+"    \nEl Total es: "+Total);
		}
	private void initialize() {
		frmLosPollosHermanos = new JFrame();
		frmLosPollosHermanos.setTitle("Los Pollos Hernanos");
		frmLosPollosHermanos.setBounds(100, 100, 728, 536);
		frmLosPollosHermanos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLosPollosHermanos.getContentPane().setLayout(null);
		frmLosPollosHermanos.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Los Pollos Hernanos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(196, 10, 306, 85);
		frmLosPollosHermanos.getContentPane().add(lblNewLabel);
		
		JLabel lblCantidadPollo = new JLabel("cuantos pollos vas a llevar?");
		lblCantidadPollo.setFont(new Font("Tahoma", Font. BOLD, 15));
		lblCantidadPollo.setBounds(68, 120, 234, 24);
		frmLosPollosHermanos.getContentPane().add(lblCantidadPollo);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(312, 125, 136, 19);
		frmLosPollosHermanos.getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		lblTipoDePollo = new JLabel("tipo de pollo que deseas");
		lblTipoDePollo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDePollo.setBounds(68, 154, 234, 24);
		frmLosPollosHermanos.getContentPane().add(lblTipoDePollo);
		
		lblTotal = new JLabel("");
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblTotal.setBounds(134, 286, 438, 186);
		frmLosPollosHermanos.getContentPane().add(lblTotal);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_3.setBounds(329, 244, 161, 26);
		frmLosPollosHermanos.getContentPane().add(lblNewLabel_3);
		
		rdbRostizado = new JRadioButton("Rostizado");
		rdbRostizado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbRostizado.isSelected()) {
					Tipo = "Rostizado";
				}
				Rec();
			}
		});
		rdbRostizado.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbRostizado.setBounds(78, 184, 152, 21);
		frmLosPollosHermanos.getContentPane().add(rdbRostizado);
		
		rdbRanchero = new JRadioButton("Ranchero");
		rdbRanchero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbRanchero.isSelected()) {
					Tipo = "Ranchero";
				}
				Rec();
			}
		});
		rdbRanchero.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbRanchero.setBounds(78, 214, 152, 21);
		frmLosPollosHermanos.getContentPane().add(rdbRanchero);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rdbRostizado);
		grupo.add(rdbRanchero);
		
		lblTipoDePollo_1 = new JLabel("tipo de pollo que deseas");
		lblTipoDePollo_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDePollo_1.setBounds(68, 154, 234, 24);
		frmLosPollosHermanos.getContentPane().add(lblTipoDePollo_1);
		
		txtpnPrecio = new JTextPane();
		txtpnPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnPrecio.setText("Precio de los pollos hermanos:  Pollo Rostizado 80$                    Pollo Ranchero 100$");
		txtpnPrecio.setBounds(488, 171, 214, 62);
		frmLosPollosHermanos.getContentPane().add(txtpnPrecio);

	}
}
