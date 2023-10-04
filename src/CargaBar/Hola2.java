package CargaBar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import java.awt.Color;

public class Hola2 {

	 JFrame frmHola2;
	 String Nombre="";
	 private JProgressBar Bar3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hola2 window = new Hola2();
					window.frmHola2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param nombre 
	 */
	public Hola2(String nombre) {
		initialize();
		
        Thread hilo=new Thread(new Runnable() {
			

			@Override
			public void run() {
				for(int i=0;i<=100;i++) {
					Bar3.setValue(i);
					try {
						Thread.sleep(25);
					}catch (InterruptedException e) {
						e.printStackTrace();
				}
					if(i==100) {
						BarraDeCarga Hola1=new BarraDeCarga();
						Hola1.frmBarrraDeProgreso.show(true);
						
						frmHola2.show(false);
					}
				}
				
			}
			
		});
		hilo.start();
		
	}
	

	
	private void initialize() {
		frmHola2 = new JFrame();
		frmHola2.setIconImage(Toolkit.getDefaultToolkit().getImage(Hola2.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
		frmHola2.setTitle("Hola2");
		frmHola2.setBounds(100, 100, 367, 171);
		frmHola2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHola2.getContentPane().setLayout(null);
		
		Bar3 = new JProgressBar();
		Bar3.setForeground(new Color(255, 255, 128));
		Bar3.setStringPainted(true);
		Bar3.setBounds(49, 38, 221, 31);
		frmHola2.getContentPane().add(Bar3);
		frmHola2.setLocationRelativeTo(null);
	}

}
