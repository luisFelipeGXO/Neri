package tipos_de_operadores;
import javax.swing.JOptionPane;

public class tiposdeoperadores {

	public static void main(String[] args) 
	{

		float salario;
		int idade;
		String nome;

		nome = JOptionPane.showInputDialog("Digite seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário"));
				
		JOptionPane.showMessageDialog(null,"O nome é "+nome);
		JOptionPane.showMessageDialog(null,"Idade é "+idade);
		JOptionPane.showMessageDialog(null,"Salário é "+salario);
		

	}

}
