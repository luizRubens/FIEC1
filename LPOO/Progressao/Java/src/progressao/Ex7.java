package progressao;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int soma;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A, B e C e descubra se A + B é maior do que C.\nDigite o valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
		soma = a+b;
		if (soma>c){
			JOptionPane.showMessageDialog(null,"A soma de A+B é maior do que C.");
		}
		if (soma==c){
			JOptionPane.showMessageDialog(null,"A soma de A+B é igual a C.");
		}
		else if (c>soma){
			JOptionPane.showMessageDialog(null,"C é maior do que a soma de A+B");
		}
		System.exit(0);
	}
}
