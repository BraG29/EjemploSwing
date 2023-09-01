package pruebaSwing;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ListaUsuarios extends JPanel {

	private String[] usuarios;
	private JList listUsuarios;
	private ListaUsuariosListener listener;

	/**
	 * Create the panel.
	 */
	public ListaUsuarios() {
		setLayout(null);

		usuarios = new String[] { "marito <mario@mail.com>", "bg29 <braian@mail.com>", "karma23 <nahuel@mail.com>" };

		listUsuarios = new JList();
		listUsuarios.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String selectedItem = (String) listUsuarios.getSelectedValue();
				if (listener != null && selectedItem != null) {
					listener.onListaUsuariosEvent(selectedItem);
				}
			}
		});
		listUsuarios.setModel(new AbstractListModel() {
			String[] values = usuarios;

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		JScrollPane scrollPane = new JScrollPane(listUsuarios);
		scrollPane.setBounds(0, 0, 230, 276);
		add(scrollPane);

	}

	public void setListener(ListaUsuariosListener listener) {
		this.listener = listener;
	}

}
