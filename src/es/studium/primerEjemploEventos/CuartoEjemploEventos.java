package es.studium.primerEjemploEventos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CuartoEjemploEventos implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Ventana");
	Choice choLista = new Choice();
	
	CuartoEjemploEventos(){
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		
		choLista.add("Seleccionar un color:");
		choLista.add("Amarillo");
		choLista.add("Azul");
		choLista.add("Rojo");
		choLista.add("Verde");
		choLista.addItemListener(this);
		ventana.add(choLista);
		
		ventana.setSize(250, 150);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new CuartoEjemploEventos();

	}

	@Override
	public void windowOpened(WindowEvent e)
	{}
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}
	@Override
	public void windowClosed(WindowEvent e)
	{}
	@Override
	public void windowIconified(WindowEvent e)
	{}
	@Override
	public void windowDeiconified(WindowEvent e)
	{}
	@Override
	public void windowActivated(WindowEvent e)
	{}
	@Override
	public void windowDeactivated(WindowEvent e)
	{}
	
	

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItem().equals("Amarillo")) {
			ventana.setBackground(Color.yellow);
		}
		else if(e.getItem().equals("Azul")) {
			ventana.setBackground(Color.blue);
		}
		else if(e.getItem().equals("Rojo")) {
			ventana.setBackground(Color.red);
		}
		else if(e.getItem().equals("Verde")) {
			ventana.setBackground(Color.green);
		}
		else {
			ventana.setBackground(Color.white);
		}
		
	}
	
}
