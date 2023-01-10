package graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConColor mimarco=new MarcoConColor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoConColor extends JFrame{
	public MarcoConColor() {
		setTitle("Prueba con colores");
		setSize(400,400);
		LaminaConColor milamina=new LaminaConColor();
		add(milamina);
		
		//milamina.setBackground(Color.PINK);
		//milamina.setBackground(SystemColor.window);
	}
}
class LaminaConColor extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		/*Dibujo rectangulo*/
		 Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		 /*Metodo que dibuja el contorno*/
		  g2.setPaint(Color.blue);
		  g2.draw(rectangulo); 
		  g2.setPaint(Color.RED.darker());
		 
		 /*Metodo que rellena*/
		 g2.fill(rectangulo);
		 /*Dibujo elipse*/
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		Color micolor=new Color(125,189,200);
		//g2.setPaint(Color.BLUE);
		/*brighter da brillo, darker oscurece el color*/
		//g2.setPaint(new Color(109,172,59).brighter());
		g2.setPaint(micolor);
		g2.fill(elipse);
	}
}