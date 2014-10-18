package herança;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica {

	protected double salario;
	public void mostrar(){
		super.mostrar();
		System.out.println(salario);
	}
	public void digitarSalario(){
		salario = Double.parseDouble(
				JOptionPane.showInputDialog("Salario"));
	}
}

