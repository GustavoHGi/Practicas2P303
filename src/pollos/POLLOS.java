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

public class POLLOS {

	private JFrame frmLosPollosHermanos;
	private JTextField txtCantidad;
	private JLabel lblTipoDePollo;
	private JLabel lblTotal;
	private JRadioButton rdbtnRanchero;
	private JRadioButton rdbRostizado;
	String Tipo;
	int Total=0;
	int Precio=0;
	private JLabel lblTipoDePollo_1;
	private JLabel lblPrecioDeLos;
	private JLabel lblPolloRostizado;
	private JLabel lblPolloRanchero;
	

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
		
		rdbtnRanchero = new JRadioButton("Ranchero");
		rdbtnRanchero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRanchero.isSelected()) {
					Tipo = "Ranchero";
				}
				Rec();
			}
		});
		rdbtnRanchero.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnRanchero.setBounds(78, 214, 152, 21);
		frmLosPollosHermanos.getContentPane().add(rdbtnRanchero);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rdbRostizado);
		grupo.add(rdbtnRanchero);
		
		lblTipoDePollo_1 = new JLabel("tipo de pollo que deseas");
		lblTipoDePollo_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDePollo_1.setBounds(68, 154, 234, 24);
		frmLosPollosHermanos.getContentPane().add(lblTipoDePollo_1);
		
		lblPrecioDeLos = new JLabel("precio de los pollos hermanos:");
		lblPrecioDeLos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrecioDeLos.setBounds(470, 77, 234, 24);
		frmLosPollosHermanos.getContentPane().add(lblPrecioDeLos);
		
		lblPolloRostizado = new JLabel("Pollo Rostizado 80$$");
		lblPolloRostizado.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPolloRostizado.setBounds(470, 105, 234, 24);
		frmLosPollosHermanos.getContentPane().add(lblPolloRostizado);
		
		lblPolloRanchero = new JLabel("Pollo Ranchero 100$$");
		lblPolloRanchero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPolloRanchero.setBounds(470, 139, 234, 24);
		frmLosPollosHermanos.getContentPane().add(lblPolloRanchero);

	}
}
