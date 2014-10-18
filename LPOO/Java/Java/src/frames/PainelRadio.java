package frames;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PainelRadio extends JPanel{

	private JButton btLimpar;
	private JButton btCalcular;
	private JLabel lbValor;
	private JTextField txtValor;
	private JRadioButton radio10;
	private JRadioButton radio20;
	private JRadioButton radio30;
	private JLabel jcomp8;
	private JTextField txtTotal;
	private ButtonGroup bg;

	public PainelRadio() {
		//construct components
		btLimpar = new JButton ("Limpar");
		btCalcular = new JButton ("Calcular");
		lbValor = new JLabel ("Valor");
		txtValor = new JTextField (5);
		radio10 = new JRadioButton ("10%");
		radio20 = new JRadioButton ("20%");
		radio30 = new JRadioButton ("30%");
		jcomp8 = new JLabel ("Total");
		txtTotal = new JTextField (5);

		//set components properties
		txtTotal.setEnabled (false);

		bg = new ButtonGroup();

		bg.add (radio10);
		bg.add (radio20);
		bg.add (radio30);

		radio10.setSelected(true);//deixa marcado um radio, seguindo o padrão

		//adjust size and set layout
		setBounds (0,0,245, 216);
		setLayout (null);

		//add components
		add (btLimpar);
		add (btCalcular);
		add (lbValor);
		add (txtValor);
		add (radio10);
		add (radio20);
		add (radio30);
		add (jcomp8);
		add (txtTotal);

		//set component bounds (only needed by Absolute Positioning)
		btLimpar.setBounds (125, 100, 100, 20);
		btCalcular.setBounds (125, 140, 100, 20);
		lbValor.setBounds (15, 40, 55, 25);
		txtValor.setBounds (80, 40, 100, 25);
		radio10.setBounds (15, 85, 100, 25);
		radio20.setBounds (15, 115, 100, 25);
		radio30.setBounds (15, 150, 100, 25);
		jcomp8.setBounds (10, 185, 30, 25);
		txtTotal.setBounds (80, 180, 100, 25);

		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTotal.setText("");
				txtValor.setText("");
				txtValor.requestFocus();
			}
		});
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{//tenta converter o texto para numero e caso der erro ele mostra uma janela de erro
					double v = Double.parseDouble(txtValor.getText());
					double t = 0;
					if (radio10.isSelected()){
						t = v* 0.9;
					}
					else if (radio20.isSelected()){
						t = v* 0.8;
					}
					else {
						t = v* 0.7;
					}
					txtTotal.setText(""+t);
				}
				catch(NumberFormatException erro){
					JOptionPane.showMessageDialog(btCalcular, "Forneça um valor real");
					txtValor.requestFocus();
				}
			}
		});
	}
}