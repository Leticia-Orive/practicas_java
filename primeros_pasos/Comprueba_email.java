import javax.swing.JOptionPane;

public class Comprueba_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba=false;
		
		String email=JOptionPane.showInputDialog("Introduce el email ");
		
		//Lenght : devuelve la longitud de una variable
		for (int i=0; i<email.length();i++) {
			if(email.charAt(i)=='@') {
				arroba=true;
			}
		}if(arroba==true) {
		System.out.println("Es correcto");
	}else {
		System.out.println("No es correcto");
	}
		//System.out.println(email.length());
	}
	

}
