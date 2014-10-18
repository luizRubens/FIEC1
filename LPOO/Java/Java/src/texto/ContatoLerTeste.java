package texto;

public class ContatoLerTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContatoTxt contato = new ContatoTxt();
		contato.setNome ("Luiz");

		Contato c=contato.ler ();
		if (c!=null){
			System.out.println(c.getNome());
			System.out.println(c.getFone());
			System.out.println(c.getEmail());
		}
		else{
			System.out.println("Não encontrado!");
		}
	}
}