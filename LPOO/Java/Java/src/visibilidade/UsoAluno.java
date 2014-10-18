package visibilidade;

public class UsoAluno {
	public static void main (String[]args){ 
		Aluno a1=new Aluno ();
		Aluno a2=new Aluno ();

		a1.setNome ("Yuri");
		a1.setSexo ('M');
		a1.setIdade (17);
		a1.setCalouro (false);
		a1.setRa("123456");
		System.out.println(a1.getRa());
		System.out.println(a1.getNome());
		System.out.println(a1.getSexo());
		System.out.println(a1.getIdade());
		System.out.println(a1.isCalouro ());

		a2.setNome ("Gabriely");
		a2.setSexo ('F');
		a2.setIdade (18);
		a2.setCalouro (false);
		System.out.println(a2.getRa());
		System.out.println(a2.getNome());
		System.out.println(a2.getSexo());
		System.out.println(a2.getIdade());
		System.out.println(a2.isCalouro ());

	}
}
