package progressao;

import javax.swing.JOptionPane;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Numeros multiplos de 5 entre 100 e 700, mas que tambem n�o sejam multiplos de 4");

		for (int i=100; i<=700;i++){
			if ((i%5==0)&&(i%4!=0)){
				System.out.println(i+" ");
			}
		}
		System.exit(0);
	}
	// tem a finalidade de determinar os m�ltiplos de 5 que n�o sejam m�ltiplos de 4 entre 100 e 700.
}
