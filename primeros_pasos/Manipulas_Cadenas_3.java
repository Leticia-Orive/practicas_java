
public class Manipulas_Cadenas_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Metodo equals
		String alumno1, alumno2;
		
		alumno1="David";
		alumno2= "David";
		
		System.out.println(alumno1.equals(alumno2));
		
		String alumno3, alumno4;
		
		alumno3="Leticia";
		alumno4="Cristian";
		
		System.out.println(alumno3.equals(alumno4));
		
		//Metodo equalsIgnoreCase ignora que sea mayusculas que minusculas
		
		String alumno5, alumno6;
		
		alumno5="Maria";
		alumno6="maria";
		
		System.out.println(alumno5.equalsIgnoreCase(alumno6));
	}

}
