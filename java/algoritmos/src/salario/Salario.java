package salario;
import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) 
	{

		float salario_liquido, salario_bruto, inss;
		String nome;
		nome = JOptionPane.showInputDialog("Digite o nome do funcionário");		
		salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário bruto"));
		inss = (9 * salario_bruto) / 100;
		salario_liquido = salario_bruto - inss;

		JOptionPane.showMessageDialog(null,"O nome do funcionário é "+nome+
				                           "\nO salário bruto = "+salario_bruto+
				                           "\nO salário líquido = "+salario_liquido+ 
				                           "\nO INSS = "+inss);
		
		                                 

	}

}
