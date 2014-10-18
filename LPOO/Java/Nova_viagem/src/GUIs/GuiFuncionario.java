package GUIs;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import funcionario.FuncionarioDAO;

	public class GuiFuncionario extends JPanel {
		
	    private JButton btLimpar;
	    private JButton btSair;
	    private JButton btSalvar;
	    private JLabel jcomp4;
	    private JLabel jcomp5;
	    private JLabel jcomp6;
	    private JLabel jcomp7;
	    private JLabel jcomp8;
	    private JLabel jcomp9;
	    private JLabel jcomp10;
	    private JLabel jcomp11;
	    private JTextField txtEndereco;
	    private JTextField txtCPF;
	    private JTextField txtNome;
	    private JTextField txtBairro;
	    private JTextField txtCEP;
	    private JTextField txtCidade;
	    private JTextField txtCargo;
	    private JTextField txtSalario;

	    public GuiFuncionario() {
	        //construct components
	        btLimpar = new JButton ("Limpar");
	        btSair = new JButton ("Sair");
	        btSalvar = new JButton ("Salvar");
	        jcomp4 = new JLabel ("CPF:");
	        jcomp5 = new JLabel ("CEP:");
	        jcomp6 = new JLabel ("Cidade");
	        jcomp7 = new JLabel ("Cargo:");
	        jcomp8 = new JLabel ("Salario:");
	        jcomp9 = new JLabel ("Nome:");
	        jcomp10 = new JLabel ("Endereco:");
	        jcomp11 = new JLabel ("Bairro:");
	        txtEndereco = new JTextField (5);
	        txtCPF = new JTextField (5);
	        txtNome = new JTextField (5);
	        txtBairro = new JTextField (5);
	        txtCEP = new JTextField (5);
	        txtCidade = new JTextField (5);
	        txtCargo = new JTextField (5);
	        txtSalario = new JTextField (5);

	        //adjust size and set layout
	        setPreferredSize (new Dimension (411, 532));
	        setLayout (null);

	        //add components
	        add (btLimpar);
	        add (btSair);
	        add (btSalvar);
	        add (jcomp4);
	        add (jcomp5);
	        add (jcomp6);
	        add (jcomp7);
	        add (jcomp8);
	        add (jcomp9);
	        add (jcomp10);
	        add (jcomp11);
	        add (txtEndereco);
	        add (txtCPF);
	        add (txtNome);
	        add (txtBairro);
	        add (txtCEP);
	        add (txtCidade);
	        add (txtCargo);
	        add (txtSalario);

	        //set component bounds (only needed by Absolute Positioning)
	        btLimpar.setBounds (35, 470, 100, 20);
	        btSair.setBounds (275, 470, 100, 20);
	        btSalvar.setBounds (160, 470, 100, 20);
	        jcomp4.setBounds (45, 95, 100, 25);
	        jcomp5.setBounds (45, 245, 100, 25);
	        jcomp6.setBounds (45, 295, 100, 25);
	        jcomp7.setBounds (45, 345, 100, 25);
	        jcomp8.setBounds (45, 390, 100, 25);
	        jcomp9.setBounds (45, 45, 100, 25);
	        jcomp10.setBounds (45, 145, 100, 25);
	        jcomp11.setBounds (45, 195, 100, 25);
	        txtEndereco.setBounds (110, 145, 225, 25);
	        txtCPF.setBounds (110, 95, 225, 25);
	        txtNome.setBounds (110, 45, 225, 25);
	        txtBairro.setBounds (110, 195, 225, 25);
	        txtCEP.setBounds (110, 245, 225, 25);
	        txtCidade.setBounds (115, 295, 220, 25);
	        txtCargo.setBounds (115, 345, 220, 25);
	        txtSalario.setBounds (115, 390, 220, 25);
	        
	        btSair.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
				
	        		System.exit(0);      		
	        		
				}
			});
	        
	        btLimpar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
					
	        		txtBairro.setText("");
	        		txtCargo.setText("");
	        		txtCEP.setText("");
	        		txtCidade.setText("");
	        		txtCPF.setText("");
	        		txtEndereco.setText("");
	        		txtNome.setText("");
	        		txtSalario.setText("");
	        		txtNome.requestFocus();
	        		       		
				}
			});
	        
	        btSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					FuncionarioDAO f = new FuncionarioDAO();
					
					f.setBairro(txtBairro.getText());
					f.setCargo(txtCargo.getText());
					f.setCEP(txtCEP.getText());
					f.setCidade(txtCidade.getText());
					f.setCPF(txtCPF.getText());
					f.setEndereco(txtEndereco.getText());
					f.setNome(txtNome.getText());
					f.setSalario(Integer.parseInt(txtSalario.getText()));
					
					JOptionPane.showMessageDialog(btSalvar, f.inserirFuncionario());
					
				}
			});
	    }

	    public static void main (String[] args) {
	        JFrame frame = new JFrame ("Cadastro de Funcionario");
	        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add (new GuiFuncionario());
	        frame.pack();
	        frame.setVisible (true);
	    }
	
}