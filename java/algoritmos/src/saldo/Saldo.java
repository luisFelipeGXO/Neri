package saldo;
import javax.swing.JOptionPane;

public class Saldo {

	public static void main(String[] args) 
	{

		float cheque, saldo;
		saldo = 500;
		
		cheque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cheque que entrou"));
		saldo = saldo - cheque;
		JOptionPane.showMessageDialog(null,"O saldo é de "+saldo);
		
	}

}
