package GUIs;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import banco.Sair;
import fornecedor.FornecedorDAO;

public class GuiFornecedor {

	private JFrame frame_Fornecedor;
	private JTextField txtNome_empresa;
	private JTextField txtDescricao;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtCep;
	private JTextField txtNumero;
	private JTextField txtResponsavel;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiFornecedor window = new GuiFornecedor();
					window.frame_Fornecedor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiFornecedor() {
		initialize();
	}

	public void LimparCampos_Fornecedor(){

		txtBairro.setText("");
		txtCep.setText("");
		txtCidade.setText("");
		txtDescricao.setText("");
		txtEmail.setText("");
		txtEndereco.setText("");
		txtNome_empresa.setText("");
		txtNumero.setText("");
		txtResponsavel.setText("");
		txtTelefone.setText("");
		txtNome_empresa.requestFocus();


	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame_Fornecedor = new JFrame();
		frame_Fornecedor.setResizable(false);
		frame_Fornecedor.getContentPane().setBackground(Color.WHITE);
		frame_Fornecedor.setBounds(100, 100, 700, 604);
		frame_Fornecedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Nome da Empresa");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblCidade = new JLabel("Bairro");
		lblCidade.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblCidade_1 = new JLabel("Cidade");
		lblCidade_1.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setFont(new Font("Calibri", Font.BOLD, 14));

		txtNome_empresa = new JTextField();
		txtNome_empresa.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtNome_empresa.setColumns(10);

		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtDescricao.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtCidade.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtBairro.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtEmail.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtEndereco.setColumns(10);

		txtCep = new JTextField();
		txtCep.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtCep.setColumns(10);

		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				LimparCampos_Fornecedor();



			}
		});
		btLimpar.setBackground(Color.WHITE);
		btLimpar.setFont(new Font("Calibri", Font.BOLD, 16));

		final JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FornecedorDAO f = new FornecedorDAO();

				f.setBairro(txtBairro.getText());
				f.setCep(txtCep.getText());
				f.setCidade(txtCidade.getText());
				f.setDescricao(txtDescricao.getText());
				f.setEmail(txtEmail.getText());
				f.setEndereco(txtEndereco.getText());
				f.setNome_empresa(txtNome_empresa.getText());
				f.setNumero(Integer.parseInt(txtNumero.getText()));
				f.setResponsavel(txtResponsavel.getText());
				f.setTelefone(txtTelefone.getText());

				JOptionPane.showMessageDialog(btSalvar, f.inserirFornecedor());

			}
		});
		btSalvar.setBackground(Color.WHITE);
		btSalvar.setFont(new Font("Calibri", Font.BOLD, 16));

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Sair s = new Sair();

				s.Sair();


			}
		});
		btnSair.setBackground(Color.WHITE);
		btnSair.setFont(new Font("Calibri", Font.BOLD, 16));

		JLabel lblNewLabel_2 = new JLabel("Numero");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblNewLabel_3 = new JLabel("Responsavel");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 14));

		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtNumero.setColumns(10);

		txtResponsavel = new JTextField();
		txtResponsavel.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtResponsavel.setColumns(10);

		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		txtTelefone.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame_Fornecedor.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(117)
										.addComponent(btLimpar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addGap(66)
										.addComponent(btSalvar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addGap(44)
										.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(37)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblCidade)
																.addPreferredGap(ComponentPlacement.RELATED))
																.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(ComponentPlacement.RELATED))
																				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																						.addGroup(groupLayout.createSequentialGroup()
																								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
																								.addPreferredGap(ComponentPlacement.RELATED))
																								.addGroup(groupLayout.createSequentialGroup()
																										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																												.addComponent(txtEndereco, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
																												.addComponent(lblNewLabel, Alignment.LEADING)
																												.addComponent(lblNewLabel_1, Alignment.LEADING)
																												.addComponent(txtNome_empresa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
																												.addComponent(txtCidade, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
																												.addComponent(txtBairro, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
																												.addComponent(lblCidade_1, Alignment.LEADING))
																												.addGap(126)))))
																												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																																.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																																				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																																						.addGroup(groupLayout.createSequentialGroup()
																																								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																																										.addComponent(lblCep, Alignment.LEADING)
																																										.addComponent(lblEmail, Alignment.LEADING)
																																										.addComponent(txtCep, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
																																										.addComponent(lblDescrio, Alignment.LEADING)
																																										.addComponent(txtDescricao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
																																										.addGap(49))
																																										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
																																										.addComponent(lblNewLabel_3))
																																										.addComponent(txtResponsavel, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
																																										.addComponent(txtEmail, 236, 236, 236))
																																										.addComponent(lblNewLabel_4))))
																																										.addGap(0))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(38)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(lblCep))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtNome_empresa, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
										.addGap(40)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_1)
												.addComponent(lblEmail))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(txtEmail)
														.addComponent(txtEndereco, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
														.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
														.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNewLabel_2)
																.addComponent(lblNewLabel_3))
																.addPreferredGap(ComponentPlacement.RELATED)
																.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																		.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtResponsavel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
																		.addGap(37)
																		.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																				.addComponent(lblDescrio)
																				.addComponent(lblCidade))
																				.addPreferredGap(ComponentPlacement.RELATED)
																				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																						.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
																						.addGap(34)
																						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																								.addComponent(lblCidade_1)
																								.addComponent(lblNewLabel_4))
																								.addPreferredGap(ComponentPlacement.RELATED)
																								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																										.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
																										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
																										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																												.addComponent(btLimpar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
																												.addComponent(btSalvar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
																												.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
																												.addGap(20))
				);
		frame_Fornecedor.getContentPane().setLayout(groupLayout);
	}
}
