package media_repetição;

import javax.swing.JOptionPane;

public class Media_rep {

	public static void main(String[] args) 
	{

		float nota,calc_media=0, soma_notas=0;
		int i;
		for (i=1;i<=10;i++)
		{	
			nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a "+i+". nota de 10 notas"));
			if ((nota >= 0) && (nota <= 10))
				soma_notas = soma_notas + nota;
			else 
			   {
				    JOptionPane.showMessageDialog(null,"Nota inválida, digite apenas notas de 0 a 100");
				    i=i-1;
			   }
			
		}
		calc_media = soma_notas / 10;
		JOptionPane.showMessageDialog(null,"A média geral das notas foi: "+calc_media);
		
		
	}

}
