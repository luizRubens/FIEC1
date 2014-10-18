package beans;

public class Produto_Inserir_Teste {

	public static void main(String[] args) {

		ProdutoDAO p = new ProdutoDAO();

		p.setCod_produto(2);

		System.out.println(p.Excluir());

	}
}