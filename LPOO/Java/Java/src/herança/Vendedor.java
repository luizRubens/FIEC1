package herança;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario{
	protected double comissao;
	public void mostrar(){
		super.mostrar();
		System.out.println(comissao);
	}
	public void digitarComissao(){
		comissao = Integer.parseInt(JOptionPane.showInputDialog("Comissão"));
	}
}

