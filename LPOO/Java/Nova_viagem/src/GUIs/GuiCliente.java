package GUIs;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import cliente.ClienteDAO;

public class GuiCliente extends JPanel{

	private JButton btLimpar;
	private JButton btSalvar;
	private JButton btSair;
	private JLabel jcomp4;
	private JLabel jcomp5;
	private JLabel jcomp6;
	private JLabel jcomp7;
	private JLabel jcomp8;
	private JLabel jcomp9;
	private JLabel jcomp10;
	private JLabel jcomp11;
	private JLabel jcomp12;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtCEP;
	private JTextField txtProfissao;
	private JTextField txtTelefone;
	private JComboBox comboEstados;

	public GuiCliente() {
		//construct preComponents
		String[] comboEstadosItems = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RR", "SC", "SE", "SP", "TO"};

		//construct components
		btLimpar = new JButton ("Limpar");
		btSalvar = new JButton ("Salvar");
		btSair = new JButton ("Sair");
		jcomp4 = new JLabel ("Nome:");
		jcomp5 = new JLabel ("CPF:");
		jcomp6 = new JLabel ("Endereço:");
		jcomp7 = new JLabel ("CEP:");
		jcomp8 = new JLabel ("Profissão:");
		jcomp9 = new JLabel ("Bairro: ");
		jcomp10 = new JLabel ("Cidade:");
		jcomp11 = new JLabel ("Telefone:");
		jcomp12 = new JLabel ("UF:");
		txtNome = new JTextField (5);
		txtCPF = new JTextField (5);
		txtEndereco = new JTextField (5);
		txtBairro = new JTextField (5);
		txtCidade = new JTextField (5);
		txtCEP = new JTextField (5);
		txtProfissao = new JTextField (5);
		txtTelefone = new JTextField (5);
		comboEstados = new JComboBox (comboEstadosItems);

		//adjust size and set layout
		setPreferredSize (new Dimension (436, 504));
		setLayout (null);

		//add components
		add (btLimpar);
		add (btSalvar);
		add (btSair);
		add (jcomp4);
		add (jcomp5);
		add (jcomp6);
		add (jcomp7);
		add (jcomp8);
		add (jcomp9);
		add (jcomp10);
		add (jcomp11);
		add (jcomp12);
		add (txtNome);
		add (txtCPF);
		add (txtEndereco);
		add (txtBairro);
		add (txtCidade);
		add (txtCEP);
		add (txtProfissao);
		add (txtTelefone);
		add (comboEstados);

		//set component bounds (only needed by Absolute Positioning)
		btLimpar.setBounds (45, 455, 100, 20);
		btSalvar.setBounds (160, 455, 100, 20);
		btSair.setBounds (275, 455, 100, 20);
		jcomp4.setBounds (40, 35, 100, 25);
		jcomp5.setBounds (40, 80, 100, 25);
		jcomp6.setBounds (40, 125, 100, 25);
		jcomp7.setBounds (50, 260, 100, 25);
		jcomp8.setBounds (55, 340, 100, 25);
		jcomp9.setBounds (45, 170, 100, 25);
		jcomp10.setBounds (45, 215, 100, 25);
		jcomp11.setBounds (55, 385, 100, 25);
		jcomp12.setBounds (55, 300, 100, 25);
		txtNome.setBounds (120, 35, 180, 25);
		txtCPF.setBounds (120, 80, 180, 25);
		txtEndereco.setBounds (120, 125, 180, 25);
		txtBairro.setBounds (120, 170, 180, 25);
		txtCidade.setBounds (120, 215, 180, 25);
		txtCEP.setBounds (120, 260, 180, 25);
		txtProfissao.setBounds (120, 340, 185, 25);
		txtTelefone.setBounds (120, 385, 185, 25);
		comboEstados.setBounds (120, 300, 180, 25);


		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);	

			}
		});

		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Limpando");
				txtNome.setText("");
				txtCPF.setText("");
				txtEndereco.setText("");
				txtBairro.setText("");
				txtCidade.setText("");
				txtProfissao.setText("");
				txtTelefone.setText("");
				txtCEP.setText("");
				txtNome.requestFocus();//atraves desse metodo quando limpar o cursor ira ficar na primeira janela para auxiliar a digitação
			}
		});

		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ClienteDAO c = new ClienteDAO();

				c.setBairro(txtBairro.getText());
				c.setCEP(txtCEP.getText());
				c.setCidade(txtCidade.getText());
				c.setCPF(txtCPF.getText());
				c.setEndereco(txtEndereco.getText());
				c.setNome(txtNome.getText());
				c.setProfissao(txtProfissao.getText());
				c.setUF((String) comboEstados.getSelectedItem());
				c.setTelefone(txtTelefone.getText());
				
				JOptionPane.showMessageDialog(btSalvar,c.inserirCliente());
				
			}
		});
	}


	public static void main (String[] args) {
		JFrame frame = new JFrame ("Cadastro de Clientes");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new GuiCliente());
		frame.pack();
		frame.setVisible (true);
	}

}
