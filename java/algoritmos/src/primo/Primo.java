package primo;
import javax.swing.JOptionPane;

public class Primo {

	public static void main(String[] args) 
	{

		int numero, i;
		boolean contador = true;
		i = 2;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		while (i < numero)
		{
			if (numero % i == 0)
				contador = false;
			i++;
		}
		if (contador)
			JOptionPane.showMessageDialog(null, "O número "+numero+" é primo");
		else 
			JOptionPane.showMessageDialog(null, "O número "+numero+" não é primo");
	}

}
