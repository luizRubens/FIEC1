package progressao;

import javax.swing.JOptionPane;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l2, l, p, a;
		l=Double.parseDouble(JOptionPane.showInputDialog("Descubra a area e o perimetro de um retangulo ou mesmo de um quadrado.\nForne�a o valor do primeiro lado."));
		l2=Double.parseDouble(JOptionPane.showInputDialog("Forne�a o valor do segundo lado"));
		a=l*l2;
		p=l*2+l2*2;

		JOptionPane.showMessageDialog(null, "Area: "+a+"\nPerimetro: "+p);

		System.exit(0);
	}
	//para calcular a area e o perimetro de um quatrado ou um retangulo.
}
