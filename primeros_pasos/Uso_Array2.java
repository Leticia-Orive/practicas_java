import javax.swing.*;
public class Uso_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de la matriz
		String [] paises = new String[8];
		
		/*paises[0]="España";
		paises[1]="Francia";
		paises[2]="Croacia";
		paises[3]="Marruecos";
		paises[4]="Argentina";
		paises[5]="Portugal";
		paises[6]="Japón";
		paises[7]="Inglaterra";*/
		
		//Array simplificado
		//String [] paises= {"España","Francia","Croacia","Marruecos","Argentina","Portugal","Japón","Inglaterra"};
		
		
		/*bucle for
		for( int i=0; i<paises.length; i++) {
			System.out.println(" País " + (i+1) + " " + paises[i]);
		}*/
		
		for(int i=0; i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
		}
		
		
		//for each
		for(String elemento:paises) {
			System.out.println("País: "  + elemento);
		}
		
	}

}
