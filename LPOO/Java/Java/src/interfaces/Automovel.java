package interfaces;

public class Automovel implements Motor,TetoSolsar {//implements motor é a contrato onde a classe tem que possuir os mesmos metodos da classes interfaces.
	//isso é uma implemkentação, pois aqui tem codigo dentro do metodo e implementa dá uma utilidade pro metodo.
	public void ligar (){
		System.out.println("Ligando o veiculo");
	}
	public void desligar (){
		System.out.println("Desligando o veiculo");
	}
	public void acelerar (){
		System.out.println("Acelerando o veiculo");
	}
	public void frear (){
		System.out.println("Freando o veiculo");
	}
	public void abrir() {
		System.out.println("Abrindo teto solar");
	}
	public void fechar() {
		System.out.println("Fechando teto solar");
	}




}
