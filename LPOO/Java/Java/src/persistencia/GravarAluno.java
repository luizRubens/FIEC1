package persistencia;

public class GravarAluno {

	public static void main(String[] args) {
		Aluno a1=new Aluno ();
		a1.nome = "Carlos";
		a1.ra = "3";
		a1.curso = "Informatica";
		a1.email= "van@Gmail.com";

		if (a1.gravar()){
			System.out.println("Gravado com sucesso!");
		}
		else{
			System.out.println("Falha na gravação!");
		}
	}
}
