package graficos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones mimarco=new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoBotones extends JFrame{
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds (700,300,500,300);
		LaminaBotones milamina=new LaminaBotones();
		add(milamina);
	}
}
class LaminaBotones extends JPanel implements ActionListener{
	JButton botonAzul=new JButton("Azul");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado=e.getSource();
		if(botonPulsado==botonAzul) {
		setBackground(Color.blue);
		}else if (botonPulsado==botonAmarillo) {
			setBackground(Color.yellow);
		}else {
			setBackground(Color.red);
		}
		
	}
}