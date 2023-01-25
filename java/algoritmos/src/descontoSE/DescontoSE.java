package descontoSE;
import javax.swing.JOptionPane;

public class DescontoSE {

	public static void main(String[] args) 
	{

		float perc_desconto, valor_compra, total_pagar, valor_desc;
		String nome;
		
		nome = JOptionPane.showInputDialog("Digite o nome: ");
		
		valor_compra = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da compra: "));
		
		
		if (valor_compra <= 200)
			perc_desconto = 10;
		else if (valor_compra <= 500)
			perc_desconto = 15;
		else
			perc_desconto = 20;
		
		valor_desc = (perc_desconto * valor_compra) / 100;
		total_pagar = valor_compra - valor_desc;
		
		JOptionPane.showMessageDialog(null,"O nome é: "+nome+
				                           "\nValor da compra: "+valor_compra+               
				                           "\nPercentual de desconto: "+perc_desconto+
				                           "\nValor do desconto: "+valor_desc+
				                           "\nValor a pagar: "+total_pagar);
		
		
	}

}
