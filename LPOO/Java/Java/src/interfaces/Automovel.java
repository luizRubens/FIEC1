package interfaces;

public class Automovel implements Motor,TetoSolsar {//implements motor � a contrato onde a classe tem que possuir os mesmos metodos da classes interfaces.
	//isso � uma implemkenta��o, pois aqui tem codigo dentro do metodo e implementa d� uma utilidade pro metodo.
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
