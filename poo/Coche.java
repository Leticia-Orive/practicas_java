package poo;

public class Coche {
	//Encapsular para que no varie los datos se añade un private delante
	//Propiedades comunes
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	//Propiedades que pueden variar
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	//Metodo constructor
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	
	//Metodo Getters
	/*Aqui solo nos devuelve el parametro del objecto largo
	 * public String dime_largo() {
		return "El largo del coche es " + largo;
	}*/
	public String dime_color() {
		return "El color del coche es " + color;
	}
	//Para que nos devuelva todos los parametros de nuestro objecto
	public String dime_datos_generales(){
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + ". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
		
	}
	public String dime_asientos() {
		if(asientos_cuero==true) { //if(asientos_cuero){
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public String dime_climatizador() {
		if(climatizador==true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	public int precio_coche() {
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			precio_final+=1500;
		}
		return precio_final;
	}
	
	//Metodos Setters
	
	public void establece_color(String color_coche) {
		color=color_coche;
		
		//color ="azul";
	}
	/*public void configura_asientos(String asientos_cuero) {
		/*this significa referencia a la variable de clase
		El que no lleva el this hace referencia al argumento
		this.asientos_cuero=asientos_cuero;
		
		Manual
		 * if(asientos_cuero=="si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
		
		public void configura_climatizador(String climatizador) {
			if(climatizador=="si") {
				this.climatizador=true;
			}else {
				this.climatizador=false;
		}	
	}
		*/
	public void configura_asientos(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
		
		public void configura_climatizador(String climatizador) {
			if(climatizador.equalsIgnoreCase("si")) {
				this.climatizador=true;
			}else {
				this.climatizador=false;
		}	
	}
	
		
	
		
		//Lleva setter + getter
		public String dime_peso_coche() {
			int peso_carroceria=500;
			peso_total=peso_plataforma+peso_carroceria;
			
			if(asientos_cuero==true) {
				peso_total=peso_total+50;
			}
			if(climatizador==true) {
				peso_total=peso_total+20;
			}
			return "El peso del coche es " + peso_total;
		}
		
		
}
