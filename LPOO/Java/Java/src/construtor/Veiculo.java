package construtor;

public class Veiculo {
	
	public String placa;
	public String marca;
	public String modelo;
	public int ano;
	public String cor;

	public Veiculo(){

	}

	public Veiculo (String placa,String marca){
		this.placa=placa;
		this.marca=marca;
	}

	public Veiculo (String placa){
		this.placa=placa;
	}

	public Veiculo (String placa, String marca, String modelo){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
	}
	public Veiculo (String placa, String marca,String modelo, int ano){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
	}
}
