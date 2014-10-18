package exercicio01;

public class Testa_livro extends Livro{

	public static void main(String[] args) {

		Livro l1 = new Livro();
		
		l1.setAno(2014);
		l1.setCodigo(1);
		l1.setEditora("Nova Brasil");
		l1.setPreco(200);
		l1.setTitulo("A Maior Aventura da Nossa Vida");
		
		System.out.println(l1);

	}

}
