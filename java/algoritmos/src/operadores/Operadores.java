package operadores;
import javax.swing.JOptionPane;

public class Operadores {

	public static void main(String[] args) 
	{

		float num1, num2, soma, subtracao, divisao, multiplicacao;
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 1"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 2"));
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
		
		JOptionPane.showMessageDialog(null,"A soma ="+soma);
		JOptionPane.showMessageDialog(null,"A subtração = "+subtracao);
		JOptionPane.showMessageDialog(null,"A multiplicação ="+multiplicacao);
		JOptionPane.showMessageDialog(null,"A divisão = "+divisao);		
		
		
	}

}
