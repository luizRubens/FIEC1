package oo;

public class AppVeiculo {
	//dia 10/02/2014
	public static void main (String[] args){
		Veiculo veiculo = new Veiculo ();
		veiculo.modelo = "Cruise";
		veiculo.fabricante = "GM";
		veiculo.motor.ligar();
		//neste momento se mandasse imprimir a velocidade iria imprimir 0.
		veiculo.mostrarVelocidade();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		//se neste momento mandasse imprimir a velocidade iria aparecer 3 pois atraves do veiculo.acelerar foi adicionado 1 na velocidde cada um.
		veiculo.mostrarVelocidade();
	}
}
