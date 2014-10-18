package oo;
// dia 10/02/2014
public class Veiculo {
	public String modelo, fabricante;
	public int velocidade;
	public Motor motor = new Motor();
	public void acelerar (){
		if (velocidade<100){
			velocidade++;	
		}
	}
	public void frear(){
		velocidade--;
	}
	public void mostrarVelocidade (){
		System.out.println (velocidade);
	}
}
