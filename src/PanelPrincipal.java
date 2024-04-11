
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelPrincipal extends JPanel implements ActionListener{
	
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JTextField areaDeTexto;
	
	PanelPrincipal(){
		
		setLayout(new FlowLayout());
		
		boton1 = new JButton("Nueva Partida");
		boton2 = new JButton("Cargar Partida");
		boton3 = new JButton("Información");
		boton4 = new JButton("Resumen de puntuaciones");
		boton5 = new JButton("Autores");
		boton6 = new JButton("Version");
		boton7 = new JButton("Salir");

		areaDeTexto = new JTextField(20);
		
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);
		boton6.addActionListener(this);
		boton7.addActionListener(this);


		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		add(boton6);
		add(boton7);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton1) {
			System.out.println("Aqui començara una nova partida");
		}

		if (e.getSource() == boton2) {
			System.out.println("Aqui cargara l'antiga partida");
		}

		if (e.getSource() == boton3) {
			System.out.println("Informacio del joc");
		}

		if (e.getSource() == boton4) {
			System.out.println("Resum de les puntuacions");
		}

		if (e.getSource() == boton5) {
			System.out.println("Autors del joc");
		}

		if (e.getSource() == boton6) {
			System.out.println("Versio del joc");
		}
		if (e.getSource() == boton7) {
			System.out.println("Aqui sortira del programa");
		}
	}

}
