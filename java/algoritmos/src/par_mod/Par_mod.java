package par_mod;
import javax.swing.JOptionPane;

public class Par_mod {

	public static void main(String[] args) 
	{

		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		if (numero % 2 == 0)
			JOptionPane.showMessageDialog(null,"O número "+numero+" é par");
		else
			JOptionPane.showMessageDialog(null,"O número "+numero+" é ímpar");
		
	}

}
