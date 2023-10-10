package scrolll;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class strol {

	private JFrame frmRgb;
	private JScrollBar scbAlto;
	private JScrollBar scbAncho;
	private JLabel lblValor;
	private JLabel lblNewLabel;
	private JLabel lblAltura;

int width =10, heigth=10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					strol window = new strol();
					window.frmRgb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public strol() {
		initialize();
	}

	public void cambiarImagen() {
		 width=scbAncho.getValue();
		 heigth=scbAlto.getValue();
		 lblValor.setBounds(24,165,width,heigth);
		 ImageIcon imagenOrginal = new ImageIcon(getClass().getResource("/scrolll/xd.png"));
			Image imagenNueva = imagenOrginal.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH);
			lblValor.setIcon(new ImageIcon (imagenNueva));
	 }
	private void initialize() {
		frmRgb = new JFrame();
		frmRgb.setIconImage(Toolkit.getDefaultToolkit().getImage(strol.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmRgb.setTitle("rgb");
		frmRgb.setBounds(100, 100, 815, 499);
		frmRgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRgb.getContentPane().setLayout(null);
		lblValor = new JLabel("");
		lblValor.setIcon(new ImageIcon(strol.class.getResource("/scrolll/xd.png")));
		lblValor.setBounds(211, 165, 319, 274);
		frmRgb.getContentPane().add(lblValor);
		
		scbAlto = new JScrollBar();
		scbAncho = new JScrollBar();
		scbAncho.setMaximum(700);
		scbAncho.setMinimum(10);
		scbAncho.setOrientation(JScrollBar.HORIZONTAL);
		scbAncho.setBounds(73, 117, 533, 48);
		frmRgb.getContentPane().add(scbAncho);
		
		scbAlto.setMaximum(700);
		scbAlto.setMinimum(10);
		scbAlto.setOrientation(JScrollBar.HORIZONTAL);
		scbAlto.setBounds(57, 36, 533, 48);
		frmRgb.getContentPane().add(scbAlto);
		
		scbAlto.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				cambiarImagen();
			}
		});	
		

	
		scbAncho.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				cambiarImagen();
			}
		});
		
		
		
	
		
		lblNewLabel = new JLabel("Ancho");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 94, 83, 13);
		frmRgb.getContentPane().add(lblNewLabel);
		
		lblAltura = new JLabel("altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAltura.setBounds(10, 10, 83, 13);
		frmRgb.getContentPane().add(lblAltura);
	}

}
