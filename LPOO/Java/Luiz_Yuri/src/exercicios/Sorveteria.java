package exercicios;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sorveteria extends JPanel {
	
	private JLabel jcomp1;
	private JLabel jcomp2;
	private JLabel jcomp3;
	private JLabel jcomp4;
	private JLabel jcomp5;
	private JLabel jcomp6;
	private JLabel jcomp7;
	private JLabel jcomp8;
	private JTextField txtQtadePicoFruta;
	private JTextField txtQtadePicoChoco;
	private JTextField txtQtadeBola;
	private JTextField txtQtadePote;
	private JTextField txtPrecoUnitPicoFruta;
	private JTextField txtPrecoUnitPicoChoco;
	private JTextField txtPrecoUnitBola;
	private JTextField txtPrecoUnitPote;
	private JTextField txtTotal;
	private JButton btLimpar;
	private JButton btCalcular;

	public Sorveteria() {
		//construct components
		jcomp1 = new JLabel ("Picole de frutas");
		jcomp2 = new JLabel ("Quantidade");
		jcomp3 = new JLabel ("Chocolate e frutas");
		jcomp4 = new JLabel ("Preço Unitario");
		jcomp5 = new JLabel ("Bola");
		jcomp6 = new JLabel ("Pote de 2 litros");
		jcomp7 = new JLabel ("Total");
		jcomp8 = new JLabel ("Tipo de Sorvete");
		txtQtadePicoFruta = new JTextField (5);
		txtQtadePicoChoco = new JTextField (5);
		txtQtadeBola = new JTextField (5);
		txtQtadePote = new JTextField (5);
		txtPrecoUnitPicoFruta = new JTextField (5);
		txtPrecoUnitPicoChoco = new JTextField (5);
		txtPrecoUnitBola = new JTextField (5);
		txtPrecoUnitPote = new JTextField (5);
		txtTotal = new JTextField (5);
		btLimpar = new JButton ("Limpar");
		btCalcular = new JButton ("Calcular");

		//adjust size and set layout
		setPreferredSize (new Dimension (451, 320));
		setLayout (null);

		//add components
		add (jcomp1);
		add (jcomp2);
		add (jcomp3);
		add (jcomp4);
		add (jcomp5);
		add (jcomp6);
		add (jcomp7);
		add (jcomp8);
		add (txtQtadePicoFruta);
		add (txtQtadePicoChoco);
		add (txtQtadeBola);
		add (txtQtadePote);
		add (txtPrecoUnitPicoFruta);
		add (txtPrecoUnitPicoChoco);
		add (txtPrecoUnitBola);
		add (txtPrecoUnitPote);
		add (txtTotal);
		add (btLimpar);
		add (btCalcular);
		
		txtTotal.setEnabled(false);
		
		//set component bounds (only needed by Absolute Positioning)
		jcomp1.setBounds (55, 60, 100, 25);
		jcomp2.setBounds (190, 25, 70, 25);
		jcomp3.setBounds (55, 90, 110, 25);
		jcomp4.setBounds (285, 25, 85, 25);
		jcomp5.setBounds (55, 120, 100, 25);
		jcomp6.setBounds (55, 150, 100, 25);
		jcomp7.setBounds (235, 180, 100, 25);
		jcomp8.setBounds (20, 10, 100, 25);
		txtQtadePicoFruta.setBounds (170, 60, 100, 25);
		txtQtadePicoChoco.setBounds (170, 90, 100, 25);
		txtQtadeBola.setBounds (170, 120, 100, 25);
		txtQtadePote.setBounds (170, 150, 100, 25);
		txtPrecoUnitPicoFruta.setBounds (275, 60, 100, 25);
		txtPrecoUnitPicoChoco.setBounds (275, 90, 100, 25);
		txtPrecoUnitBola.setBounds (275, 120, 100, 25);
		txtPrecoUnitPote.setBounds (275, 150, 100, 25);
		txtTotal.setBounds (275, 180, 100, 25);
		btLimpar.setBounds (35, 235, 100, 25);
		btCalcular.setBounds (275, 235, 100, 25);

		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double qtdFruta = Double.parseDouble(txtPrecoUnitPicoFruta.getText());
				double qtdChocolate = Double.parseDouble(txtQtadePicoChoco.getText());
				double qtdBola = Double.parseDouble(txtQtadeBola.getText());
				double qtdPote = Double.parseDouble(txtQtadePote.getText());
				double precoFruta = Double.parseDouble(txtPrecoUnitPicoFruta.getText());
				double precoChocolate = Double.parseDouble(txtPrecoUnitPicoChoco.getText());
				double precoBola = Double.parseDouble(txtPrecoUnitBola.getText());
				double precoPote = Double.parseDouble(txtPrecoUnitPote.getText());
				double total;
				double p;
				double ch;
				double b;
				double pote;

				p=qtdFruta*precoFruta;
				ch=qtdChocolate*precoChocolate;
				b=qtdBola*precoBola;
				pote=qtdPote*precoPote;
				total=p+ch+b+pote;

				txtTotal.setText(""+total);
			}
		});

		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtPrecoUnitPicoFruta.setText(null);
				txtPrecoUnitBola.setText(null);
				txtPrecoUnitPicoChoco.setText(null);
				txtPrecoUnitPote.setText(null);
				txtQtadeBola.setText(null);
				txtQtadePicoChoco.setText(null);
				txtQtadePicoFruta.setText(null);
				txtQtadePote.setText(null);
				txtTotal.setText(null);
				
			}
		});
	}


	public static void main (String[] args) {
		JFrame frame = new JFrame ("Calculo de preços");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Sorveteria());
		frame.pack();
		frame.setVisible (true);
	}
}
