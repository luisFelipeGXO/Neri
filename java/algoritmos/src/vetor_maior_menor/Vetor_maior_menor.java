package vetor_maior_menor;
import javax.swing.JOptionPane;

public class Vetor_maior_menor {

	public static void main(String[] args) 
	{

		int maior_menor [] = {22,3,7,8,15,9,11,7,6,4};
		int i, maior=0, menor=99999;
		for (i=0;i<=9;i++)
		{
			if (maior_menor[i] > maior)
				maior = maior_menor[i];
			if (maior_menor[i] < maior)
				menor = maior_menor[i];
		}
		JOptionPane.showMessageDialog(null,"O maior valor.: "+maior+
				                       "\nO menor valor.: "+menor);
		
	}

}
