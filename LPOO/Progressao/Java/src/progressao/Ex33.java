package progressao;

import javax.swing.JOptionPane;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p, sb, ve;

		p=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do emprestimo."));
		sb=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario bruto"));
		ve=(sb*0.3);
		if(p>ve){
			JOptionPane.showMessageDialog(null,"Voce pode emprestar no maximo R$ "+ve+"\nEmprestimo negado!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Voce pode emprestar no maximo R$ "+ve+"\nEmprestimo aprovado!");

		}

		System.exit(0);

	}
	//esse programa serve para se descobrir se uma pessoa pode fazer um emprestimo.
}
