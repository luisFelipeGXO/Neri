package vendas2;
import javax.swing.JOptionPane;

public class Vendas2 {

	public static void main(String[] args) 
	{

		float fixo, salario;
		int vend; 
		fixo = 500;
		vend = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas "));
		salario = fixo + (vend * 50); 
		JOptionPane.showMessageDialog(null,"O salário é "+salario);

	}

}
