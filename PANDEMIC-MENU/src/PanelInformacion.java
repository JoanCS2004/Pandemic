import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelInformacion extends JPanel implements ActionListener{
	
	JButton volver;
	JLabel texto;
	
	PanelInformacion(){
		
		setLayout(new FlowLayout());
		
		volver = new JButton("Volver");
		texto = new JLabel("Informacion...");
		
		volver.addActionListener(this);

		add(volver);
		add(texto);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == volver) {
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.add(new PanelPrincipal());
			marco.setVisible(true);
		}
	}
}