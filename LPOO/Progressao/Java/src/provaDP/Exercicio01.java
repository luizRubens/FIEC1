package provaDP;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		double n1,n2,n3,n4,m;

		n1=Double.parseDouble(JOptionPane.showInputDialog("Calcule a media de um aluno e veja se ele esta aprovado ou reprovado.\nDigite a primeira nota."));
		n2= Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota."));
		n3= Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota."));
		n4= Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota."));

		m=(n1+n2+n3+n4)/5;

		if(m>=5){

			JOptionPane.showMessageDialog(null, "Aluno aprovado!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Aluno reprovado!");
		}
		System.exit(0);	
	}
}