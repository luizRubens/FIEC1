package progressao;

import javax.swing.JOptionPane;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a, r;
			r=Double.parseDouble(JOptionPane.showInputDialog("Calcule a area do circulo.\nDigite o valor do raio."));
			a=r*r*3.14;
			JOptionPane.showMessageDialog(null,"O valor da area do circulo é de: "+a);
			System.exit(0);
	}
//esse programa serve para clacular a area de um circulo
}
