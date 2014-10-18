package herança;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Escola extends PessoaJuridica{
	protected String tipo;

	public void mostrar(){
		super.mostrar();
		System.out.println(tipo);
	}
	public void digitarTipo(){
		tipo = JOptionPane.showInputDialog("Tipo");
	}
}
