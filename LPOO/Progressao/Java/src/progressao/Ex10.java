package progressao;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 7 e veja qual é o dia da semana correspondente"));
		if (n==1){
			JOptionPane.showMessageDialog(null,"Domingo.");
		}
		if (n==2){
			JOptionPane.showMessageDialog(null,"Segunda.");
		}
		if (n==3){
			JOptionPane.showMessageDialog(null,"Terça.");
		}
		if (n==4){
			JOptionPane.showMessageDialog(null,"Quarta.");
		}
		if (n==5){
			JOptionPane.showMessageDialog(null,"Quinta.");
		}
		if (n==6){
			JOptionPane.showMessageDialog(null,"Sexta.");
		}
		if (n==7){
			JOptionPane.showMessageDialog(null,"Sabado.");
		}
		if (n>=8 || n<=0){
			JOptionPane.showMessageDialog(null,"O numero tem que ser entre 1 e 7.");
		}
		System.exit(0);		
	}
}