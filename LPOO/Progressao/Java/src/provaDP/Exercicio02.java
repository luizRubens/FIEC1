package provaDP;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		int n1,n2,n3,n4;

		n1=Integer.parseInt(JOptionPane.showInputDialog("Insira 4 numeros e veja quais s�o divisiveis por 2 e por 3.\nInsira o primeiro numero" ));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero" ));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero" ));
		n4=Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto numero" ));

		System.out.println("Numeros divisiveis por 3 e 5");
		if (n1%3==0){
			if (n1%5==0){
				System.out.println(n1);
			}
		}
		if (n2%3==0){
			if (n2%5==0){
				System.out.println(n2);
			}
		}
		if (n3%3==0){
			if (n3%5==0){
				System.out.println(n3);
			}
		}
		if (n4%3==0){
			if (n4%5==0){
				System.out.println(n4);
			}
		}
		System.exit(0);
	}

}
