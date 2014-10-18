package frames;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JFrame{

	private JMenuBar mb;//declaração da barra de menu
	private Container container = new Container() ;//declaração do container
	private JMenu mnArquivo,mnExemplo,mnExercicios,mnFacil,mnDificil;//declaração do menu "botão"
	private JMenuItem miSair,miRadio,miLista,miImagem;


	public MenuPrincipal (){
		setLayout (null);
		setBounds (0,0,400,300);//distancia em relação a esquerda
		//distancia em relação ao top
		//largura
		//altura
		setTitle("Menu Principal");

		mnArquivo = new JMenu("Arquivo");
		mnExemplo = new JMenu("Exemplo");
		mnExercicios = new JMenu("Exercicios");
		mnFacil = new JMenu("Facil");
		mnDificil = new JMenu("Dificil");

		miSair = new JMenuItem("Sair");
		miRadio = new JMenuItem("Radio");
		miLista = new JMenuItem("Lista");
		miImagem = new JMenuItem("Imagem");

		mb = new JMenuBar();

		mnArquivo.add(miSair);
		mnExemplo.add (miImagem);
		mnExemplo.add (miLista);
		mnExemplo.add (miRadio);

		mnExercicios.add (mnFacil);
		mnExercicios.add (mnDificil);

		mb.add(mnArquivo);
		mb.add (mnExemplo);
		mb.add(mnExercicios);


		setJMenuBar(mb);

		
		container = getContentPane();//aqui o container assume o papel de frame

		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		miRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PainelRadio p = new PainelRadio();
				container.removeAll();//limpa o painel e adiciona o p que é o painel do radio
				container.add(p);//atualiza a tela senão a tela nãon aparece
				p.updateUI();
			}
		});
		miLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PainelLista p = new PainelLista();
				container.removeAll();//limpa o painel e adiciona o p que é o painel do radio
				container.add(p);//atualiza a tela senão a tela nãon aparece
				p.updateUI();
			}
		});
		miImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PainelImagem p = new PainelImagem();
				container.removeAll();//limpa o painel e adiciona o p que é o painel do radio
				container.add(p);//atualiza a tela senão a tela nãon aparece
				p.updateUI();
			}
		});
	}							

	public static void main(String[] args) {

		MenuPrincipal m = new MenuPrincipal();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		int largura = d.width - m.getSize().width;
		int altura = d.height - m.getSize().width;
		m.setLocation(largura/2,largura/2);

		m.setVisible (true);
		m.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	}
}