package progressao;

import javax.swing.JOptionPane;

public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,l;
		l=Double.parseDouble(JOptionPane.showInputDialog("Calcule a area de um hexagono regular com triangulos equiláteros.\nForneça o valor do lado do hexagono."));
		a=((3*Math.sqrt(3)*(l*l)))/2;
		JOptionPane.showMessageDialog(null, "Resultado: "+a);
	}
//esse programa serve para medir a area de um hexagono regular com triangulos equiláteros no seu interior. 
}
