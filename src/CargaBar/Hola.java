package CargaBar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class Hola {

	 JFrame frmHola;
	String Nombre="";
	 private JLabel lblM;
	 private JProgressBar BarH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hola window = new Hola();
					window.frmHola.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hola(String Nombre) {
		this.Nombre=Nombre;
		initialize();
		lblM.setText("                  Hola "+Nombre);
		
       Thread hilo=new Thread(new Runnable() {
			

			@Override
			public void run() {
				for(int i=0;i<=100;i++) {
					BarH.setValue(i);
					try {
						Thread.sleep(25);
					}catch (InterruptedException e) {
						e.printStackTrace();
				}
					if(i==100) {
						Hola2 Hola=new Hola2(Nombre);
						Hola.frmHola2.show(true);
						frmHola.show(false);
					}
				}
				
			}
			
		});
		hilo.start();
	}

	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	private void initialize() {
		frmHola = new JFrame();
		frmHola.setIconImage(Toolkit.getDefaultToolkit().getImage(Hola.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmHola.setTitle("Hola");
		frmHola.setBounds(100, 100, 450, 242);
		frmHola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHola.getContentPane().setLayout(null);
		frmHola.setLocationRelativeTo(null);
		
		lblM = new JLabel("");
		lblM.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblM.setBounds(132, 68, 162, 42);
		frmHola.getContentPane().add(lblM);
		
		BarH = new JProgressBar();
		BarH.setForeground(new Color(128, 128, 192));
		BarH.setStringPainted(true);
		BarH.setBounds(90, 137, 246, 21);
		frmHola.getContentPane().add(BarH);
	}
}
