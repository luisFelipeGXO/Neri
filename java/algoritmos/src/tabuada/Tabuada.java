package tabuada;
import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) 
	{

		int i, numero;
		String mensagem = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		for(i=1;i <= 9;i++)
			mensagem = mensagem + "\n"+numero +" x "+i+" = "+(numero * i);
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}

}
