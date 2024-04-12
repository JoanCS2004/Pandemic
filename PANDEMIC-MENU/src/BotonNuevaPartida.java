import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class BotonNuevaPartida extends JLabel {

	BotonNuevaPartida(PanelPrincipal panelPrincipal) {
		setIcon(new ImageIcon("Assets\\1.png"));

		addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent NuevaPartida) {
				setIcon(new ImageIcon("Assets\\1.png"));
			}

			public void mouseClicked(MouseEvent NuevaPartida) {
				panelPrincipal.irNuevaPartida();
			}

			public void mouseEntered(MouseEvent NuevaPartida) {
				setIcon(new ImageIcon("Assets\\1_cursor.png"));
			}

			public void mousePressed(MouseEvent NuevaPartida) {
				setIcon(new ImageIcon("Assets\\1_click.png"));
			}

		});
	}
}
