package view;

public class TestaLocalizacao {

	public static void main(String[] args) {

		SelecaoDAO s = new SelecaoDAO();
		Boolean x = s.localizar("3");
		if (x!=null){
			System.out.println(x.toString());

		}
		else{
			System.out.println("Não localizado.");
		}

	}

}
