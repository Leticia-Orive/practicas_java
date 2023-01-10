package poo;
import javax.swing.*;
public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Llama al constructor
		Coche micoche = new Coche(); //Instanciar una clase. Emplar de clase
		
		/*Nos sale error porque no le hemos pasado el argumento
		micoche.establece_color();
		*/
		
		/*Asi seria manualmente 
		 * micoche.establece_color("amarillo");
		 * micoche.configura_asientos("si");
		 * micoche.configura_climatizador("si");
		  */
		
		/*Asi el programa nos pedira el dato que queremos introducir*/
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color:"));
		
		
		/*Error no podemos manipular
		micoche.color="rosa";*/
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio final del coche es: " + micoche.precio_coche());
		
		
		

	}
    
}
//Error porque como estamos encapsulando y hemos puesto que el coche tiene 4 ruedas nosotros no podemos decir que tiene 3
		//Renault.ruedas=3;
		
		//System.out.println(Renault.dime_largo());
		
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas. ");