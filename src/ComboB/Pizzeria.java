package ComboB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pizzeria {

	private JFrame frmPizzeria;
	private JSlider sliderC;
	private JComboBox BoxEs;
	private JRadioButton rdF;
	private JRadioButton rdS;
	private JRadioButton rdM;
	private JRadioButton rdG;
	private JLabel lblTotal;
	private JLabel lblOp;
	private JTextArea txtResumen;
	private JCheckBox chAl;
	private JCheckBox chAg;
	private JCheckBox chRe;
	private JCheckBox chPa;
	String especialiadad="Mexicana";
	String tamanio="";
	int total=0;
	int Cantidad=1;
	int precioPizza=0;
	String Tal1="";
	String Tal2="";
	String Tal3="";
	String Tal4="";
	int Precioa=0;
	int Preciob=0;
	int Precioc=0;
	int Preciod=0;
	int PrecioDef=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizzeria window = new Pizzeria();
					window.frmPizzeria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pizzeria() {
		initialize();
		
	}
	public void Rec() {
		
		 Cantidad=sliderC.getValue();
		lblOp.setText(""+Cantidad);
		switch(tamanio) {
		case "Grande $100":precioPizza=100;break;
		case "Misterio $120":precioPizza=120;break;
		case "Super $150":precioPizza=150;break;
		case "Fam $180":precioPizza=180;break;
		}
		switch(Tal1) {
		case "Refresco":Precioa=25;break;
		}
		switch(Tal2) {
		case "Agua":Preciob=15;break;
		}
		switch(Tal3) {
		case "Papas":Precioc=30;break;
		}
		switch(Tal4) {
		case "Alitas":Preciod=40;break;
		}
		PrecioDef=Precioa+Preciob+Precioc+Preciod;
		total=Cantidad*precioPizza+PrecioDef;
		txtResumen.setText(sliderC.getValue()+" Pizzas(s) "+tamanio
				+"\n de Especialidad "+especialiadad+
				"\n de Complemento "+PrecioDef);
		lblTotal.setText("$ "+total);
		
	}

	
		
	
	private void initialize() {
		frmPizzeria = new JFrame();
		frmPizzeria.setIconImage(Toolkit.getDefaultToolkit().getImage(Pizzeria.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmPizzeria.setTitle("Pizzeria");
		frmPizzeria.setBounds(100, 100, 485, 411);
		frmPizzeria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzeria.getContentPane().setLayout(null);
		
		txtResumen = new JTextArea();
		txtResumen.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtResumen.setBounds(125, 148, 148, 103);
		frmPizzeria.getContentPane().add(txtResumen);
		
		lblTotal = new JLabel("");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTotal.setBounds(230, 301, 217, 44);
		frmPizzeria.getContentPane().add(lblTotal);
		
		JLabel lblNewLabel = new JLabel("Pizzeria El Che");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(171, 11, 115, 24);
		frmPizzeria.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pizzeria.class.getResource("/ComboB/Pizza-icon1.png")));
		lblNewLabel_1.setBounds(274, 71, 185, 147);
		frmPizzeria.getContentPane().add(lblNewLabel_1);
		lblOp = new JLabel("");
		lblOp.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOp.setOpaque(true);
		lblOp.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblOp.setBounds(209, 61, 21, 26);
		frmPizzeria.getContentPane().add(lblOp);
		
		sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Rec();
			}
		});
		sliderC.setPaintTicks(true);
		sliderC.setValue(1);
		sliderC.setMinimum(1);
		sliderC.setMaximum(10);
		sliderC.setBounds(10, 61, 200, 26);
		frmPizzeria.getContentPane().add(sliderC);
		
		
		BoxEs = new JComboBox();
		BoxEs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				especialiadad=String.valueOf(BoxEs.getSelectedItem());
				Rec();
			}
		});
		BoxEs.setModel(new DefaultComboBoxModel(new String[] {"Mexiacana", "Peperoni", "Hawaiana", "Vegetariana"}));
		BoxEs.setBounds(10, 111, 200, 22);
		frmPizzeria.getContentPane().add(BoxEs);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 45, 95, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Especialidad");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(20, 86, 95, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_3);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Tamaño");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(20, 152, 67, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_4);
		
		rdG = new JRadioButton("Grande $100");
		rdG.setSelected(true);
		rdG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdG.isSelected()) {
					tamanio="Grande $100";
				}
				Rec();
			}
		});
		rdG.setBounds(10, 173, 109, 23);
		frmPizzeria.getContentPane().add(rdG);
		
		rdM = new JRadioButton("Misterio $120");
		rdM.setSelected(true);
		rdM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdM.isSelected()) {
					tamanio="Misterio $120";
				}
				Rec();
			}
		});
		rdM.setBounds(10, 199, 109, 23);
		frmPizzeria.getContentPane().add(rdM);
		
		rdS = new JRadioButton("Super $150");
		rdS.setSelected(true);
		rdS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdS.isSelected()) {
					tamanio="Super $150";
				}
				Rec();
			}
		});
		rdS.setBounds(10, 225, 109, 23);
		frmPizzeria.getContentPane().add(rdS);
		
		rdF = new JRadioButton("Fam $180");
		rdF.setSelected(true);
		rdF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdF.isSelected()) {
					tamanio="Fam $180";
				}
				Rec();
			}
		});
		rdF.setBounds(10, 251, 109, 23);
		frmPizzeria.getContentPane().add(rdF);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rdG);
		grupo.add(rdF);
		grupo.add(rdM);
		grupo.add(rdS);
		
		JLabel lblNewLabel_5 = new JLabel("Complementos");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(20, 280, 95, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_5);
		
		
		
		chRe = new JCheckBox("Refresco");
		chRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chRe.isSelected();
				Tal1="Refresco";
				Rec();
			}
		});
		chRe.setBounds(18, 301, 97, 23);
		frmPizzeria.getContentPane().add(chRe);
		
		chAg = new JCheckBox("Agua");
		chAg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chAg.isSelected();
				Tal2="Agua";
				Rec();
			}
		});
		chAg.setBounds(18, 327, 97, 23);
		frmPizzeria.getContentPane().add(chAg);
		
		chPa = new JCheckBox("Papas");
		chPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chPa.isSelected();
				Tal3="Papas";
				Rec();
			}
		});
		chPa.setBounds(113, 301, 97, 23);
		frmPizzeria.getContentPane().add(chPa);
		
		chAl = new JCheckBox("Alitas");
		chAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chAl.isSelected();
				Tal4="Alitas";
				Rec();
			}
		});
		chAl.setBounds(113, 327, 97, 23);
		frmPizzeria.getContentPane().add(chAl);
		
		lblTotal = new JLabel("");
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTotal.setBounds(230, 301, 217, 44);
		frmPizzeria.getContentPane().add(lblTotal);
		
		JLabel lblNewLabel_6 = new JLabel("Total a Pagar");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(298, 280, 95, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_6);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sliderC.setValue(1);
				lblOp.setText("");
				grupo.clearSelection();
				chRe.setSelected(false);
				chAg.setSelected(false);
				chPa.setSelected(false);
				chAl.setSelected(false);
				txtResumen.setText("");
				lblTotal.setText("");
				Precioa=0;
				Preciob=0;
				Precioc=0;
				Preciod=0;s
				total=0;
				Cantidad=1;
				precioPizza=0;
				PrecioDef=0;

				
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrar.setBounds(354, 14, 89, 23);
		frmPizzeria.getContentPane().add(btnBorrar);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("Resumen de Orden");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(139, 131, 130, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_7);
		
		
	}
}
