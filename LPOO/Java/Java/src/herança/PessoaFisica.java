package herança;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {
	protected String rg;
	protected String cpf;
	protected String sexo;


	public void mostrar(){
		super.mostrar();//chama o metodo mostrar da classe generica(pessoa)
		System.out.println(rg);
		System.out.println(cpf);
		System.out.println(sexo);
	}
	public void digitarRg(){
		rg = JOptionPane.showInputDialog("RG");
	}
	public void digitarCpf(){
		cpf = JOptionPane.showInputDialog("CPF");
	}
	public void digitarSexo(){
		sexo = JOptionPane.showInputDialog("Sexo");
	}
}



