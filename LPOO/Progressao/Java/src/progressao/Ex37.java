package progressao;

import javax.swing.JOptionPane;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		n=Integer.parseInt(JOptionPane.showInputDialog("Insira um numero."));
		for (i=1;i<=n;i++){
			if (n%i==0){
				System.out.println(i+" ");
			}
		}
	}
	//esse programa tem a finalidade de informar os divisores do numero fornecido
}
