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
import funcionario.FuncionarioDAO;

public class GuiFuncionario {

	private JFrame frame_Funcionario;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtCep;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtCargo;
	private JTextField txtSalario;
	private JTextField txtcomplemento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiFuncionario window = new GuiFuncionario();
					window.frame_Funcionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiFuncionario() {
		initialize();


	}
	public void limparCamposFuncionario_CANTINA(){

		txtCargo.setText("");
		txtCep.setText("");
		txtcomplemento.setText("");
		txtCPF.setText("");
		txtEmail.setText("");
		txtEndereco.setText("");
		txtNome.setText("");
		txtNumero.setText("");
		txtSalario.setText("");
		txtTelefone.setText("");
		txtNome.requestFocus();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_Funcionario = new JFrame();
		frame_Funcionario.setResizable(false);
		frame_Funcionario.getContentPane().setBackground(Color.WHITE);
		frame_Funcionario.setBounds(100, 100, 701, 587);
		frame_Funcionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));

		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 15));

		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 15));

		JLabel lblNewLabel_3 = new JLabel("Numero");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 15));

		JLabel lblNewLabel_4 = new JLabel("CEP");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 15));

		JLabel lblNewLabel_5 = new JLabel("Telefone");
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 15));

		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Calibri", Font.BOLD, 15));

		JLabel lblNewLabel_7 = new JLabel("Cargo");
		lblNewLabel_7.setFont(new Font("Calibri", Font.BOLD, 15));

		txtNome = new JTextField();
		txtNome.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtNome.setColumns(10);

		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtCPF.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtEndereco.setColumns(10);

		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtNumero.setColumns(10);

		txtCep = new JTextField();
		txtCep.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtCep.setColumns(10);

		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtTelefone.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtEmail.setColumns(10);

		txtCargo = new JTextField();
		txtCargo.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtCargo.setColumns(10);

		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCargo.setText("");
				txtCep.setText("");
				txtcomplemento.setText("");
				txtCPF.setText("");
				txtEmail.setText("");
				txtEndereco.setText("");
				txtNome.setText("");
				txtNumero.setText("");
				txtSalario.setText("");
				txtTelefone.setText("");
				txtNome.requestFocus();

			}
		});
		btLimpar.setBackground(Color.WHITE);
		btLimpar.setFont(new Font("Calibri", Font.BOLD, 14));

		final JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FuncionarioDAO f = new FuncionarioDAO();

				if (txtCargo.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o cargo.");

				}
				else if (txtCep.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o CEP.");

				}

				else if (txtCPF.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o CPF.");

				}
				else if (txtEmail.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor forneça um email.");

				}
				else if (txtEndereco.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o endereço.");

				}
				else if (txtNome.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o nome.");

				}
				else if (txtNumero.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o numero da residencia ou do apartamento.");

				}
				else if (txtSalario.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o salario.");

				}
				else if (txtTelefone.getText().equals("")){
					JOptionPane.showMessageDialog(btSalvar, "Por favor informe o telefone.");

				}
				
				else{

				f.setCargo(txtCargo.getText());
				f.setCep(txtCep.getText());
				f.setComplemento(txtcomplemento.getText());
				f.setCpf(txtCPF.getText());
				f.setEmail(txtEmail.getText());
				f.setEndereco(txtEndereco.getText());
				f.setNome(txtNome.getText());
				f.setNumero(Integer.parseInt(txtNumero.getText()));
				f.setSalario(Float.parseFloat(txtSalario.getText()));
				f.setTelefone(txtTelefone.getText());
				
				JOptionPane.showMessageDialog(btSalvar,f.inserirFuncionario());
				
				}

			}
		});
		btSalvar.setBackground(Color.WHITE);
		btSalvar.setFont(new Font("Calibri", Font.BOLD, 14));

		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Sair s = new Sair();
				
				s.Sair();
			}
		});
		btSair.setBackground(Color.WHITE);
		btSair.setFont(new Font("Calibri", Font.BOLD, 14));

		JLabel lblSalario = new JLabel("Sal\u00E1rio");
		lblSalario.setFont(new Font("Calibri", Font.BOLD, 15));

		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtSalario.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Complemento");
		lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 15));

		txtcomplemento = new JTextField();
		txtcomplemento.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtcomplemento.setColumns(10);

		GroupLayout groupLayout = new GroupLayout(frame_Funcionario.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(54)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
										.addComponent(lblNewLabel_4)
										.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
										.addGap(143)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtcomplemento, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
												.addComponent(txtTelefone, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(txtSalario)
														.addComponent(lblSalario)
														.addComponent(txtCargo, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
														.addComponent(lblNewLabel_7)
														.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
														.addComponent(lblNewLabel_6)
														.addComponent(lblNewLabel_5)
														.addComponent(lblNewLabel_8)))
														.addGap(157))
														.addGroup(groupLayout.createSequentialGroup()
																.addGap(132)
																.addComponent(btLimpar, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
																.addGap(48)
																.addComponent(btSalvar, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
																.addGap(44)
																.addComponent(btSair, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
																.addContainerGap(197, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(53)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_5))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_1)
												.addComponent(lblNewLabel_6))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
														.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
														.addGap(35)
														.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNewLabel_2)
																.addComponent(lblNewLabel_7))
																.addPreferredGap(ComponentPlacement.RELATED)
																.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																		.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtCargo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
																		.addGap(38)
																		.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																				.addComponent(lblNewLabel_3)
																				.addComponent(lblSalario))
																				.addPreferredGap(ComponentPlacement.UNRELATED)
																				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																						.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
																						.addComponent(txtSalario, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
																						.addGap(30)
																						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																								.addComponent(lblNewLabel_4)
																								.addComponent(lblNewLabel_8))
																								.addPreferredGap(ComponentPlacement.RELATED)
																								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																										.addComponent(txtcomplemento)
																										.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
																										.addGap(50)
																										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
																												.addComponent(btLimpar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
																												.addComponent(btSalvar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
																												.addComponent(btSair, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
																												.addContainerGap(86, Short.MAX_VALUE))
				);
		frame_Funcionario.getContentPane().setLayout(groupLayout);
	}
}
