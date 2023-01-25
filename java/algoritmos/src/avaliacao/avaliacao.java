package avaliacao;
import javax.swing.JOptionPane;

public class avaliacao {

	public static void main(String[] args) 
	{

		float custo_consumidor, custo_fabrica, perc_rev, impostos, preco_final;
		custo_fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo de fábrica"));			

		perc_rev = (25 * custo_fabrica) / 100;
		custo_consumidor = custo_fabrica + perc_rev;	
		impostos = (45 * custo_fabrica) / 100;
		
		
		
		preco_final = (custo_consumidor + impostos);
		JOptionPane.showMessageDialog(null,"O preço final é "+preco_final);
		JOptionPane.showMessageDialog(null,"O custo de fábrica é "+custo_fabrica);
		
	}

}
