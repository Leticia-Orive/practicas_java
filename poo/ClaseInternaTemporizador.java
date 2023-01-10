package poo;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class ClaseInternaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia
		Reloj miReloj=new Reloj();
		miReloj.enMarcha(3000, true);
		JOptionPane.showConfirmDialog(null,"Pulsa Aceptar para terminar");
		System.exit(0);

	}

}
class Reloj{
	/*Constructor
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}*/
	//Metodo
	public void enMarcha(int intervalo, final boolean sonido) {
		
		//Clase interna local
		
		 class DameLaHora2 implements ActionListener{
			 
			 public void actionPerformed(ActionEvent evento) {
				 Date ahora=new Date();
				 System.out.println("Te pongo la hora cada 3 sg " + ahora);
				 if (sonido) {
					 Toolkit.getDefaultToolkit().beep();
				 }
			 }
		 }
		
		ActionListener oyente=new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	
	//Dos campos encapsulados
	//private int intervalo;
	//private boolean sonido;
	
	//Clase interna
	/* private class DameLaHora2 implements ActionListener{
		 public void actionPerformed(ActionEvent evento) {
			 Date ahora=new Date();
			 System.out.println("Te pongo la hora cada 3 sg " + ahora);
			 if (sonido) {
				 Toolkit.getDefaultToolkit().beep();
			 }
		 }
	 }*/
}