package es.studium.primerEjemploEventos;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TercerEjemploEventos implements MouseListener, WindowListener
{
	Frame ventana = new Frame("Ventana");
	
	TercerEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		ventana.addMouseListener(this);
		ventana.setSize(250, 150);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}
	public static void main(String[] args)
	{
		new TercerEjemploEventos();

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
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("X:"+e.getX()); //les sacamos las coordenadas a e
		System.out.println("Y:"+e.getY());
	}
	@Override
	public void mousePressed(MouseEvent e)
	{}
	@Override
	public void mouseReleased(MouseEvent e)
	{}
	@Override
	public void mouseEntered(MouseEvent e)
	{}
	@Override
	public void mouseExited(MouseEvent e)
	{}

}
