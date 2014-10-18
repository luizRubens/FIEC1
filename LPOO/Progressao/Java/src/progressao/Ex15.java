package progressao;

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		
		n= Double.parseDouble(JOptionPane.showInputDialog("Digite o nivel de poluição e veja qual deve ser a notificação adequada para a empresa."));

		if (n==0.25){
			JOptionPane.showMessageDialog(null,"O nivel de poluição ainda é aceitavel.");

		}
		if (n==0.3){
			JOptionPane.showMessageDialog(null,"As industrias do 1º grupo são entimadas a suspender as atividades.");

		}
		if (n==0.4){
			JOptionPane.showMessageDialog(null,"As industrias do 1º e 2º grupo é entimado a suspender as atividades.");

		}
		if (n==0.5){
			JOptionPane.showMessageDialog(null,"Todos os grupos devem ser notificados a paralisarem suas atividades.");

		}
		if (n>=0.6 || n<=0.24){
			JOptionPane.showMessageDialog(null,"Nivel de poluição incorreto.");

		}
		System.exit(0);	
	}
}
