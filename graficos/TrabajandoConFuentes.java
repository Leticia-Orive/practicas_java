package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConFuentes mimarco=new MarcoConFuentes();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoConFuentes extends JFrame{
	public MarcoConFuentes() {
		setTitle("Prueba con Fuentes");
		setSize(400,400);
		LaminaConFuentes milamina=new LaminaConFuentes();
		add(milamina);
		/*Todos los elementos del mismo color*/
		milamina.setForeground(Color.BLUE);
		
		
	}


	}
class LaminaConFuentes extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		Font mifuente=new Font("Arial",Font.BOLD,26);
		g2.setFont(mifuente);
		//g2.setColor(Color.blue);
		g2.drawString("Leticia", 100, 100);
		/*creamos otra fuente*/
		g2.setFont(new Font("Courier",Font.ITALIC,24));
		//g2.setColor(new Color(128,90,50).brighter());
		g2.drawString("Curso de java", 100, 200);
	}
}


