package progressao;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		double dolar;
		double reais;
		double cotacao;

		dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto em dolares"));
		cotacao = Double.parseDouble(JOptionPane.showInputDialog("Forne�a a cota��o do dolar"));
		reais = dolar*cotacao;

		JOptionPane.showMessageDialog(null,"O valor do produto em dolares �: "+dolar+", R$ "+reais+" � o valor em reais");

	}

}
