import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		double x=10000.0;
		//printf sirve para dar decimales a la division
		// 2f sirve para los decimales que tiene que haber despues de la coma
		System.out.printf("%1.2f", x/3);
		
		String num1=JOptionPane.showInputDialog("Introduce un número ");
		
		double num2=Double.parseDouble(num1);
		
		System.out.println("La raiz de " + num2 + "es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
