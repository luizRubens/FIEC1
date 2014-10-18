package persistencia;

public class LerAluno {

	public static void main(String[] args) {
		Aluno a1=new Aluno ();
		try{
			a1=a1.ler("3");
			if (a1!=null);
			System.out.println(a1.ra);
			System.out.println(a1.nome);
			System.out.println(a1.curso);
			System.out.println(a1.email);
		}
		catch (Exception erro) {
			System.out.println("Não encontrado!");
		}
	}
}