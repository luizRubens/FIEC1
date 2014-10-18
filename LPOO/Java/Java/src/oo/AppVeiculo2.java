package oo;

public class AppVeiculo2 {
	//dia 10/02/2014
	public static void main (String[] args){
		Veiculo veiculo = new Veiculo ();
		veiculo.modelo = "Cruise";
		veiculo.fabricante = "GM";
		veiculo.motor.ligar();
		//neste momento se mandasse imprimir a velocidade iria imprimir 0.
		veiculo.mostrarVelocidade();
		for (int i=0;i<100;i++){ // esse laço de repetição repete o acelerar até atingir 100
			veiculo.acelerar();
		}
		veiculo.mostrarVelocidade();
	}
}