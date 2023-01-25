package troca;
import javax.swing.JOptionPane;

public class Troca {

	public static void main(String[] args) 
	{

		int A,B,C;
		A = 5;
		B = 10;
		C = A;
		A = B;
		B = C;
		
		JOptionPane.showMessageDialog(null,"A = "+A);
		JOptionPane.showMessageDialog(null,"B = "+B);		
		
	}

}
