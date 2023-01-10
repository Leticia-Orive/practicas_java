package graficos;
import javax.swing.*;
import java.awt.event.*;


public class Eventos_Ventanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana mimarco=new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoVentana mimarco2=new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		mimarco.setBounds(300,300,500,350);
		mimarco2.setBounds(900,300,500,350);

	}

}
class MarcoVentana extends JFrame{
	public MarcoVentana() {
		//setTitle("Respondiendo");
		//setBounds(300,300,500,350);
		setVisible(true);
		
		M_Ventana oyente_ventana=new M_Ventana();
		addWindowListener(oyente_ventana);
	}
}
class M_Ventana implements WindowListener{
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana actividad");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("La ventana ha sido cerrada");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando ventana");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivida");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana restaurada ");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");
	}
}
