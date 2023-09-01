package pruebaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaUsuario extends JFrame {

	private JPanel contentPane;
	private IngresoDatosUsuario ingresoDatosUsuario;
	private MuestroDatosUsuario muestroDatosUsuario;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AltaUsuario frame = new AltaUsuario();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AltaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		ingresoDatosUsuario = new IngresoDatosUsuario();
		ingresoDatosUsuario.setBounds(12, 12, 233, 102);
		//ingresoDatosUsuario.setBounds(0, 0, 400, 250);
		contentPane.add(ingresoDatosUsuario);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nickname = ingresoDatosUsuario.getNickname();
				String nombre = ingresoDatosUsuario.getNombre();
				String apellido = ingresoDatosUsuario.getApellido();
				muestroDatosUsuario = new MuestroDatosUsuario(nickname, nombre, apellido);
				muestroDatosUsuario.setBounds(12, 12, 233, 102);
				contentPane.add(muestroDatosUsuario);
				ingresoDatosUsuario.setVisible(false);
				muestroDatosUsuario.setVisible(true);
			}
		});
		btnConfirmar.setBounds(71, 169, 117, 25);
		contentPane.add(btnConfirmar);
		ingresoDatosUsuario.setVisible(true);
		
	}
}
