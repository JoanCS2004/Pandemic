import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class swing extends JFrame {
	
	PanelPrincipal lamina1;
	
	fondoP fondo = new fondoP();
	
	
	swing(){
		
		
		this.setContentPane(fondo);
		
		
		//Cordenades i tamany de l'altura: comença y, acaba x, altura, anchura. 
		setBounds(50,50,500,500);
		
		//Metode per tancar el menu
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//TITUL:
		setTitle("Mi primer comando en swing");
		lamina1 = new PanelPrincipal();
		//Que el marco sigui visible
		
		add(lamina1);
		
		
		setVisible(true);
	}
	
	
	public class fondoP extends JPanel {
		private Image imagen;
		
		public void  paint(Graphics g){
			
			imagen = new ImageIcon(getClass().getResource("/img/descarga.jpg")).getImage();
			
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			
			setOpaque(false);
			
			super.paint(g);
		}
		
	}
}
