package interfaces;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class GuiAutomovel extends JFrame implements ActionListener,MouseListener{

	private JButton b1;
	private JButton b2;

	public GuiAutomovel (){
		setTitle ("Uso de interfaces");
		setBounds (100,100,200,200);
		b1= new JButton("Botão 1");
		b2= new JButton("Botão 2");
		setLayout (new FlowLayout());
		add (b1);
		add (b2);
		b1.addActionListener(this);//registra o evento ao botão
		b2.addActionListener(this);
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		
		setResizable(false);

	}

	public static void main (String[] args){
		GuiAutomovel a = new GuiAutomovel();
		a.setVisible(true);

		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public void actionPerformed(ActionEvent arg0){ //desse jeito todos os botões clicados passaram ppr aqui
		
		/*if (arg0.getSource()==b1){//esse if serve para saber qual botão foi clicado, ja que o metodo Action não sabe indentifiar qual botão é selecionado ja que por ele passa todos os botões então tanto faz colocar um metodo para cada botão ou todos os botões dentro de um metodo e dentro deles varios ifs.  

			JOptionPane.showMessageDialog(null, "Ola mundo!");
		}
		if (arg0.getSource()==b2){

			JOptionPane.showMessageDialog(null, "Ola mundo!");
		}*/
	}


	public void mouseClicked(MouseEvent arg0) {


	}


	public void mouseEntered(MouseEvent arg0) {//esse evento serve fazer alguma coisa quando o cursor do mouse entra dentro da area do botão
		System.out.println("Voce colocou o cursor dentro da area do botão");	

	}


	public void mouseExited(MouseEvent arg0) {
		System.out.println("Voce tirou o cursor de dentro da area do botão");	

	}

	public void mousePressed(MouseEvent arg0) {

	}

	public void mouseReleased(MouseEvent arg0) {


	}

}