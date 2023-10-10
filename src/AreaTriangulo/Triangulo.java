package AreaTriangulo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Triangulo {
public JFrame frmArea;
public JButton btnBorrar;
public JLabel lblResultado;
public JTextField txtBase;
public JTextField txtAltura;
public JLabel lblAltura;
public JLabel lblBase;
public JButton btnCalcular;
public static void main(String[]cecyto) {
	Triangulo x=new Triangulo();
	x.frmArea.show(true);
}
public Triangulo() {
	crearInterfaz();
}
private void crearInterfaz() {
	// TODO Auto-generated method stub
	frmArea=new JFrame();
	frmArea.setIconImage(Toolkit.getDefaultToolkit().getImage(Triangulo.class.getResource("/BotonRadeo/cecytem-logo-D0CECF053F-seeklogo.com.png")));
	frmArea.setTitle("Area Del Triangulo");
	frmArea.setBounds(100, 100, 500, 400);
	frmArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmArea.setLocationRelativeTo(null);
	frmArea.getContentPane().setLayout(null);
	
	lblAltura=new JLabel("Altura");
	lblAltura.setBounds(20, 20, 80, 20);
	frmArea.getContentPane().add(lblAltura);
	
	lblBase=new JLabel("Base");
	lblBase.setBounds(20,80, 80, 20);
	frmArea.getContentPane().add(lblBase);
	
	txtBase=new JTextField("");
	txtBase.setBounds(170, 80, 80, 30);
	frmArea.getContentPane().add(txtBase);
	
	txtAltura=new JTextField("");
	txtAltura.setBounds(170, 20, 80, 30);
	frmArea.getContentPane().add(txtAltura);
	
	lblResultado=new JLabel("");
	lblResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
	lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
	lblResultado.setBorder(new LineBorder(new Color(0,0,0),3,true));
	lblResultado.setBounds(50,250,400,70);
	frmArea.getContentPane().add(lblResultado);
	
	btnCalcular=new JButton("Calcular");
	btnCalcular.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double base=Double.parseDouble(txtBase.getText());
			double altura=Double.parseDouble(txtAltura.getText());
			double area=(base*altura)/2;
			DecimalFormat F=new DecimalFormat("##.00");
			lblResultado.setText("Area: "+F.format(area));
			
		}
	});
	
	btnCalcular.setBounds(350, 20, 80, 30);
	frmArea.getContentPane().add(btnCalcular);
	
	
	btnBorrar=new JButton("Borra");
	btnBorrar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			txtAltura.setText("");
			txtBase.setText("");
			lblResultado.setText("");
		}
	});
	btnBorrar.setBounds(350, 70, 80, 30);
	frmArea.getContentPane().add(btnBorrar);
}


}
