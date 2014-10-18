package progressao;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p;
		double m;
		double e;
		p = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilos de peixe pescados e veja se ira pagar multa ou não."));
		if (p>50){
			e=p-50;
			m=e*4;
			JOptionPane.showMessageDialog(null,"Voce pagara uma multa de: R$ "+m+"\nVoce pescou: "+p+" kg de peixe.");
		}
		else {
			JOptionPane.showMessageDialog(null,"Voce não pagara multa pois pescou menos de 50 kg.\nVoce pescou: "+p+" kg de peixe.");
		}
		System.exit(0);	
	}
}