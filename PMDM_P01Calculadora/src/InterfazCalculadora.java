import javax.swing.*;

public class InterfazCalculadora {
	
	private JPanel panelBotones;
	
	private void addBoton(String texto) {
		JButton boton = new JButton(texto);
		panelBotones.add(boton);
	}
	
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
	}
}
