package herança;
import java.awt.Color;

import javax.swing.JButton;

public class MyButton extends JButton {
	//metodo construtor
	public MyButton (String titulo){
		//onde esta o metodo setText?
		//ele vem do JButton
		setText(titulo);
		setSize (120,50);
		setBackground(Color.red);// cor do fundo do botao
		setForeground(Color.white);// cor do texto do botao
	}
}

