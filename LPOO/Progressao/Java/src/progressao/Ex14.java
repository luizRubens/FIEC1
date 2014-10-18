package progressao;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		double p0;
		double p1;
		double p2;
		double p3;
		double p4;
		double p5;
		double p6;
		double p7;
		double p8;
		double p9;
		double p10;
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero e veja as potencias dele do 0 ao 10."));
		p0=0+1;
		p1=n*1;
		p2=n*n;
		p3=n*n*n;
		p4=n*n*n*n;
		p5=n*n*n*n*n;
		p6=n*n*n*n*n*n;
		p7=n*n*n*n*n*n*n;
		p8=n*n*n*n*n*n*n*n;
		p9=n*n*n*n*n*n*n*n*n;
		p10=n*n*n*n*n*n*n*n*n*n;
		JOptionPane.showMessageDialog(null,n+" Elevado a 0 = "+p0+"\n"+n+" Elevado a 1 = "+p1+"\n"+n+" Elevado a 2 = "+p2+"\n"+n+" Elevado a 3 = "+p3+"\n"+n+" Elevado a 4 = "+p4+"\n"+n+" Elevado a 5 = "+p5+"\n"+n+" Elevado a 6 = "+p6+"\n"+n+" Elevado a 7 = "+p7+"\n"+n+" Elevado a 8 = "+p8+"\n"+n+" Elevado a 9 = "+p9+"\n"+n+" Elevado a 10 = "+p10);

		System.exit(0);	

	}

}
