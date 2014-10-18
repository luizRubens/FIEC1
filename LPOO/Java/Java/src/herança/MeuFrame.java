package herança;

import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {
	private JButton btOriginal;
	private MyButton btPersonal;
	private CaixaTexto cText;

	public MeuFrame(){
		setTitle("Uso da herança");
		cText=new CaixaTexto(); 
		setBounds(100,100,400,200); // tamanho da tela
		btOriginal = new JButton ("Original");
		btPersonal = new MyButton ("Personal");
		setLayout (new FlowLayout (FlowLayout.CENTER)); // alinha ao centro
		add(btOriginal);//adciona botao
		add(btPersonal);//adciona botao
		add(cText);
	}

	public static void main(String[] args) {
		
		MeuFrame m  = new MeuFrame();
		m.setVisible(true);// torna frame visivel
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

