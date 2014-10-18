package progressao;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int z;

		x=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		z=Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
		if (x>y){
			if (x>z){
				if (y>z){
					JOptionPane.showMessageDialog(null,"A ordem decrescente dos numeros é: "+x+", "+y+", "+z);
				}
				else {
					JOptionPane.showMessageDialog(null,"A ordem decrescente dos numeros é: "+x+", "+z+", "+y);

				}
			}
		}

		if (x<y){
			if (y>z){
				if (x>z){
					JOptionPane.showMessageDialog(null,"A ordem decrescente dos numeros é: "+y+", "+x+", "+z);
				}
				else {
					JOptionPane.showMessageDialog(null,"A ordem decrescente dos numeros é: "+y+", "+z+", "+x);
				}
			}
		}

		if (x<y){
			if (y>z){
				JOptionPane.showMessageDialog(null,"A ordem decrescente dos numeros é: "+z+", "+y+", "+x);	
			}
		}

		if (x>y){
			if (x<z){
				JOptionPane.showMessageDialog(null,"A ordem decrescente dos numeros é: "+z+", "+x+", "+y);	
			}
		}
		System.exit(0);
	}
}
