package view;

public class TestaInclusao {

	public static void main(String[] args) {

		SelecaoDAO s = new SelecaoDAO();
		s.setNome("Seleção Sueca");
		System.out.println(s.gravar());

	}

}