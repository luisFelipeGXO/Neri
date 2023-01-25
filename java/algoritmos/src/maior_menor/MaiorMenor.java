package maior_menor;
import javax.swing.JOptionPane;

public class MaiorMenor {

	public static void main(String[] args) 
	{

		int n1, n2, n3;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n1"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n2"));		
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n3"));
		
		if ((n1 > n2) && (n1 > n3))
			JOptionPane.showMessageDialog(null,"\nO maior é o "+n1);
		else if ((n2 > n1) && (n2 > n3))
			JOptionPane.showMessageDialog(null,"\nO maior é o "+n2);
		else
			JOptionPane.showMessageDialog(null,"\nO maior é o "+n3);
		
		if ((n1 < n2) && (n1 < n3))
			JOptionPane.showMessageDialog(null,"\nO menor é o "+n1);
		else if ((n2 < n1) && (n2 < n3))
			JOptionPane.showMessageDialog(null,"\nO menor é o "+n2);
		else
			JOptionPane.showMessageDialog(null,"\nO menor é o "+n3);		
		
		
		
		
	}

}
