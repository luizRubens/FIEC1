package estatico;

public class UsaFuncionario {

	
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome="Fulano";
		f1.idade=28;
		f1.organizacao=Organizacao.nome;
		System.out.println(f1.nome);
		System.out.println(f1.idade);
		System.out.println(f1.organizacao);
			
	}

}
