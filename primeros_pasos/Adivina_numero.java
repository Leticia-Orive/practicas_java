import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Refundición: convertir un dato en otro
		int aleatorio=(int)(Math.random()*100);
		//Metodo random
		System.out.println(aleatorio);
		
		//Introducir un valor por consola
		//Objeto
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un número, por favor ");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Mas bajo");
			}
			else if(aleatorio>numero) {
				System.out.println("Más alto");
			}
			
		}
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos ");
		
	}

}
