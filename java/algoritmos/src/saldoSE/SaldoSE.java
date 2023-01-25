package saldoSE;
import javax.swing.JOptionPane;

public class SaldoSE {

	public static void main(String[] args) 
	{

		float saldo_inicial, cheque, saldo_final;
		saldo_inicial = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saldo inicial: "));
		cheque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cheque: "));
		if (cheque <= saldo_inicial)
		{
			saldo_final = saldo_inicial - cheque;
		    JOptionPane.showMessageDialog(null,"Novo valor do seu saldo: "+saldo_final);
		}    
		else
		{
			JOptionPane.showMessageDialog(null,"Atenção, esse cheque não pode ser descontado.");
		    JOptionPane.showMessageDialog(null,"Seu saldo continua: "+saldo_inicial);
		}
	
		}

}
