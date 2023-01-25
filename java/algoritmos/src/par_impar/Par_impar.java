package par_impar;
import javax.swing.JOptionPane;

public class Par_impar {

	public static void main(String[] args) 
	{

		int numero_inicial, numero_final, numeros_pares, numeros_impares,i;
		numeros_pares = 0;
		numeros_impares = 0;
		numero_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digiteo o número inicial.: "));
		i = numero_inicial;
		do
		{
			numero_final = Integer.parseInt(JOptionPane.showInputDialog("Digiteo o número final.: "));
			if (numero_final < numero_inicial)
				JOptionPane.showMessageDialog(null, "Número final invalido, tem que ser maior do que "+numero_inicial);
			
		}
		while(numero_final < numero_inicial);
		
		while (i <= numero_final)
		{
			if (i % 2 == 0)
				numeros_pares++;
			else 
				numeros_impares++;
			i++;	
		}

		JOptionPane.showMessageDialog(null, "Entre o número "+numero_inicial+" e o numero "+numero_final+" existem "+numeros_pares+" pares e "+numeros_impares+" impares");
		
		
		
	}

}
