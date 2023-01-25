package abc_crescente;
import javax.swing.JOptionPane;

public class Abc_crescente {

	public static void main(String[] args) 
	{
		int a,b,c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C "));

		if ((a <= b) && (a <= a))
			if (b <= c)
				JOptionPane.showMessageDialog(null, "Em ordem crescente.: "+a+"-"+b+"-"+c);
			else 
				JOptionPane.showMessageDialog(null, "Em ordem crescente.: "+a+"-"+c+"-"+b);
		else if ((b <= a) && (b <= c))
			if (a <= c)
				JOptionPane.showMessageDialog(null, "Em ordem crescente.: "+b+"-"+a+"-"+c);
			else 
				JOptionPane.showMessageDialog(null, "Em ordem crescente.: "+b+"-"+c+"-"+a);
		else if (a <= c)
			JOptionPane.showMessageDialog(null, "Em ordem crescente.: "+c+"-"+a+"-"+b);
		else 
			JOptionPane.showMessageDialog(null, "Em ordem crescente.: "+c+"-"+b+"-"+a);

		
	}

}
