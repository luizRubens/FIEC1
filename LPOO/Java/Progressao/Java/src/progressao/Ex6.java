package progressao;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,n4;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Insira 4 numeros e veja quais s�o divisiveis por 2 e por 3.\nInsira o primeiro numero" ));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero" ));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero" ));
		n4=Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto numero" ));

		System.out.println("Numeros divisiveis por 2 e 3");
		if (n1%2==0){
			if (n1%3==0){
				System.out.println(n1);
			}
		}
		if (n2%2==0){
			if (n2%3==0){
				System.out.println(n2);
			}
		}
		if (n3%2==0){
			if (n3%3==0){
				System.out.println(n3);
			}
		}
		if (n4%2==0){
			if (n4%3==0){
				System.out.println(n4);
			}
		}
		System.exit(0);
	}
}
