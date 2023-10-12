package Circulo;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import AreaTriangulo.Triangulo;



public class Circulos {
public JFrame frmCirculos;
public JButton btnCalcular;
public JButton btnBorrar;
public JLabel lblRadio;
public JFormattedTextField textResultado;

public static void main(String[]cecyto) {
	Circulos x=new Circulos();
	x.frmCirculos.show(true);
}
public Circulos() {
	CrearInterfaz();
}
private void CrearInterfaz() {
	// TODO Auto-generated method stub
	frmCirculos=new JFrame();
	frmCirculos.setIconImage(Toolkit.getDefaultToolkit().getImage(Triangulo.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
	frmCirculos.setTitle("Circulos");
	frmCirculos.setBounds(100, 100, 500, 400);
	frmCirculos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmCirculos.setLocationRelativeTo(null);
	frmCirculos.getContentPane().setLayout(null);
	
	lblRadio=new JLabel("Radio");
	lblRadio.setBounds(20, 20, 80, 20);
	frmCirculos.getContentPane().add(lblRadio);
	
	
}
}
