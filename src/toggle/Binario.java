package toggle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Binario {

	private JFrame frmBinario;
	private JLabel lblDecimal;
	private JToggleButton BtnK;
	private JToggleButton BtnJ;
	private JToggleButton BtnI;
	private JToggleButton BtnH;
	private JToggleButton BtnG;
	private JToggleButton BtnF;
	private JToggleButton BtnE;
	private JToggleButton BtnD;
	private JToggleButton BtnC;
	private JToggleButton BtnB;
	private JToggleButton BtnA;
	int Decimal=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Binario window = new Binario();
					window.frmBinario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Binario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBinario = new JFrame();
		frmBinario.setTitle("Binario");
		frmBinario.setIconImage(Toolkit.getDefaultToolkit().getImage(Binario.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmBinario.setBounds(100, 100, 686, 300);
		frmBinario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBinario.setLocationRelativeTo(null);
		frmBinario.getContentPane().setLayout(null);
		
		BtnK = new JToggleButton("0");
		BtnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnK.isSelected()) {
					BtnK.setText("1");
					Decimal+=1024;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnK.setText("0");
					Decimal-=1024;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnK.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnK.setBounds(0, 64, 52, 34);
		frmBinario.getContentPane().add(BtnK);
		
		BtnJ = new JToggleButton("0");
		BtnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnJ.isSelected()) {
					BtnJ.setText("1");
					Decimal+=512;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnJ.setText("0");
					Decimal-=512;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnJ.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnJ.setBounds(55, 64, 52, 34);
		frmBinario.getContentPane().add(BtnJ);
		
		BtnI = new JToggleButton("0");
		BtnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnI.isSelected()) {
					BtnI.setText("1");
					Decimal+=256;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnI.setText("0");
					Decimal-=256;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnI.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnI.setBounds(117, 64, 52, 34);
		frmBinario.getContentPane().add(BtnI);
		
		BtnH = new JToggleButton("0");
		BtnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnH.isSelected()) {
					BtnH.setText("1");
					Decimal+=128;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnH.setText("0");
					Decimal-=128;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnH.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnH.setBounds(179, 64, 52, 34);
		frmBinario.getContentPane().add(BtnH);
		
		BtnG = new JToggleButton("0");
		BtnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnG.isSelected()) {
					BtnG.setText("1");
					Decimal+=64;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnG.setText("0");
					Decimal-=64;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnG.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnG.setBounds(247, 64, 52, 34);
		frmBinario.getContentPane().add(BtnG);
		
		BtnF = new JToggleButton("0");
		BtnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnF.isSelected()) {
					BtnF.setText("1");
					Decimal+=32;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnF.setText("0");
					Decimal-=32;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnF.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnF.setBounds(309, 64, 52, 34);
		frmBinario.getContentPane().add(BtnF);
		
		BtnE = new JToggleButton("0");
		BtnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnE.isSelected()) {
					BtnE.setText("1");
					Decimal+=16;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnE.setText("0");
					Decimal-=16;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnE.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnE.setBounds(376, 64, 52, 34);
		frmBinario.getContentPane().add(BtnE);
		
		BtnD = new JToggleButton("0");
		BtnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnD.isSelected()) {
					BtnD.setText("1");
					Decimal+=8;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnD.setText("0");
					Decimal-=8;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnD.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnD.setBounds(438, 64, 52, 34);
		frmBinario.getContentPane().add(BtnD);
		
		BtnC = new JToggleButton("0");
		BtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnC.isSelected()) {
					BtnC.setText("1");
					Decimal+=4;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnC.setText("0");
					Decimal-=4;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnC.setBounds(500, 64, 52, 34);
		frmBinario.getContentPane().add(BtnC);
		
		BtnB = new JToggleButton("0");
		BtnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnB.isSelected()) {
					BtnB.setText("1");
					Decimal+=2;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnB.setText("0");
					Decimal-=2;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnB.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnB.setBounds(558, 64, 52, 34);
		frmBinario.getContentPane().add(BtnB);
		
		BtnA = new JToggleButton("0");
		BtnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BtnA.isSelected()) {
					BtnA.setText("1");
					Decimal+=1;
					lblDecimal.setText("                            "+Decimal);
				}else {
					BtnA.setText("0");
					Decimal-=1;
					lblDecimal.setText("                            "+Decimal);
				}
			}
		});
		BtnA.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnA.setBounds(620, 64, 52, 34);
		frmBinario.getContentPane().add(BtnA);
		
		lblDecimal = new JLabel("                            0");
		lblDecimal.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblDecimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDecimal.setBounds(178, 170, 238, 52);
		frmBinario.getContentPane().add(lblDecimal);
		frmBinario.setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(637, 32, 23, 22);
		frmBinario.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(575, 32, 23, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("4");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(514, 32, 23, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("8");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(458, 32, 23, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("16");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(394, 32, 34, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("32");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_2.setBounds(318, 32, 43, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("64");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_2_1.setBounds(259, 32, 43, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_2 = new JLabel("128");
		lblNewLabel_1_1_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_2_2.setBounds(188, 32, 43, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1_2_2);
		
		JLabel lblNewLabel_1_1_1_1_2_2_1 = new JLabel("256");
		lblNewLabel_1_1_1_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_2_2_1.setBounds(126, 32, 43, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1_2_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_2_1_1 = new JLabel("512");
		lblNewLabel_1_1_1_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_2_2_1_1.setBounds(67, 32, 43, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1_2_2_1_1);
		
		
		
		JLabel lblNewLabel_1_1_1_1_2_2_1_1_1 = new JLabel("1024");
		lblNewLabel_1_1_1_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_2_2_1_1_1.setBounds(0, 32, 57, 22);
		frmBinario.getContentPane().add(lblNewLabel_1_1_1_1_2_2_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("DECIMAL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(219, 118, 209, 32);
		frmBinario.getContentPane().add(lblNewLabel_2);
	}
}
