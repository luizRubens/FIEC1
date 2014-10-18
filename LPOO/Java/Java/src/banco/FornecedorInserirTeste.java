package banco;

public class FornecedorInserirTeste {

	public static void main(String[] args) {

		FornecedorDAO f = new FornecedorDAO();
		f.setNome("CAto");
		f.setEndereco ("Av. Kennedy");
		f.setTelefone ("3879-3019");
		f.setBanco ("Caixa Economica");
		f.setAgencia ("076");
		f.setConta ("03609874");
		f.setEmail ("Caixa@gmail.com");
		System.out.println (f.inserir());

	}

}