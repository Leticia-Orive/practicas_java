package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1= new Empleados("Paco");
		Empleados trabajador2= new Empleados("Ana");
		Empleados trabajador3= new Empleados("Antonio");
		Empleados trabajador4= new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		/*
		trabajador1.cambiaNombre("Maria");
		*/
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos() + "\n");
		//Utilizar un metodo static
		System.out.println(Empleados.dameIdSiguiente());
		//Incremento la variable en 1
		//Empleados.Id++;
		/*Otra forma
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		*/

	}

}
class Empleados{
	
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
		
		
	}
	
	//Metodo setter
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}
	/* Al poner private final este setter ya no funcionaria porque no lo deja modififiacr
	public void cambiaNombre(String nombre) {
		this.nombre=nombre;
	}
	*/
	//Metodo getter
	public String devuelveDatos() {
		return "El nombre es: " + nombre + "  la seccion es " + seccion + " y el Id = " + Id;
	}
	
	//Metodo static
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + IdSiguiente;
	}
	
	//final = constante y no se puede modificar
	private final String nombre;
	private String seccion;
	//variable static = pertenece a la clase y no pertenece a ningun objecto
     private  int Id;
     private static int IdSiguiente=1;
	
}