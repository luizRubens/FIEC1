package herança;

import javax.swing.JOptionPane;

public class Pessoa {
	protected String nome;
	protected String endereco;
	protected int codigo;

	public void mostrar(){
		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(codigo);
	}
	public void digitarCodigo(){
		codigo = Integer.parseInt(
				JOptionPane.showInputDialog("Codigo"));
	}
	public void digitarNome(){
		nome = JOptionPane.showInputDialog("Nome");
	}
	public void digitarEndereco(){
		endereco = JOptionPane.showInputDialog("Endereço");
	}

}
