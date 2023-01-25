package matriz3x3;
import javax.swing.JOptionPane;

public class Matriz3x3 {

	public static void main(String[] args) 
	{

		int exerc_matriz [][] = new int [3][3];
		String mensagem = "";
		for(int l=0;l<=2;l++)
			for(int c=0;c<=2;c++)
			{
				exerc_matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para exer_matriz["+l+","+c+"].: "));
				mensagem = mensagem + "\nO valor de exerc_matriz["+l+","+c+"].: "+exerc_matriz[l][c];
			}
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
