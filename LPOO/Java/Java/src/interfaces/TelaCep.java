package interfaces;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TelaCep extends JPanel implements ActionListener,TextListener,MouseListener{
	private JButton bpesquisar;
	private JButton bsair;
	private JLabel label1;
	private TextField text;

	public TelaCep() {
		//construct components
		bpesquisar = new JButton ("Pesquisar");
		bsair = new JButton ("Sair");
		label1 = new JLabel ("Digite o CEP:");
		text = new TextField (5);

		//set components properties
		bpesquisar.setEnabled (false);

		//adjust size and set layout
		setPreferredSize (new Dimension (208, 122));
		setLayout (null);

		//add components
		add (bpesquisar);
		add (bsair);
		add (label1);
		add (text);

		//set component bounds (only needed by Absolute Positioning)
		bpesquisar.setBounds (5, 85, 95, 30);
		bsair.setBounds (110, 85, 90, 30);
		label1.setBounds (5, 30, 75, 25);
		text.setBounds (85, 30, 115, 25);
		bsair.addMouseListener(this);
		bpesquisar.addMouseListener(this);
		text.addActionListener(this);
		text.addTextListener(this);//esse evento ele não funciona com JtextFiel ele so funciona com TextField.
	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("Pesquisa de CEP");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new TelaCep());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible (true);
	}

	public void actionPerformed(ActionEvent arg0) {
		System.out.println(text.getText());

	}

	public void textValueChanged(TextEvent arg0) {
		if (text.getText().length()==8){
			text.setEnabled(false);
			bpesquisar.setEnabled(true);
		}
		else{
			text.setEnabled(true);
			bpesquisar.setEnabled(false);
		}

	}


	public void mouseClicked(MouseEvent e) {

		if (e.getSource()==bsair){
			System.exit(0);
		}
		if (e.getSource()==bpesquisar){
			JOptionPane.showMessageDialog(null,"Pesquisando...");
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}

}