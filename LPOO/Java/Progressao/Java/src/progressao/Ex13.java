package progressao;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int r1;
		int n2;
		int r2;
		int n3;
		int r3;
		int n4;
		int r4;
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite 4 numeros e veja quanto eles valem ao quatrado.\nDigite o 1º numero."));
		r1=n1*n1;
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero."));
		r2=n2*n2;
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º numero."));
		r3=n3*n3;
		if (r3>=1000){
			JOptionPane.showMessageDialog(null,"O terceiro numero ao quadrado vale mais de 1000, ele vale: "+r3);
		}
		else{
			n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4º numero."));
			r4=n4*n4;
			JOptionPane.showMessageDialog(null,"Valores fornecidos: "+n1+", "+n2+", "+n3+" e "+n4+".\nRespectivos resultados:"+r1+", "+r2+", "+r3+" e "+r4);
		}
		System.exit(0);	
	}

}
