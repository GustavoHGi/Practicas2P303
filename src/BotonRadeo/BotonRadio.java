package BotonRadeo;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BotonRadio {

	private JFrame frmBotonRadio;
	private JRadioButton RadAzul;
	private JRadioButton RadVerde;
	private JRadioButton RadRojo;
	private JLabel lblColor;
	private JRadioButton RadRosa;
	private JRadioButton RadNegro;
	private JRadioButton RadAmarillo;
	private JRadioButton RadCafe;
	private JRadioButton RadMorado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonRadio window = new BotonRadio();
					window.frmBotonRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BotonRadio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonRadio = new JFrame();
		frmBotonRadio.setTitle("Boton Radio");
		frmBotonRadio.setIconImage(Toolkit.getDefaultToolkit().getImage(BotonRadio.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmBotonRadio.setBounds(100, 100, 450, 300);
		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonRadio.getContentPane().setLayout(null);
		frmBotonRadio.setLocationRelativeTo(null);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblColor.setBounds(210, 23, 190, 206);
		frmBotonRadio.getContentPane().add(lblColor);
		
		RadRojo = new JRadioButton("Rojo");
		RadRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.red);
			}
			
		});
		RadRojo.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadRojo.setBounds(20, 23, 109, 23);
		frmBotonRadio.getContentPane().add(RadRojo);
		
		RadVerde = new JRadioButton("Verde");
		RadVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.green);
			}
		});
		RadVerde.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadVerde.setBounds(20, 49, 109, 23);
		frmBotonRadio.getContentPane().add(RadVerde);
		
		RadAzul = new JRadioButton("Azul");
		RadAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.BLUE);
			}
		});
		RadAzul.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadAzul.setBounds(20, 75, 109, 23);
		frmBotonRadio.getContentPane().add(RadAzul);
		
		RadRosa = new JRadioButton("Rosa");
		RadRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.pink);
			}
		});
		RadRosa.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadRosa.setBounds(20, 101, 109, 23);
		frmBotonRadio.getContentPane().add(RadRosa);
		
		RadNegro = new JRadioButton("Negro");
		RadNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.BLACK);
			}
			
		});
		RadNegro.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadNegro.setBounds(20, 129, 109, 23);
		frmBotonRadio.getContentPane().add(RadNegro);
		
		RadAmarillo = new JRadioButton("Amarillo");
		RadAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.yellow);
			}
		});
		RadAmarillo.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadAmarillo.setBounds(20, 160, 109, 23);
		frmBotonRadio.getContentPane().add(RadAmarillo);
		
		RadCafe = new JRadioButton("Cafe");
		RadCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(new Color(128, 64, 0));
			}
		});
		RadCafe.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadCafe.setBounds(20, 188, 109, 23);
		frmBotonRadio.getContentPane().add(RadCafe);
		
		RadMorado = new JRadioButton("Morado");
		RadMorado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(new Color(128,0,128));
			}
		});
		RadMorado.setFont(new Font("Tahoma", Font.BOLD, 13));
		RadMorado.setBounds(20, 220, 109, 23);
		frmBotonRadio.getContentPane().add(RadMorado);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(RadRojo);
		grupo.add(RadAzul);
		grupo.add(RadVerde);
		grupo.add(RadRosa);
		grupo.add(RadNegro);
		grupo.add(RadAmarillo);
		grupo.add(RadCafe);
		grupo.add(RadMorado);
	}
}
