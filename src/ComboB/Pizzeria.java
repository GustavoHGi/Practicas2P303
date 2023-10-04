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
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

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
	String especialiadad = "Mexicana";
	String tamanio = "";
	int total = 0;
	int Cantidad = 1;
	int precioPizza = 0;
	int PrecioC=0;
	String Tal1 = "";
	String Tal2 = "";
	String Tal3 = "";
	String Tal4 = "";
	String Tal5 = "";
	private JCheckBox chCer;
	
	

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

		lblOp.setText("" + Cantidad);
		switch (tamanio) {
		case "Grande $100":
			precioPizza = 100;
			break;
		case "Misterio $120":
			precioPizza = 120;
			break;
		case "Super $150":
			precioPizza = 150;
			break;
		case "Fam $180":
			precioPizza = 180;
			break;
		}
		
	
			
		
		
		total = (Cantidad * precioPizza)+ PrecioC ;
		txtResumen.setText(
				"CANTIDAD: "+ sliderC.getValue() + "\nTamaño: " + tamanio 
				+ "\n de Especialidad " + especialiadad
				+ "\n de Complemento\n "+Tal1+"\n"+Tal2+"\n"+Tal3+"\n"+Tal4+"\n"+Tal5 );
		
		DecimalFormat Fot=new DecimalFormat("#.00");
		lblTotal.setText("$ " +Fot.format (total)+" MXN");

	}

	private void initialize() {
		frmPizzeria = new JFrame();
		frmPizzeria.setIconImage(Toolkit.getDefaultToolkit().getImage(Pizzeria.class.getResource("/ComboB/Pizza-icon.png")));
		frmPizzeria.setTitle("Pizzeria");
		frmPizzeria.setBounds(100, 100, 485, 533);
		frmPizzeria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzeria.getContentPane().setLayout(null);
		frmPizzeria.setLocationRelativeTo(null);

		txtResumen = new JTextArea();
		txtResumen.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtResumen.setBounds(269, 300, 159, 179);
		frmPizzeria.getContentPane().add(txtResumen);

		

		JLabel lblNewLabel = new JLabel("Pizzeria El Che");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(171, 11, 115, 24);
		frmPizzeria.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pizzeria.class.getResource("/ComboB/Pizza-icon1.png")));
		lblNewLabel_1.setBounds(269, 46, 190, 160);
		frmPizzeria.getContentPane().add(lblNewLabel_1);
		lblOp = new JLabel((String) null);
		lblOp.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOp.setOpaque(true);
		lblOp.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblOp.setBounds(209, 61, 21, 26);
		frmPizzeria.getContentPane().add(lblOp);

		lblTotal = new JLabel("");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTotal.setBounds(113, 204, 217, 44);
		frmPizzeria.getContentPane().add(lblTotal);
		
		sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Cantidad = sliderC.getValue();
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
				especialiadad = String.valueOf(BoxEs.getSelectedItem());
				Rec();
			}
		});
		BoxEs.setModel(new DefaultComboBoxModel(new String[] { "Mexiacana", "Peperoni", "Hawaiana", "Vegetariana" }));
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
				if (rdG.isSelected()) {
					tamanio = "Grande $100";
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
				if (rdM.isSelected()) {
					tamanio = "Misterio $120";
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
				if (rdS.isSelected()) {
					tamanio = "Super $150";
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
				if (rdF.isSelected()) {
					tamanio = "Fam $180";
				}
				Rec();
			}
		});
		rdF.setBounds(10, 251, 109, 23);
		frmPizzeria.getContentPane().add(rdF);
		ButtonGroup grupo = new ButtonGroup();
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
				if(chRe.isSelected()) {
					PrecioC=25;
					Tal1 += "Refresco";
				}else {
					PrecioC=-25;
					Tal1 = "";
				}
				
				Rec();
			}
		});
		chRe.setBounds(18, 301, 97, 23);
		frmPizzeria.getContentPane().add(chRe);

		chAg = new JCheckBox("Agua");
		chAg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chAg.isSelected()) {
					PrecioC+=10;
					Tal2 = "Agua";
				}else {
					PrecioC=-10;
					Tal2 = "";
				}
				
				Rec();
			}
		});
		chAg.setBounds(18, 327, 97, 23);
		frmPizzeria.getContentPane().add(chAg);

		chPa = new JCheckBox("Papas");
		chPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chPa.isSelected()) {
					PrecioC+=30;
					Tal3 = "Papas";
				}else {
					PrecioC=-30;
					Tal3 = "";
				}
				
				Rec();
			}
		});
		chPa.setBounds(113, 301, 97, 23);
		frmPizzeria.getContentPane().add(chPa);

		chAl = new JCheckBox("Alitas");
		chAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chAl.isSelected()) {
					PrecioC+=50;
					Tal4 = "Alitas";
				}else {
					PrecioC=-50;
					Tal4 = "";
				}
				
				Rec();
			}
		});
		chAl.setBounds(113, 327, 97, 23);
		frmPizzeria.getContentPane().add(chAl);
		
		chCer = new JCheckBox("Cerveza");
		chCer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chCer.isSelected()) {
					PrecioC+=60;
					Tal5 = "Cerveza";
				}else {
					PrecioC=-60;
					Tal5 = "";
				}
				
				Rec();
			}
		});
		chCer.setBounds(53, 353, 97, 23);
		frmPizzeria.getContentPane().add(chCer);

		JLabel lblNewLabel_6 = new JLabel("Total a Pagar");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(164, 179, 95, 14);
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
				chCer.setSelected(false);
				BoxEs.setSelectedIndex(0);
				txtResumen.setText("");
				lblTotal.setText("");
<<<<<<< HEAD
				Precioa=0;
				Preciob=0;
				Precioc=0;
				Preciod=0;
				total=0;
				Cantidad=1;
				precioPizza=0;
				PrecioDef=0;

=======
				total = 0;
				Cantidad = 1;
				precioPizza = 0;
>>>>>>> d52b4c8b2aa2231891852c50b6943fcec18c87f7
				

			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrar.setBounds(354, 14, 89, 23);
		frmPizzeria.getContentPane().add(btnBorrar);

		JLabel lblNewLabel_7 = new JLabel("Resumen de Orden");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(287, 280, 130, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_7);
		
		

	}
}
