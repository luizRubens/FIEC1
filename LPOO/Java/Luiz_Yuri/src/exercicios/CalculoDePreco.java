package exercicios;

//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalculoDePreco extends JPanel {
	
	private JLabel jcomp1;
	private JLabel jcomp2;
	private JTextField txtValorInicial;
	private JRadioButton radioDinheiro;
	private JRadioButton radioCheque;
	private JRadioButton radioCartao;
	private JTextField txtValorFinal;

	public CalculoDePreco() {
		//construct components
		jcomp1 = new JLabel ("Digite o valor da venda:");
		jcomp2 = new JLabel ("Pre�o final da venda:");
		txtValorInicial = new JTextField (5);
		radioDinheiro = new JRadioButton ("Dinheiro");
		radioCheque = new JRadioButton ("Cheque");
		radioCartao = new JRadioButton ("Cart�o");
		txtValorFinal = new JTextField (5);

		//adjust size and set layout
		setPreferredSize (new Dimension (335, 150));
		setLayout (null);

		//add components
		add (jcomp1);
		add (jcomp2);
		add (txtValorInicial);
		add (radioDinheiro);
		add (radioCheque);
		add (radioCartao);
		add (txtValorFinal);

		//set component bounds (only needed by Absolute Positioning)
		jcomp1.setBounds (20, 25, 130, 25);
		jcomp2.setBounds (20, 100, 120, 20);
		txtValorInicial.setBounds (155, 25, 160, 25);
		radioDinheiro.setBounds (15, 65, 100, 25);
		radioCheque.setBounds (135, 65, 100, 25);
		radioCartao.setBounds (260, 65, 100, 25);
		txtValorFinal.setBounds (145, 100, 170, 25);
		txtValorFinal.setEnabled(false);

		radioDinheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioDinheiro.isSelected()){
					double v=Double.parseDouble(txtValorInicial.getText());
					double d=v*5/100;
					double vf=v-d;
					txtValorFinal.setText(""+vf);

				}              
			}
		});

		radioCheque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioCheque.isSelected()){
					double v=Double.parseDouble(txtValorInicial.getText());
					double d=v*5/100;
					double vf=v+d;
					txtValorFinal.setText(""+vf);
				}              
			}
		});
		radioCartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioCartao.isSelected()){
					double v=Double.parseDouble(txtValorInicial.getText());
					double d=v*10/100;
					double vf=v+d;
					txtValorFinal.setText(""+vf);
				}              
			}
		});
	}
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Calculo");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new CalculoDePreco());
		frame.pack();
		frame.setVisible (true);
	}
}