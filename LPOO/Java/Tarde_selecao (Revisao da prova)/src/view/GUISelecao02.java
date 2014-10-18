package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUISelecao02 extends JPanel {

	private JButton btGravar;
	private JButton btNome;
	private JButton btExcluir;
	private JButton btLocalizar;
	private JLabel lbCodigo;
	private JTextField txtCodigo;
	private JLabel lbNome;
	private JTextField txtNome;

	public GUISelecao02() {
		//construct components
		btGravar = new JButton ("Gravar");
		btNome = new JButton ("Novo");
		btExcluir = new JButton ("Excluir");
		btLocalizar = new JButton ("Localizar");
		lbCodigo = new JLabel ("Codigo");
		txtCodigo = new JTextField (5);
		lbNome = new JLabel ("Nome");
		txtNome = new JTextField (5);

		//adjust size and set layout
		setPreferredSize (new Dimension (361, 138));
		setLayout (null);

		//add components
		add (btGravar);
		add (btNome);
		add (btExcluir);
		add (btLocalizar);
		add (lbCodigo);
		add (txtCodigo);
		add (lbNome);
		add (txtNome);

		//set component bounds (only needed by Absolute Positioning)
		btGravar.setBounds (10, 75, 80, 25);
		btNome.setBounds (95, 75, 75, 25);
		btExcluir.setBounds (175, 75, 80, 25);
		btLocalizar.setBounds (260, 75, 90, 25);
		lbCodigo.setBounds (35, 10, 100, 25);
		txtCodigo.setBounds (35, 35, 100, 25);
		lbNome.setBounds (145, 10, 100, 25);
		txtNome.setBounds (145, 35, 150, 25);

		btLocalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelecaoDAO s = new SelecaoDAO();
				txtNome.setText(s.buscarNome(txtCodigo.getText()));		
			}
		});

		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelecaoDAO s = new SelecaoDAO();
				s.setCod_selecao(txtCodigo.getText());
				s.setNome(txtNome.getText());
				JOptionPane.showMessageDialog(null, s.gravar());		
			}
		});        
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelecaoDAO s = new SelecaoDAO();
				s.setCod_selecao(txtCodigo.getText());
				JOptionPane.showMessageDialog(null, s.excluir());	
			}
		});        
	}


	public static void main (String[] args) {
		JFrame frame = new JFrame ("MyPanel");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new GUISelecao02());
		frame.pack();
		frame.setVisible (true);
	}
}
