package interfaces;

public class Moto implements Motor {

	public void ligar (){
		System.out.println("Ligando o moto");
	}
	public void desligar (){
		System.out.println("Desligando o moto");
	}
	public void acelerar (){
		System.out.println("Acelerando o moto");
	}
	public void frear (){
		System.out.println("Freando o moto");
	}
}
