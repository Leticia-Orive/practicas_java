import java.util.*;

public class Entrada_ejemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tipo scanner
		// Constructor new Scanner parametros (System.in)
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		//Metodos nextLine
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor ");
		
		//variable
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + " el año que viene tendras " + (edad+1) + " años");
	}

}
