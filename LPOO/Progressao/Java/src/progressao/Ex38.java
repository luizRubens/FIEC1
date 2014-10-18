package progressao;

import javax.swing.JOptionPane;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double custo, total=0, preco=60.0;
		n=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de noite no hotel"));
		for(int i = 1;i<=n;i++){
			custo=preco/i;
			System.out.println("Custo da "+i+"º noite = "+custo);
			total=total+custo;
		}
		System.out.println("Custo total da estadia R$ "+total);
	}
	//esse programa tem a finalidade de calcular quando custara a estadia de uma pessoa em um hotel, sendo que conforme ele fica mais no hotel vai diminiundo o preço de cada diaria.
}
