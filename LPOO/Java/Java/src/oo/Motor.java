package oo;
//exercicio numero 1 dia 10/02/2014
public class Motor {
	public String cor;
	public int preço;
	public int cavalos;
	public String marca;
	public boolean status;

	public void ligar(){
		status = true;
		/**
		 * definindo status como true
		 */
	}
	public void desligar (){
		status = false;
		/**
		 * definindo status como false
		 */
	}
	public void mostrarStatus (){
		if (status ==true){
			System.out.println("Motor ligado e funcionando!");}
		else { System.out.println ("O motor esta desligado");

		}
	}
}
