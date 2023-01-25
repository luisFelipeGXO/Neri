package triangulo;
import javax.swing.JOptionPane;

public class Triângulo {

	public static void main(String[] args) 
	{

		int le,ld,li;
		le = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de LE"));
		ld = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de LD"));
		li = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de LI"));
		
		if ((li < (le + ld)) && (le < (ld + li)) && (ld < (le + li)))
				if ((le == ld) && (le == li))
				JOptionPane.showMessageDialog(null,"Triângulo Equilátero");
				else if ((li == ld) || (li == le) || (le == ld))
				JOptionPane.showMessageDialog(null,"Triângulo Isósceles");
				else
				JOptionPane.showMessageDialog(null,"Triângulo Isósceles");
		else
			JOptionPane.showMessageDialog(null,"Não pode ser um trângulo");
		 
		

	}

}
