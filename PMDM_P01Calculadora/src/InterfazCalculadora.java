import javax.swing.*;
import java.awt.*;

public class InterfazCalculadora extends JPanel{
	
	private JPanel panelBotones;
	
	//Método para añadir botones al grid
	private void addBoton(String texto) {
		JButton boton = new JButton(texto);
		panelBotones.add(boton);
	}
	
	//Método para crear la interfaz de la calculadora: crea la rejilla para colocar los elementos y los inserta
	public InterfazCalculadora() {
		panelBotones = new JPanel(new GridLayout(4,4));
		addBoton("7");
		addBoton("8");
		addBoton("9");
		addBoton("+");
		addBoton("4");
		addBoton("5");
		addBoton("6");
		addBoton("-");
		addBoton("1");
		addBoton("2");
		addBoton("3");
		addBoton("*");
		addBoton("0");
		addBoton(".");
		addBoton("/");
		addBoton("=");
		
		this.setLayout(new BorderLayout());
		this.add(panelBotones,BorderLayout.CENTER);
	}
	
	class Controlador {
		
	}
}
