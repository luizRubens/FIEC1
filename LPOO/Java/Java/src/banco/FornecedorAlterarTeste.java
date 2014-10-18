package banco;

public class FornecedorAlterarTeste {

	public static void main(String[] args) {

		FornecedorDAO f = new FornecedorDAO();
		f.setNome("CAto");
		f.setEndereco ("Av. Kennedy");
		f.setTelefone ("3881-3019");
		f.setBanco ("Caixa Economica");
		f.setAgencia ("076");
		f.setConta ("03609874");
		f.setEmail ("Caixa@hotmail.com");
		System.out.println (f.inserir());
	}
}