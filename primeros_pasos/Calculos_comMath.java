
public class Calculos_comMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//esto esta mal
		//int raiz=Math.sqrt(9);
		
		//ESTO ESTA BIEN raiz
		
		//double raiz=Math.sqrt(9);
		
		//Sirve para redondear
		//float num1=5.85F; esto estaria bien
		//double num1=5.85;
		//int resultado=Math.round(num1);// esta mal no puede covertir un long a un int
		 //int resultado=(int)Math.round(num1); // esto se llama refundiciones
		//System.out.println(resultado);
	
	//pow
		double base=5;
		double exponente=3;
		
		int resultado=(int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
		
		
		
	}

}

