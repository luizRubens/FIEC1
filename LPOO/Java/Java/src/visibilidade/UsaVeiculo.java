package visibilidade;

public class UsaVeiculo {
	
	public static void main (String[]args){ 
		
		Veiculo v=new Veiculo ();  //quando alguma coisa � privada ele � acessivel somente na propria classe como objeto, atributo.
		
		//o private ele serve como auxiliar para controlar um atributo, todo atributo private prescisa exigir dois metodo publico (pois um guarda o metodo e o outro prescisa devolver), em compensa��o o private facilita o encapsulamento                        
		
		v.guardarAno (2000);//aqui ja existe uma comunica��o entre as classes

	}
}
