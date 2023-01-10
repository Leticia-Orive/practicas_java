
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos un array
		//Se puede poner asi
		int mi_matriz[]=new int[5];
		/* o
		  int [] mi_matriz=new int[5]
		 */
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;
		
		//Cuando tenemos pocos array lo podemos poner asi
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		
		//Cuando tenemos muchas array 
		for(int i=0;i<5;i++) {
			System.out.println("Valor del índice " +  i + " = " + mi_matriz[i]);
		}
		
	}

}
