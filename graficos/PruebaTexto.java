package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto mimarco=new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//mimarco.setVisible(true);

	}

}
class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setBounds(600,300,600,350);
		LaminaTexto milamina=new LaminaTexto();
		add(milamina);
		setVisible(true);
	}
}
class LaminaTexto extends JPanel{
	public LaminaTexto() {
		setLayout(new BorderLayout());
		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new FlowLayout());
		resultado=new JLabel("",JLabel.CENTER);
		JLabel texto1=new JLabel("Email: ");
		milamina2.add(texto1);
		campo1=new JTextField(20);
		milamina2.add(campo1);
		add(resultado,BorderLayout.CENTER);
		JButton miboton=new JButton("Comprobar");
		DameTexto mievento=new DameTexto();
		miboton.addActionListener(mievento);
		milamina2.add(miboton);
		add(milamina2,BorderLayout.NORTH);
		//System.out.println(campo1.getText().trim());/*.trim quita espacio adicionales*/
	}
	private  class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int correcto=0;
			String email=campo1.getText().trim();
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					correcto++;
				}
				
			}
			if(correcto!=1) {
				resultado.setText("Incorrecto");
				//System.out.println("Incorrecto");
			}else {
				resultado.setText("Correcto");
				//System.out.println("Correcto");
			}
			
			
		}
			
	}
	private JTextField campo1;
	private JLabel resultado;
}
