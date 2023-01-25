package fibonacci;
import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) 
	{

		int i, num_anterior, num_atual, novo_numero;
		num_anterior = 0;
		num_atual = 1;
		String mensagem = "o 1. número de Fibonacci é 1\n";
		for(i=2;i<=10;i++)
		{
			novo_numero = num_atual + num_anterior;
			num_anterior = num_atual;
			num_atual = novo_numero;
			mensagem = mensagem + "o "+i+". número Fibonacci é "+novo_numero+"\n";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
