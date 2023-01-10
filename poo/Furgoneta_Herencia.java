package poo;

//extends signigica que tiene que heredar de 
//Coche = superclase y furgoneta es la subclase
public class Furgoneta_Herencia extends Coche {
	private int capacidad_carga;
	private int plaza_extra;
	
	//Constructor
	public Furgoneta_Herencia(int plaza_extra, int capacidad_carga) {
		super();//llamar al constructor de la clase padre
		this.capacidad_carga=capacidad_carga;
		this.plaza_extra=plaza_extra;
		
	}
	//Metodo getter
	public String dimeDatosFurgoneta_Herencia(){
		return " La capacidad de carga es: " + capacidad_carga + " y las pazas son: " + plaza_extra;
		
	}
}
