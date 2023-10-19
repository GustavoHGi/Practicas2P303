package RedSOcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Principal {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Usuario");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crudUsuarioo CrudU=new crudUsuarioo();
				CrudU.CrudUsuario.setVisible(true);
			}
		});
		btnNewButton.setBounds(83, 49, 128, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPublicacion = new JButton("Publicacion");
		btnPublicacion.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPublicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crudPubli CrudP=new crudPubli();
				CrudP.frame.setVisible(true);
			}
		});
		btnPublicacion.setBounds(308, 49, 128, 21);
		frame.getContentPane().add(btnPublicacion);
		
		JButton btnComentario = new JButton("Comentario");
		btnComentario.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnComentario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crudComentario CrudC=new crudComentario();
				CrudC.frame.setVisible(true);
			}
		});
		btnComentario.setBounds(181, 135, 150, 41);
		frame.getContentPane().add(btnComentario);
	}
}
