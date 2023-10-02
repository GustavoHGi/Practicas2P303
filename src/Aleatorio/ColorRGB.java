package Aleatorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class ColorRGB {

	private JFrame frmColoresRgb;
	private JLabel lblValorRGB;
	private JLabel lblNewLabel;
	private JLabel lblRelleno;
	private JLabel lblRc;
	private JLabel lblVc;
	private JLabel lblAc;
	int r=0;
	int v=0;
	int a=0;
	String colorHexadecimal;
	private JSlider sliderA;
	private JSlider sliderV;
	private JSlider sliderR;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorRGB window = new ColorRGB();
					window.frmColoresRgb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ColorRGB() {
		initialize();
	}

	public void CambiarColor() {
		lblRc.setText(""+r);
		lblVc.setText(""+v);
		lblAc.setText(""+a);
		colorHexadecimal = String.format("#%02X%02X%02X", r, v, a);
		lblValorRGB.setText("HexadeCimal"+colorHexadecimal);
		
		lblRelleno.setBackground(new Color(r,v,a));
		}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColoresRgb = new JFrame();
		frmColoresRgb.setIconImage(Toolkit.getDefaultToolkit().getImage(ColorRGB.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmColoresRgb.setTitle("COLORES RGB");
		frmColoresRgb.setBounds(100, 100, 490, 394);
		frmColoresRgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColoresRgb.getContentPane().setLayout(null);
		frmColoresRgb.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("Rojo");
		lblNewLabel.setFont(new Font("Elephant", Font.PLAIN, 12));
		lblNewLabel.setBounds(33, 20, 83, 23);
		frmColoresRgb.getContentPane().add(lblNewLabel);
		
		JLabel lblV = new JLabel("Verde");
		lblV.setFont(new Font("Elephant", Font.PLAIN, 12));
		lblV.setBounds(33, 72, 45, 13);
		frmColoresRgb.getContentPane().add(lblV);
		
		JLabel lblA = new JLabel("Azul");
		lblA.setFont(new Font("Elephant", Font.PLAIN, 12));
		lblA.setBounds(33, 127, 45, 13);
		frmColoresRgb.getContentPane().add(lblA);
		
		lblValorRGB = new JLabel("");
		lblValorRGB.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblValorRGB.setBounds(119, 196, 253, 85);
		frmColoresRgb.getContentPane().add(lblValorRGB);
		
		lblRelleno = new JLabel("");
		lblRelleno.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblRelleno.setOpaque(true);
		lblRelleno.setBounds(280, 20, 186, 166);
		frmColoresRgb.getContentPane().add(lblRelleno);
		
		lblRc = new JLabel("");
		lblRc.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblRc.setBounds(240, 20, 34, 45);
		frmColoresRgb.getContentPane().add(lblRc);
		
		lblVc = new JLabel("");
		lblVc.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblVc.setBounds(240, 85, 34, 45);
		frmColoresRgb.getContentPane().add(lblVc);
		
		lblAc = new JLabel("");
		lblAc.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblAc.setBounds(240, 141, 34, 45);
		frmColoresRgb.getContentPane().add(lblAc);
		
		sliderR = new JSlider();
		sliderR.setMaximum(255);
		sliderR.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r=sliderR.getValue();
				CambiarColor();
			}
		});
		sliderR.setBounds(30, 40, 200, 22);
		frmColoresRgb.getContentPane().add(sliderR);
		
		sliderV = new JSlider();
		sliderV.setMaximum(255);
		sliderV.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v=sliderV.getValue();
				CambiarColor();
}
		});
		sliderV.setBounds(33, 95, 200, 22);
		frmColoresRgb.getContentPane().add(sliderV);
		
		sliderA = new JSlider();
		sliderA.setMaximum(255);
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a=sliderA.getValue();
				CambiarColor();
			}
		});
		sliderA.setBounds(30, 151, 200, 22);
		frmColoresRgb.getContentPane().add(sliderA);
		
		
	}
}
