package mediaSE;
import javax.swing.JOptionPane;

public class MediaSE {

	public static void main(String[] args) 
	{

		float nota1, nota2, nota3, media;
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota do aluno"));
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		if (media >= 6)
			JOptionPane.showMessageDialog(null,"Aproavdo com média = "+media);
		else if (media >= 4)
			JOptionPane.showMessageDialog(null,"Recuperação com média = "+media);		
		else
			JOptionPane.showMessageDialog(null,"Reprovado com média = "+media);
		
	}

}
