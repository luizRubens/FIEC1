package exercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiItemsDeEnteresse extends JPanel {
	
	private JButton btmostrar;
	private JButton btlimpar;
	private JLabel jcomp3;
	private JCheckBox lbinfo;
	private JCheckBox lbmate;
	private JCheckBox lbingles;
	private JCheckBox lbeng;
	private JCheckBox lbmed;

	public GuiItemsDeEnteresse() {
		//construct components
		btmostrar = new JButton ("Mostrar Itens Selecionados");
		btlimpar = new JButton ("Limpar Itens");
		jcomp3 = new JLabel ("ITEMS DE INTERESSE");
		lbinfo = new JCheckBox ("Informática");
		lbmate = new JCheckBox ("Matemática");
		lbingles = new JCheckBox ("Inglês");
		lbeng = new JCheckBox ("Engenharia");
		lbmed = new JCheckBox ("Medicina");

		//adjust size and set layout
		setPreferredSize (new Dimension (241, 282));
		setLayout (null);

		//add components
		add (btmostrar);
		add (btlimpar);
		add (jcomp3);
		add (lbinfo);
		add (lbmate);
		add (lbingles);
		add (lbeng);
		add (lbmed);

		//set component bounds (only needed by Absolute Positioning)
		btmostrar.setBounds (15, 165, 195, 40);
		btlimpar.setBounds (15, 215, 195, 40);
		jcomp3.setBounds (65, 15, 120, 15);
		lbinfo.setBounds (20, 50, 100, 25);
		lbmate.setBounds (20, 70, 100, 25);
		lbingles.setBounds (20, 90, 100, 25);
		lbeng.setBounds (20, 110, 100, 25);
		lbmed.setBounds (20, 130, 100, 25);

		btmostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String selecao = "Selecionados: ";
				
				if (lbingles.isSelected()) {
					selecao += "\nIngles";
				}
				if (lbinfo.isSelected()) {
					selecao += "\nInformatica";
				}
				if (lbeng.isSelected()) {
					selecao += "\nEngenharia";
				}
				if (lbmate.isSelected()) {
					selecao += "\nMatematica";
				}
				if (lbmed.isSelected()) {
					selecao += "\nMedicina";
				}
				JOptionPane.showMessageDialog(null, selecao);
			}
		});

		btlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbeng.setSelected(false);
				lbinfo.setSelected(false);
				lbingles.setSelected(false);
				lbmate.setSelected(false);
				lbmed.setSelected(false);
			}
		});
	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("Items De Interesse");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new GuiItemsDeEnteresse());
		frame.pack();
		frame.setVisible (true);
	}
}