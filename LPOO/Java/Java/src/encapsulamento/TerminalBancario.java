package encapsulamento;

public class TerminalBancario {

public static void main(String[] args) {
	
		Conta conta1 = new Conta();
		conta1.depositar(250);
		conta1.depositar(100);
		conta1.consultar();
		conta1.sacar(500);
		conta1.consultar();
		conta1.depositar(500);
	}
	//as regras relativas ao funcionamento do banco podem afetar os metodos.
	//exemplos:
	//1. O valor maximo a ser sacado não pode exceder a R$ 1.000,00.
	//2. O saque só pode ser realizado se houver saldo suficiente.
}
