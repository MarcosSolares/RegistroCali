import javax.swing.JFrame;
import logica.*;
import persistencia.Conectar;
import presentacion.*;
import presentacion.Presentaci�n;


public class Principal {
public static Conectar con=null;
	public static void main(String[] args) {
		con= new Conectar();
		presentacion.Presentaci�n v = new Presentaci�n();
		v.setVisible(true);
		v.setSize(600,400);
		v.setLocationRelativeTo(null);
		v.setResizable(false);
		v.setTitle("Obligatorio Programacion");

	}

}
