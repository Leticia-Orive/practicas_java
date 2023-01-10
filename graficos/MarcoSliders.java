package graficos;

import java.awt.Font;

import javax.swing.*;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Sliders mimarco=new Frame_Sliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class Frame_Sliders extends JFrame{
	public Frame_Sliders() {
		setBounds(550,400,550,350);
		Lamina_Sliders milamina= new Lamina_Sliders();
		add(milamina);
		setVisible(true);
	}
}
class Lamina_Sliders extends JPanel{
	public Lamina_Sliders() {
		/*Barra en vertical
		  JSlider control=new JSlider(SwingConstants.VERTICAL,20,100,25);
		  Otra forma tambien
		  control.setOrientation(SwingConstants.VERTICAL);
		 */
		//Barra en horizontal
		JSlider control=new JSlider(0,100,50);
		//Marcas 
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		control.setPaintLabels(true);
		
		//Rotulos que nos aparezcan los numeros
		control.setFont(new Font("Serif", Font.ITALIC,12));
		control.setPaintLabels(true);
		//control.setSnapToTicks(true);
		
		add(control);
	}
}