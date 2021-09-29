import javax.swing.JApplet;
import java.awt.BorderLayout;

public class CalculadoraApplet extends JApplet {
	
	//Atributos: creamos la interfaz gráfica de la calculadora
	private InterfazCalculadora ventanaCalculadora = new InterfazCalculadora();
	
	//Arranque del Applet
	public void init() {
		this.setLayout(new BorderLayout());
		add(ventanaCalculadora, BorderLayout.CENTER);
	}
}
