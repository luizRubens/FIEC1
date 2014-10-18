package meuscontatos;

//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel extends JPanel {

	public JButton btler;
	public JButton btgravar;
	public JButton btsair;
	public JLabel lbcodigo;
	public JLabel lbnome;
	public JLabel lbfone;
	public JLabel lbemail;
	public JTextField bloconome;
	public JTextField blocofone;
	public JTextField blocoemail;
	public JTextField blococodigo;

	public Painel() {
		//construct components

		btler = new JButton ("Ler");
		btgravar = new JButton ("Gravar");
		btsair = new JButton ("Sair");
		lbcodigo = new JLabel ("C�digo:");
		lbnome = new JLabel ("Nome:");
		lbfone = new JLabel ("Fone:");
		lbemail = new JLabel ("E-mail:");
		bloconome = new JTextField (5);
		blocofone = new JTextField (5);
		blocoemail = new JTextField (5);
		blococodigo = new JTextField (5);

		//adjust size and set layout
		setPreferredSize (new Dimension (360, 267));
		setLayout (null);

		//add components
		add (btler);
		add (btgravar);
		add (btsair);
		add (lbcodigo);
		add (lbnome);
		add (lbfone);
		add (lbemail);
		add (bloconome);
		add (blocofone);
		add (blocoemail);
		add (blococodigo);

		//set component bounds (only needed by Absolute Positioning)
		btler.setBounds (15, 225, 100, 20);
		btgravar.setBounds (125, 225, 100, 20);
		btsair.setBounds (235, 225, 110, 20);
		lbcodigo.setBounds (10, 20, 55, 25);
		lbnome.setBounds (10, 70, 55, 25);
		lbfone.setBounds (10, 125, 55, 25);
		lbemail.setBounds (10, 175, 60, 25);
		bloconome.setBounds (75, 70, 255, 25);
		blocofone.setBounds (75, 125, 255, 25);
		blocoemail.setBounds (75, 175, 255, 25);
		blococodigo.setBounds (75, 20, 255, 25);

		btsair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("Meus Contatos");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Painel());
		frame.pack();
		frame.setVisible (true);
	}
}
