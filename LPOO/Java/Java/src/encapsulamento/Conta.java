package encapsulamento;
public class Conta {
	
	private double saldo;
	private int numero;
	
	public int getNumero() {
		return numero;
	}
	/**
	 * defina o numeo da conta do cliente e ele deve ser positivo
	 * @param numero
	 */
	public void setNumero(int numero) {
		if (numero>0){
			this.numero =numero;
		}
		else{
			System.out.println("Numero de conta invalido!");
		}
	}
	/**
	 * Mostra em tela o valor atuaL DO SALDO
	 */
	public void consultar (){
		System.out.println(saldo);
	}
	/**
	 * Adiciona o valor ao saldo
	 * @param: valor a ser depositado
	 */
	public void depositar(double valor){//void é sem retorno
		saldo=saldo+valor;//assim ou saldo+=valor
	}
	public void sacar(double valor){
		if (valor<=1000){
			if (valor<=saldo){
				saldo=saldo-valor;
			}
			else{
				System.out.println("Saldo insuficiente!");
			}
		}
		else{
			System.out.println("O valor a sacar não pode ser superior a R$1.000,00");			
		}
	}
}
