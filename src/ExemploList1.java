

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ExemploList1 implements ListSelectionListener{
	JList<String> list; 
	JLabel label;

	public ExemploList1 () {
		JFrame frame = new JFrame("Exemplo JList");
		frame.setSize(200, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);
		
		String[] redesSociais = { "Facebook", "Instagram", "Twitter", "Youtube" };
		list = new JList<String>(redesSociais);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		frame.add(list, BorderLayout.EAST);

		label = new JLabel();
		frame.add(label, BorderLayout.CENTER);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String str = list.getSelectedValue();
		label.setIcon(new ImageIcon("img/" +str.toLowerCase() +".png"));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ExemploList1();
			}
		});
	}
}
