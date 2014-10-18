package banco;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIFornecedor extends JPanel {
	
	private JButton btSalvar;
	private JButton btAlterar;
	private JButton btNovo;
	private JLabel ID;
	private JLabel jcomp5;
	private JLabel jcomp6;
	private JLabel jcomp7;
	private JLabel jcomp8;
	private JLabel jcomp9;
	private JLabel jcomp10;
	private JLabel jcomp11;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtTelelfone;
	private JTextField txtEmail;
	private JTextField txtBanco;
	private JTextField txtAgencia;
	private JTextField txtConta;
	private JButton btExcluir;

	public GUIFornecedor() {
		//construct components
		btSalvar = new JButton ("Salvar");
		btAlterar = new JButton ("Alterar");
		btNovo = new JButton ("Novo");
		ID = new JLabel ("ID");
		jcomp5 = new JLabel ("Nome");
		jcomp6 = new JLabel ("Telefone");
		jcomp7 = new JLabel ("Endereço");
		jcomp8 = new JLabel ("Agencia");
		jcomp9 = new JLabel ("E-mail");
		jcomp10 = new JLabel ("Conta");
		jcomp11 = new JLabel ("Banco");
		txtID = new JTextField (5);
		txtNome = new JTextField (5);
		txtEndereco = new JTextField (5);
		txtTelelfone = new JTextField (5);
		txtEmail = new JTextField (5);
		txtBanco = new JTextField (5);
		txtAgencia = new JTextField (5);
		txtConta = new JTextField (5);
		btExcluir = new JButton ("Excluir");

		//adjust size and set layout
		setPreferredSize (new Dimension (352, 434));
		setLayout (null);

		//add components
		add (btSalvar);
		add (btAlterar);
		add (btNovo);
		add (ID);
		add (jcomp5);
		add (jcomp6);
		add (jcomp7);
		add (jcomp8);
		add (jcomp9);
		add (jcomp10);
		add (jcomp11);
		add (txtID);
		add (txtNome);
		add (txtEndereco);
		add (txtTelelfone);
		add (txtEmail);
		add (txtBanco);
		add (txtAgencia);
		add (txtConta);
		add (btExcluir);

		//set component bounds (only needed by Absolute Positioning)
		btSalvar.setBounds (90, 375, 80, 25);
		btAlterar.setBounds (170, 375, 85, 25);
		btNovo.setBounds (15, 375, 75, 25);
		ID.setBounds (20, 25, 60, 25);
		jcomp5.setBounds (20, 65, 60, 25);
		jcomp6.setBounds (20, 150, 60, 25);
		jcomp7.setBounds (20, 105, 60, 25);
		jcomp8.setBounds (20, 280, 60, 25);
		jcomp9.setBounds (20, 195, 60, 25);
		jcomp10.setBounds (20, 325, 60, 25);
		jcomp11.setBounds (20, 235, 60, 25);
		txtID.setBounds (75, 25, 240, 25);
		txtNome.setBounds (75, 65, 240, 25);
		txtEndereco.setBounds (75, 105, 240, 25);
		txtTelelfone.setBounds (75, 150, 240, 25);
		txtEmail.setBounds (75, 195, 240, 25);
		txtBanco.setBounds (75, 235, 240, 25);
		txtAgencia.setBounds (75, 280, 240, 25);
		txtConta.setBounds (75, 325, 240, 25);
		btExcluir.setBounds (255, 375, 80, 25);

		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0){
				FornecedorDAO f = new FornecedorDAO();
				f.setNome(txtNome.getText());
				f.setEndereco (txtEndereco.getText());
				f.setTelefone (txtTelelfone.getText());
				f.setBanco (txtBanco.getText());
				f.setAgencia (txtAgencia.getText());
				f.setConta (txtConta.getText());
				f.setEmail (txtEmail.getText());
				if(txtID.getText().length()==0){
					JOptionPane.showMessageDialog(btSalvar, f.inserir());
				}
				else{
					f.setId(Integer.parseInt(txtID.getText()));
					JOptionPane.showMessageDialog(btSalvar,f.alterar());
				}
			}
		});
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0){
				FornecedorDAO f = new FornecedorDAO();
				f.setId(Integer.parseInt(JOptionPane.showInputDialog(btExcluir,"Digite o ID")));
				JOptionPane.showMessageDialog(btExcluir, f.excluir());
			}
		});
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0){
				txtID.setText(JOptionPane.showInputDialog(btAlterar,"Digite o ID"));

			}
		});
		btNovo.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0){
				limparCampos();
			}
		});
	}
	private void limparCampos (){
		txtAgencia.setText("");
		txtBanco.setText("");
		txtConta.setText("");
		txtEmail.setText("");
		txtEndereco.setText("");
		txtID.setText("");
		txtNome.setText("");
		txtTelelfone.setText("");
		txtNome.requestFocus();

	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("Fornecedor");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new GUIFornecedor());
		frame.pack();
		frame.setVisible (true);
	}
}