package pruebaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class ConsultaUsuario extends JFrame implements ListaUsuariosListener {

	JLabel lblControl;
	//private String eventData;
	private JPanel contentPane;
	private ListaUsuarios listaUsuarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaUsuario frame = new ConsultaUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
//		lblControl.setText(eventData);
		
		listaUsuarios = new ListaUsuarios();
		listaUsuarios.setListener(this);
		listaUsuarios.setBounds(12, 12, 229, 246);
		contentPane.add(listaUsuarios);
		
		lblControl = new JLabel();
		lblControl.setBounds(272, 84, 144, 15);
		contentPane.add(lblControl);
	}

	@Override
	public void onListaUsuariosEvent(String eventData) {
		lblControl.setText(eventData);
	}
}
