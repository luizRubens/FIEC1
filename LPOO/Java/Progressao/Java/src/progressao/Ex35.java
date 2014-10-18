package progressao;

import javax.swing.JOptionPane;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v, sf, c=0, s;

		s=Double.parseDouble(JOptionPane.showInputDialog("Forneça os valores das vendas do vendedor e veja e no fim qual vai ser a comissão dele somado ao salario. \nQuando terminar de inserir os valores digite 0.\nDigite o salario do vendedor."));
		v=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda."));
		c=c+v*10/100;

		while (v!=0){

			v=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda."));

			c=c+v*10/100;
			System.out.println(c);
		}

		sf=s+c;		
		JOptionPane.showMessageDialog(null,"O valor do salario final do funcionario R$ "+sf+"\nValor de comição R$ "+c);
		System.exit(0);
	}
	//esse programa tem a finalidade de calcular a comissão de um funcionario e saber o salario final, que é o salario somado a comissão.
}
