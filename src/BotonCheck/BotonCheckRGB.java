package BotonCheck;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BotonCheckRGB {

	private JFrame frmCheckbox;
	private JLabel lblColor;
	private JCheckBox BoxAzul;
	private JCheckBox BoxVerde;
	private JCheckBox BoxRojo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonCheckRGB window = new BotonCheckRGB();
					window.frmCheckbox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BotonCheckRGB() {
		initialize();
	}
	public void asignarColor() {
		int R=(BoxRojo.isSelected())?255:0;
		int G=(BoxVerde.isSelected())?255:0;
		int A=(BoxAzul.isSelected())?255:0;
		lblColor.setBackground(new Color(R,G,A));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckbox = new JFrame();
		frmCheckbox.setIconImage(Toolkit.getDefaultToolkit().getImage(BotonCheckRGB.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmCheckbox.setTitle("CheckBox");
		frmCheckbox.setBounds(100, 100, 359, 221);
		frmCheckbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckbox.getContentPane().setLayout(null);
		frmCheckbox.setLocationRelativeTo(null);
		
		BoxRojo = new JCheckBox("Rojo");
		BoxRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		BoxRojo.setBounds(6, 19, 97, 23);
		frmCheckbox.getContentPane().add(BoxRojo);
		
		BoxVerde = new JCheckBox("Verde");
		BoxVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		BoxVerde.setBounds(6, 45, 97, 23);
		frmCheckbox.getContentPane().add(BoxVerde);
		
		BoxAzul = new JCheckBox("Azul");
		BoxAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		BoxAzul.setBounds(6, 71, 97, 23);
		frmCheckbox.getContentPane().add(BoxAzul);
		
		lblColor = new JLabel("");
		lblColor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblColor.setOpaque(true);
		lblColor.setBounds(186, 11, 145, 151);
		frmCheckbox.getContentPane().add(lblColor);
	}
}
