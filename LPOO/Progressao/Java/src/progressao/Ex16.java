package progressao;

import javax.swing.JOptionPane;

public class Ex16 {
	public static void main(String[] args) {
		int i;
		i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade de um nadador e veja a qual categoria ele pertençe."));
		if (i<=4){
			JOptionPane.showMessageDialog(null,"Ainda não existe categoria para crianças menores de 5 anos." );
		}
		if (i==5){
			JOptionPane.showMessageDialog(null,"Categoria Infantil A = 5 a 7 anos.");
		}
		if (i==6){
			JOptionPane.showMessageDialog(null,"Categoria Infantil A = 5 a 7 anos.");
		}
		if (i==7){
			JOptionPane.showMessageDialog(null,"Categoria Infantil A = 5 a 7 anos.");
		}
		if (i==8){
			JOptionPane.showMessageDialog(null,"Categoria Infantil B = 8 a 11 anos.");
		}
		if (i==9){
			JOptionPane.showMessageDialog(null,"Categoria Infantil B = 8 a 11 anos.");
		}
		if (i==10){
			JOptionPane.showMessageDialog(null,"Categoria Infantil B = 8 a 11 anos.");
		}
		if (i==11){
			JOptionPane.showMessageDialog(null,"Categoria Infantil B = 8 a 11 anos.");
		}
		if (i==12){
			JOptionPane.showMessageDialog(null,"Categoria Juvenil A = 12 a 13 anos.");
		}
		if (i==13){
			JOptionPane.showMessageDialog(null,"Categoria Juvenil A = 12 a 13 anos.");
		}
		if (i==14){
			JOptionPane.showMessageDialog(null,"Categoria Juvenil B = 14 a 17 anos.");
		}
		if (i==15){
			JOptionPane.showMessageDialog(null,"Categoria Juvenil B = 14 a 17 anos.");
		}
		if (i==16){
			JOptionPane.showMessageDialog(null,"Categoria Juvenil B = 14 a 17 anos.");
		}
		if (i==17){
			JOptionPane.showMessageDialog(null,"Categoria Juvenil B = 14 a 17 anos.");
		}
		if (i>=18){
			JOptionPane.showMessageDialog(null,"Categoria Adulta maiores de 18 anos");
		}
		System.exit(0);	
	}
}
