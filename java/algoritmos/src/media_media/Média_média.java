package media_media;
import javax.swing.JOptionPane;

public class Média_média {

	public static void main(String[] args) 
	{

		float nota1, nota2, nota3, nota4, nota5, calc_media, soma_notas;
		int contador;
		contador = 0;
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1. nota.: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2. nota.: ")); 
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3. nota.: "));
		nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 4. nota.: "));
		nota5 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 5. nota.: "));
		
		soma_notas = nota1 + nota2 + nota3 + nota4 + nota5;
		calc_media = soma_notas / 10;
		if (nota1 > calc_media)
			contador++;
		if (nota2 > calc_media)
			contador++;
		if (nota3 > calc_media)
			contador++;
		if (nota4 > calc_media)
			contador++;
		if (nota5 > calc_media)
			contador++;
		JOptionPane.showMessageDialog(null,"A média geral da turma foi de.: "+calc_media+"\n"+
				                            contador + " alunos ficram com a notat cima da média");
		
		
		
		
	}

}
