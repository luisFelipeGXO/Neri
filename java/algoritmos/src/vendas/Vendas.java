package vendas;
import javax.swing.JOptionPane;

public class Vendas {

	public static void main(String[] args) 
	{

		float fixo, comissao,salario;
		int vendas;
		fixo = 800;
		
		vendas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas"));
		comissao = (15 * vendas) / 100;
		salario = (fixo + comissao);

		JOptionPane.showMessageDialog(null,"O salário do funcionário é"+salario);
		
	}

}
