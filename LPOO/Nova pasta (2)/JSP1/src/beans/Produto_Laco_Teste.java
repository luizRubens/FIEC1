package beans;

public class Produto_Laco_Teste {

	public static void main(String[] args) {

		ProdutoDAO d = new ProdutoDAO();

		d.setDescricao("chocolate em pó");
		d.setPreco(2);
		d.setCod_produto(665);

		System.out.println(d.Alterar());
	}
}