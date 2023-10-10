package chicha;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Chicha {
	JFrame frmChicha;
	JLabel lblImagen,lblA,lblB,lblC,lblResultado;
	JSpinner spnA, spnB, spnC;
	double a = 0, b =0, c = 0;
	double x1 = 0, x2 =0;

	public Chicha() {
		crarInterfaz();
	}
	public void calcularChicha() {
		DecimalFormat f = new DecimalFormat("#.00");
		double factor = (b * b) -(4 * a * c);
		if (factor > 0) {
			x1 = (-b + Math.sqrt(factor)) / (2 *a);
			x2 = (-b - Math.sqrt(factor)) / (2 *a);
			lblResultado.setText("x1:"+f.format(x1)+"x2:"+f.format(x2));
		}else if (factor ==0) {
			x1 = (-b) / (2 * a);
			lblResultado.setText("x1:"+f.format(x1));
		}else {
				lblResultado.setText("NO TIENE SOLUCION");
			}
			
		}
	
	public void crarInterfaz() {
		
		frmChicha=new JFrame();
		frmChicha.setTitle("CHICHARRONERA");
		frmChicha.setIconImage(Toolkit.getDefaultToolkit().getImage(Chicha.class.getResource("/chicha/xd.png")));
		frmChicha.setBounds(0,0,700,500);
		frmChicha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChicha.setLocationRelativeTo(null);
		frmChicha.getContentPane().setLayout(null);
		
		lblImagen = new JLabel();
		lblImagen.setBounds(400,20,250,150);
		ImageIcon imagenOrginal = new ImageIcon(getClass().getResource("/chicha/xd.png"));
		Image imagenNueva = imagenOrginal.getImage().getScaledInstance(lblImagen.getWidth(),
			lblImagen.getHeight(),Image.SCALE_SMOOTH);
		lblImagen.setIcon(new ImageIcon (imagenNueva));
		frmChicha.getContentPane().add(lblImagen);
		lblA=new JLabel("A:");
		lblA.setBounds(20,20,100,30);
		frmChicha.getContentPane().add(lblA);
		
		lblB=new JLabel("B:");
		lblB.setBounds(20,70,100,30);
		frmChicha.getContentPane().add(lblB);
		
		lblC=new JLabel("C:");
		lblC.setBounds(20,120,100,30);
		frmChicha.getContentPane().add(lblC);
				
				
		lblResultado=new JLabel("RESULTADO");
		lblResultado.setHorizontalTextPosition(JLabel.CENTER);
		lblResultado.setFont(new Font("Arial",Font.BOLD,40));
		lblResultado.setBorder(new LineBorder(Color.black,3,true));
		lblResultado.setBounds(50,200,400,100);
		frmChicha.getContentPane().add(lblResultado);
		
		spnA=new JSpinner();
		spnA.setModel(new SpinnerNumberModel(0, -10,10,1));
		spnA.setBounds(60,20,100,30);
		spnA.addChangeListener(new ChangeListener() {
		

		@Override
		public void stateChanged(ChangeEvent e) {
		a=Integer.parseInt(spnA.getValue().toString());
		calcularChicha();
		}
		});
		frmChicha.getContentPane().add(spnA);

		spnB=new JSpinner();
		spnB.setModel(new SpinnerNumberModel(0, -10,10,1));
		spnB.setBounds(60,70,100,30);
		spnB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				b=Integer.parseInt(spnB.getValue().toString());
				calcularChicha();
				}
				});
		frmChicha.getContentPane().add(spnB);
		
		spnC=new JSpinner();
		spnC.setModel(new SpinnerNumberModel(0, -10,10,1));
		spnC.setBounds(60,120,100,30);
		spnC.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				c=Integer.parseInt(spnC.getValue().toString());
				calcularChicha();
				}
				});
		
		frmChicha.getContentPane().add(spnC);
		
		
		}
	public static void main(String[] args) {
		Chicha x=new Chicha();
		x.frmChicha.setVisible(true);

	}

}
