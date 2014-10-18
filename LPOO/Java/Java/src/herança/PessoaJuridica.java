package herança;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa{

	protected String cnpj;
	protected String inscricao;
	public void mostrar(){
		super.mostrar();
		System.out.println(cnpj);
		System.out.println(inscricao);
	}
	public void digitarCnpj(){
		cnpj = JOptionPane.showInputDialog("CNPJ");
	}
	public void digitarInscricao(){
		inscricao = JOptionPane.showInputDialog("Inscrição");
	}
}

