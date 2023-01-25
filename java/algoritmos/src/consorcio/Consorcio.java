package consorcio;
import javax.swing.JOptionPane;

public class Consorcio {

	public static void main(String[] args) 
	{

		float total_pago, saldo_devedor, valor_atual_prest,total_prest;
		int quant_prest_pagas;
		
		total_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total da prestação"));
		quant_prest_pagas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de prestações pagas"));
		valor_atual_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor atual da preestação"));
		
		
        total_pago = quant_prest_pagas * valor_atual_prest;
        saldo_devedor = total_prest - total_pago;
        
        JOptionPane.showMessageDialog(null,"O total pago é "+total_pago+
        		                           "\nO saldo devedor é "+saldo_devedor);
		
		
	}

}
