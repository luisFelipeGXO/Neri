package tabuada;
import javax.swing.JOptionPane;

public class Tabuada_do {

	public static void main(String[] args) 
	{

		int i, numero;
		i = 1;
		String mensagem = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		
		do
		{
			 mensagem = mensagem + "\n"+numero +" x "+i+" = "+(numero * i);
			 i++;	
			
			
		}
		while (i <= 9);
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}

}