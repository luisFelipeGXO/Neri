package tabuada;
import javax.swing.JOptionPane;

public class Tabuada_while {

	public static void main(String[] args) 
	{

		int i, numero;
		i = 1;
		String mensagem = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		while (i <= 9)
		{
		   mensagem = mensagem + "\n"+numero +" x "+i+" = "+(numero * i);
		   i++;
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}

}