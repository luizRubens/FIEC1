package banco;

public class FornecedorExcluirTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FornecedorDAO f = new FornecedorDAO();
		f.setId(5);
		System.out.println(f.excluir());
		
	}
}
