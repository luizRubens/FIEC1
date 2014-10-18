package estatico;

public class UsaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stua1=Alunoi
		Aluno a1 = new Aluno();
		Aluno a2 =new Aluno();
				
		a1.ra=1;
		a1.nome="Ana";
		//Escola.nome="FATEC";
		Aluno.escola=Escola.nome;//escopo global
		
		a2.ra=2;
		a2.nome="Marcos";
		System.out.println(a1.escola);
		System.out.println(a2.escola);
		System.out.println(Aluno.escola);
		
		
		
		
		
		
		
		
		
		
	}

}
