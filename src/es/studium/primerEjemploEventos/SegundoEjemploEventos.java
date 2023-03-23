package es.studium.primerEjemploEventos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SegundoEjemploEventos implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Suma");
	TextField txtNumero1 = new TextField(20);
	TextField txtNumero2 = new TextField(20);
	Button btnSumar = new Button("Sumar");
	Button btnRestar = new Button("Restar");
	Button btnMultiplicar = new Button("Multiplicar");
	Button btnDividir = new Button("Dividir");
	TextField txtResultado = new TextField(20);
	
	SegundoEjemploEventos(){
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		ventana.setSize(250, 150);
		ventana.add(txtNumero1);
		ventana.add(txtNumero2);
		txtResultado.setEnabled(false);;
		btnSumar.addActionListener(this);
		ventana.add(btnSumar);
		btnRestar.addActionListener(this);
		ventana.add(btnRestar);
		btnMultiplicar.addActionListener(this);
		ventana.add(btnMultiplicar);
		btnDividir.addActionListener(this);
		ventana.add(btnDividir);
		txtResultado.addActionListener(this);
		ventana.add(txtResultado);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new SegundoEjemploEventos();

	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int uno;
		int dos;
		int resultado;
		float dividir;
		if(e.getSource().equals(btnSumar)) {
			//Coger valor de txtNumero1
			uno = Integer.parseInt(txtNumero1.getText()); //parse para castear 
			//Coger valor de txtNumero2
			dos = Integer.parseInt(txtNumero2.getText());
			//Sumar
			resultado = uno + dos;
			//Poner en txtResultado la suma
			txtResultado.setText(resultado+""); //cuando tenemos un número y lo concatenamos con una cadena, lo convierte todo en cadena
		}
		else if(e.getSource().equals(btnRestar)) {
			uno = Integer.parseInt(txtNumero1.getText());
			dos = Integer.parseInt(txtNumero2.getText());
			resultado = uno - dos;
			txtResultado.setText(resultado+"");	
		}
		else if(e.getSource().equals(btnMultiplicar)) {
			uno = Integer.parseInt(txtNumero1.getText());
			dos = Integer.parseInt(txtNumero2.getText());
			resultado = uno * dos;
			txtResultado.setText(resultado+"");	
		}
		else if(e.getSource().equals(btnDividir)) {
			uno = Integer.parseInt(txtNumero1.getText());
			dos = Integer.parseInt(txtNumero2.getText());
			if(dos==0) {
				txtResultado.setText("Error");
			}
			else {
				dividir = (float)uno / (float)dos;
				txtResultado.setText(dividir+"");	
			}
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
