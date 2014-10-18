package herança;

import java.awt.*;

import javax.swing.JTextField;

public class CaixaTexto extends JTextField{

	public CaixaTexto(){
		super(10);// acessa o construtor da superclasse e controla o tamanho do bloco de texto

		setText("    ");
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Serif",Font.BOLD,20));//negrito tamanho 20

	}

}



