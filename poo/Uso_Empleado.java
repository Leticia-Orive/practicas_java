package poo;

import java.util.*;
import java.lang.*;

public class Uso_Empleado { //clase principal o publica

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Forma manual
		  Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		// new llama al constructor
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("Maria Martín", 105000, 2002, 03, 15);
		
		//Metodo sube sueldo
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
			System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de Alta: " + empleado1.dameFechaContrato());
			System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de Alta: " + empleado2.dameFechaContrato());
			System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de Alta: " + empleado3.dameFechaContrato());

	}
}
	*/
		
		//Forma con array
		Jefatura jefe_RRHH=new Jefatura("Leticia", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados= new Empleado[6];
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2]=new Empleado("Maria Martín", 105000, 2002, 03, 15);
		misEmpleados[3]=new Empleado("Antonio Fernández",47500, 2009, 11, 9);
		misEmpleados[4]=jefe_RRHH; //Polimorfismo en acción. Principio de sustitución
		misEmpleados[5]=new Jefatura("Maria",95000,1999,5,26);
		//Refundacion o casting
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000);
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		System.out.println("El Jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " + jefa_Finanzas.establece_bonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		jefa_Finanzas.establece_bonus(500);
		/*Empleado director_comercial=new Jefatura("Sandra", 85000, 2012, 05, 05);
		Comparable ejemplo=new Empleado("Elisabeth", 95000, 2011,06,07);
		
		
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz comparable");
		}
		
		
		/*misEmpleados[0]=new Empleado();
		misEmpleados[1]=new Empleado();
		misEmpleados[2]=new Empleado();
		misEmpleados[3]=new Empleado();
		
		//Como estan en array vamos a utilizar un bucle
		/*for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo:" + misEmpleados[i].dameSueldo() + " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}
		*/
		//Otra forma de hacer el mismo array
		   //String[] miarray=new String[3];
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
			}
			
			Arrays.sort(misEmpleados);
			
			
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de Alta: " + e.dameFechaContrato());
			}		

       }
}

class Empleado implements Comparable, Trabajadores{
	//constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia) {//parametros
		nombre=nom;
		sueldo=sue;
		
		//Clase predefinida GregorianCalendar construye una fecha con el dia, mes y año(api)
		//Creamos el constructor
		GregorianCalendar calendario= new GregorianCalendar(agno, mes-1,dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
			
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public Empleado(String nom) {
	
	//este this llama al otro constructor de la clase
		this(nom, 30000, 2000,01,01);
	}
	

	//Constructor por defecto
	/*
	 * class Empleado{}
	 */
		
	
	//Metodo getters
	public String dameNombre() {
		return nombre;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	//Metodo setters
	
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	//Metodo compareto
	public int compareTO(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
		
	}
		
	
	//Crear las variable de clase o propiedades
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
 class Jefatura extends Empleado implements Jefes {
	 
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom,sue,agno,mes,dia);
		// TODO Auto-generated constructor stub
	}
	public String tomar_deciosiones(String decision) {
		return "Un miembro de la dirección  ha tomado la decisión de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	//Metodo seter
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	//Metodo geter
	public double dameSueldo(){
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;

	@Override
	public String tomar_decisiones(String decision) {
		// TODO Auto-generated method stub
		return null;
	}
	


}



	


