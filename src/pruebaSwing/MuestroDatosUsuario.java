package pruebaSwing;

import javax.swing.JPanel;

import java.awt.Rectangle;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MuestroDatosUsuario extends JPanel {
	
	
	/**
	 * Create the panel.
	 */
	public MuestroDatosUsuario(String nickname, String nombre, String apellido) {
		setLayout(null);
		
		JLabel lblNickname = new JLabel("Nickname: " + nickname);
		lblNickname.setBounds(12, 12, 426, 15);
		add(lblNickname);
		
		JLabel lblNombre = new JLabel("Nombre: " + nombre);
		lblNombre.setBounds(12, 39, 426, 15);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido: " + apellido);
		lblApellido.setBounds(12, 72, 426, 15);
		add(lblApellido);
	}

	
}
