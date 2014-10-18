package progressao;

import javax.swing.JOptionPane;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  c, v, l, m;
		v=Double.parseDouble(JOptionPane.showInputDialog("Descubra o valor do lucro de acordo com o valor da sua venda e descubra a sua margem de lucro.\nForneça o valor de revenda"));
		c=Double.parseDouble(JOptionPane.showInputDialog ("Forneça o valor de custo"));

		l=v-c;

		m=(l*100)/c;

		JOptionPane.showMessageDialog(null,"Lucro: R$ "+l+"\n Margem de lucro em porcentagem: "+m+"%");

		System.exit(0);

	}
//esse programa tem a finalidade de se descobrir quando foi o lucro e a taxa de porcentagem do lucro.
}