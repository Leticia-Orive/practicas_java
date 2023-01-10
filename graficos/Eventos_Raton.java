package graficos;
import java.awt.event.*;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton mimarco=new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		EventosDeRaton EventoRaton=new EventosDeRaton();
		addMouseListener(EventoRaton);
		MovimientoDeRaton MovimientoRaton=new MovimientoDeRaton();
		addMouseMotionListener(MovimientoRaton);
	}
}
/*Todos los metodos
 * class EventosDeRaton implements MouseListener{


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de levantar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de salir");
	}
	
	
} */
/*Cuando solo quieres un metodo y tienes que heredar*/
class EventosDeRaton extends MouseAdapter{
	/*public void mouseClicked(MouseEvent e) {
		//System.out.println("Has hecho click");
		//System.out.println("Coordenada X: " + e.getX() + "Coordenada y: " + e.getY());
		System.out.println(e.getClickCount());
	}*/
	public void mousePressed(MouseEvent e) {
		//System.out.println(e.getModifiersEx());
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el botón izquierdo");	
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del raton");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el botón derecho");
		}
	}
	
}
class MovimientoDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el raton");
	}
	
}
