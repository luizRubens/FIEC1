package texto;

public class ContatoGravacaoTeste {

	public static void main(String[] args) {

		ContatoTxt contato = new ContatoTxt();
		contato.setNome ("Luiz");
		contato.setFone("99874698");
		contato.setEmail("luiz.rubens@hotmail.com");
		System.out.println(contato.gravar());
	}
	
}
