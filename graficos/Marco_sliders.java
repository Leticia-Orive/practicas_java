package graficos;

import java.awt.*;

import javax.swing.*;


public class Marco_sliders {

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
		setLayout(new BorderLayout());
		rotulo=new JLabel("En un lugar de La Mancha de cuyo nombre no quiero acordarme...");
		add(rotulo, BorderLayout.CENTER);
		control=new JSlider(8,50,12);
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif",Font.ITALIC,10));
		JPanel laminaSlider=new JPanel();
		laminaSlider.add(control);
		add(laminaSlider,BorderLayout.NORTH);
		
	}
	private JLabel rotulo;
	private JSlider control;
}
	