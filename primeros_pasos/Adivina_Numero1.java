import java.util.Scanner;

public class Adivina_Numero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio=(int)(Math.random()*100);
		//Introducir un valor por consola
				//Objeto
				Scanner entrada=new Scanner(System.in);
				int numero=0;
				int intentos=0;
				
				do{
					intentos++;
					System.out.println("Introduce un número, por favor ");
					numero=entrada.nextInt();
					
					if(aleatorio<numero) {
						System.out.println("Mas bajo");
					}
					else if(aleatorio>numero) {
						System.out.println("Más alto");
					}
					
				}while(numero!=aleatorio);
				System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos ");
	}

}
