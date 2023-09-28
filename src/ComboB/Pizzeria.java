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
	private JTextArea textArea;

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
		lblOp.setText(""+sliderC.getValue());
		textArea.setText(sliderC.getValue()+"Pizzas(s)");
		
	}

	
	private void initialize() {
		frmPizzeria = new JFrame();
		frmPizzeria.setIconImage(Toolkit.getDefaultToolkit().getImage(Pizzeria.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmPizzeria.setTitle("Pizzeria");
		frmPizzeria.setBounds(100, 100, 485, 411);
		frmPizzeria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzeria.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pizzeria El Che");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(171, 11, 115, 24);
		frmPizzeria.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pizzeria.class.getResource("/ComboB/Pizza-icon1.png")));
		lblNewLabel_1.setBounds(257, 71, 202, 173);
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
		textArea = new JTextArea();
		textArea.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textArea.setBounds(97, 153, 150, 121);
		frmPizzeria.getContentPane().add(textArea);
		lblTotal = new JLabel("");
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTotal.setBounds(230, 301, 217, 44);
		frmPizzeria.getContentPane().add(lblTotal);
		BoxEs = new JComboBox();
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
		rdG.setBounds(10, 173, 95, 23);
		frmPizzeria.getContentPane().add(rdG);
		
		rdM = new JRadioButton("Misterio $120");
		rdM.setBounds(10, 199, 109, 23);
		frmPizzeria.getContentPane().add(rdM);
		
		rdS = new JRadioButton("Super $150");
		rdS.setBounds(10, 225, 109, 23);
		frmPizzeria.getContentPane().add(rdS);
		
		rdF = new JRadioButton("Fam $180");
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
		
		JCheckBox chRe = new JCheckBox("Refresco");
		chRe.setBounds(18, 301, 97, 23);
		frmPizzeria.getContentPane().add(chRe);
		
		JCheckBox chAg = new JCheckBox("Agua");
		chAg.setBounds(18, 327, 97, 23);
		frmPizzeria.getContentPane().add(chAg);
		
		JCheckBox chPa = new JCheckBox("Papas");
		chPa.setBounds(113, 301, 97, 23);
		frmPizzeria.getContentPane().add(chPa);
		
		JCheckBox chAl = new JCheckBox("Alitas");
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
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorrar.setBounds(354, 14, 89, 23);
		frmPizzeria.getContentPane().add(btnBorrar);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("Resumen de Orden");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(106, 133, 130, 14);
		frmPizzeria.getContentPane().add(lblNewLabel_7);
		
		
	}
}
