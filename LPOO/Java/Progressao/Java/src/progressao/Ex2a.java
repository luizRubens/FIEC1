package progressao;

import javax.swing.JOptionPane;

public class Ex2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int a1;
		int a2;
		int m;
		int m2;
		double di;
		a = Integer.parseInt(JOptionPane.showInputDialog("Dada a formula matematica forne�a devidamente os valores\nDigite o valor de A na formula"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B na formula"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C na formula"));
		d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de D na formula"));
		e = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de E na formula"));
		f = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de F na formula"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de G na formula"));
		h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de H na formula"));
		i = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de I na formula"));
		j = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de J na formula"));
		a1=(a-b)+(e+f);
		a2=(c-d)+(g+h);
		m=(a1*i);
		m2=(a2*j);
		di=(m/m2);
		JOptionPane.showMessageDialog(null,"O resultado �: "+di);
	}
}