import javax.swing.JFrame;

public class swing extends JFrame {
	
	PanelPrincipal lamina1;
	
	
	swing(){
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
}
