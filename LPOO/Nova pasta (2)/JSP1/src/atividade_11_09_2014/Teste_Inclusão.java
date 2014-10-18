package atividade_11_09_2014;

public class Teste_Inclusão {

	public static void main(String[] args) {
		
		OperadorDAO op = new OperadorDAO();

		String num01 ="17";
		String num02 = "29";
		String operador = "*";
		
		op.setNum01(num01);
		op.setNum02(num02);
		op.setOperador(operador);

		op.inserir_Operador();

	}
}
