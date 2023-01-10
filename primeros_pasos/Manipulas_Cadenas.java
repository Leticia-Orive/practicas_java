
public class Manipulas_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Leticia";
		
		System.out.println("Mi nombre es " + nombre);
		
		// Metodos length
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras ");
		
		//Metodo CharAt
		
		System.out.println("La primera letra de " + nombre + " es la " +nombre.charAt(0));
		
		//Sirve para decir la ultima letra
		int ultima_letra;
		ultima_letra= nombre.length();
		
		System.out.println("Y la última letra de " + nombre + " es la " + nombre.charAt(ultima_letra-1));
		
		
		
		
		
	}

}
