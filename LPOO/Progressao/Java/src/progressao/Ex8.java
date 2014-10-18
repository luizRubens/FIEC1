package progressao;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=0;
		int n;
		n= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os numeros para efetuar a soma e digite 0 para finalizar o calculo"));
		while (n!=0){
			n= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os numeros para efetuar a soma e digite 0 para finalizar o calculo"));

			s=s+n;
			if (n==0){
				JOptionPane.showMessageDialog(null,"Soma: "+s);
			}
		}
		System.exit(0);
	}
}
