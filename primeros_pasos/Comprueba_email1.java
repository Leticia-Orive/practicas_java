import javax.swing.JOptionPane;

public class Comprueba_email1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arroba=0;
		boolean punto=false;
		
		String email=JOptionPane.showInputDialog("Introduce el email ");
		
		
		for (int i=0; i<email.length();i++) {
			if(email.charAt(i)=='@') {
				arroba++;
			}
			if(email.charAt(i)=='.') {
				punto=true;
			}
		}if(arroba==1 && punto==true) {
		System.out.println("Es correcto");
	}else {
		System.out.println("No es correcto");
	}
	}

}
