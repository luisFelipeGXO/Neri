package avaliacao2;
import javax.swing.JOptionPane;

public class Avaliação2 {

	public static void main(String[] args) 
	{

		float nota1, nota2, nota3, media;
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota do aluno"));
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		JOptionPane.showMessageDialog(null,"A média final foi "+media);	
	
		
	}

}
