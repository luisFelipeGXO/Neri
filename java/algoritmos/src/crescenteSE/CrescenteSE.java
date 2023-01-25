package crescenteSE;
import javax.swing.JOptionPane;

public class CrescenteSE {

	public static void main(String[] args) 
	{

		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		
		if (a > b)
			JOptionPane.showMessageDialog(null,"Em ordem crescente B="+b+" - A="+a);
		else
			JOptionPane.showMessageDialog(null,"Em ordem crescente A="+a+" - B="+b);
	}

}
