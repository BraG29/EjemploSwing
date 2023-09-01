package pruebaSwing;

import javax.swing.JPanel;

import java.awt.Rectangle;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class IngresoDatosUsuario extends JPanel {

	private JTextField textFieldNickname;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	
	
	/**
	 * Create the panel.
	 */
	public IngresoDatosUsuario() {
		setLayout(null);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setBounds(12, 12, 91, 15);
		add(lblNickname);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 39, 70, 15);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(12, 72, 70, 15);
		add(lblApellido);
		
		textFieldNickname = new JTextField();
		textFieldNickname.setBounds(100, 10, 114, 19);
		add(textFieldNickname);
		textFieldNickname.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(100, 39, 114, 19);
		add(textFieldNombre);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(100, 70, 114, 19);
		add(textFieldApellido);
		

	}


	public String getNickname() {
		return textFieldNickname.getText();
	}


	public String getNombre() {
		return textFieldNombre.getText();
	}


	public String getApellido() {
		return textFieldApellido.getText();
	}
	
}
