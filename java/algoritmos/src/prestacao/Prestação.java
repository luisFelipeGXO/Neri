package prestacao;
import javax.swing.JOptionPane;

public class Prestação {

	public static void main(String[] args) 
	{

		float valor, taxa, prestacao;
		int tempo;
		valor =  Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da prestação"));
		taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da taxa"));
		tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de atraso"));
		prestacao = valor + (valor * (taxa / 100) * tempo);
		
		JOptionPane.showMessageDialog(null,"O valor corrigido da prestação é: "+prestacao);
		
	}

}
