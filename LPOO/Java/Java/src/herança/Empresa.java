package herança;

import javax.swing.JOptionPane;

public class Empresa extends PessoaJuridica {
	protected String ramo;

	public void mostrar(){
		super.mostrar();
		System.out.println(ramo);
	}
	public void digitarRamo(){
		ramo = JOptionPane.showInputDialog("Ramo");
	}

}
