package progressao;

import javax.swing.JOptionPane;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,r1, r2;
		r1=Double.parseDouble(JOptionPane.showInputDialog("Para medir a area de uma elipse forneça os valores de acordo com  a formula da area.\nDigite o valor de r1."));
		r2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de r2."));
		a=r1*r2*3.14;
		JOptionPane.showMessageDialog(null, "Resultado: "+a);
		}
	//esse programa tem a finalidade de calcular a area de uma elipse.
}
