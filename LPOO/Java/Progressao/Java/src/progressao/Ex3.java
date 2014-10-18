package progressao;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		int i;
		int h;
		double sb;
		double sl;
		double sl1;
		n =JOptionPane.showInputDialog("Digite o nome do funcionario");
		i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario"));
		h = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario bruto do funcionario"));
		sl = sb*10/100;
		sl1=sb-sl;
		JOptionPane.showMessageDialog(null,"Dados do funcionario\nNome: "+n+"\nIdade: "+i+"\nHoras trabalhadas: "+h+"\nSalario bruto: "+sb+"\nSalario liquido considerando o desconto de 10%: "+sl1);
		System.exit(0);
	}
}