import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Clase JOptionPane
		
		//Metodos showImputDialog
		
		String nombre_usuario=JOptionPane.showInputDialog(" Introduce tu nombre, por favor ");
		
		//Este metodo estaria mal hecho porque nosotros estamos usando un int en un metodo que funciona solo con String
		
		//int edad=JOptionPane.showInputDialog("Introduce la edad, por favor "); 
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor "); 
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + edad + " años. ");
		//Al ponerlo asi, la consola nos devuelve 281 años porque el showInputDialog no utiliza los numeros solo usa las palabras
		//y la concatenar lo que hace es unir los numeros.
		//System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años. ");
		
		//Metodo parseInt convierte un String en int
		int edad_usuario=Integer.parseInt(edad);
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + edad_usuario + " años. ");
		
	}

}
