package visibilidade;

public class Pneu {
	
	private String fabricante;
	private int diametro;
	private double preco;

	//receita de bolo
	/*
	 * Metodo set:
	 * inicia com public
	 * sempre é void
	 * seu nome é:set+nome do Atributo
	 * seu conteudo é:
	 * seu conteudo é: this.nome do atributo = nome do atributo
	 */
	public void setFabricante (String fabricante){
		this.fabricante=fabricante; //this é uma palvra que se refere ao metodo que chamou o metodo
	}
	public void setDiametro (int diametro){
		this.diametro = diametro; 
	}
	public void setPreco (double preco){
		this.preco = preco; 
	}
	public String getFabricante (){
		return this.fabricante; //this é uma palvra que se refere ao metodo que chamou o metodo
	}
	public int getDiametro (){
		return this.diametro; 
	}
	public double getPreco (){
		return this.preco; 
	}
}
