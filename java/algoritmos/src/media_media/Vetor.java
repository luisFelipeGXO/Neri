package media_media;
import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) 
	{

		float notas [] = new float[5];
		float calc_media, soma_notas;
		int contador;
		contador = 0;
		soma_notas = 0;
		for(int i=0;i<=4;i++)
		{
			notas[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite a "+i+". nota.: "));
			soma_notas = soma_notas + notas[i];
		}
		calc_media = soma_notas / 5;
		for(int i = 0;i<=4;i++)
			if (notas[i] >= calc_media)
				contador++;
		
		JOptionPane.showMessageDialog(null,"A média geral da turma foi de.: "+calc_media+"\n"+
                contador + " alunos ficram com a notat cima da média");
	}

}
