package dados_cliente;
import javax.swing.JOptionPane;

public class Dados_cliente {

	public static void main(String[] args) 
	{

		cadastro dados_cliente = new cadastro();
		dados_cliente.nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
		dados_cliente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cliente"));
		dados_cliente.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do Cliente"));
		
		JOptionPane.showMessageDialog(null, "Nome do cliente.: "+dados_cliente.nome+
				                            "\nIdade do Cliente .: "+dados_cliente.idade+                                        
				                            "\nSalário do Cliente .: "+dados_cliente.salario);
		
	}

}
class cadastro
{
	String nome;
	int idade;
	float salario;
	
	
}
