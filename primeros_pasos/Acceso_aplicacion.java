import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Leticia";
		
		String password=""; //Texto vacio
		
		while (clave.equals(password)==false) {
			password=JOptionPane.showInputDialog("Introduce la contraseña, por favor ");
			
			if(clave.equals(password)==false) {
				System.out.println("Contraseña incorrecta ");
			}
		}
		System.out.println("Contraseña correcta, acceso permitido ");
	}
	

}
