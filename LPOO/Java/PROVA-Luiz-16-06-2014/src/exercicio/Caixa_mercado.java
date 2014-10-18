package exercicio;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import mercado.CompraDAO;

public class Caixa_mercado extends JPanel {

	private JButton btCalcular;
	private JButton btListar;
	private JButton btGravar;
	private JButton btSair;
	private JLabel jcomp5;
	private JLabel jcomp6;
	private JLabel jcomp7;
	private JLabel jcomp8;
	private JTextField txtPreco_uni;
	private JTextField txtValor;
	private JTextField txtDescricao;
	private JComboBox comboItem;
	private JTable lista;

	public Caixa_mercado() {
		//construct preComponents
		String[] comboItemItems = {"","1", "2", "3","4","5","6","7","8","9","10"};

		//construct components
		btCalcular = new JButton ("Calcular");
		btListar = new JButton ("Listar");
		btGravar = new JButton ("Gravar");
		btSair = new JButton ("Sair");
		jcomp5 = new JLabel ("Descrição:");
		jcomp6 = new JLabel ("Quantidade:");
		jcomp7 = new JLabel ("Preço unitário:");
		jcomp8 = new JLabel ("Valor total:");
		txtPreco_uni = new JTextField (5);
		txtValor = new JTextField (5);
		txtDescricao = new JTextField (5);
		comboItem = new JComboBox (comboItemItems);

		Vector title = new Vector();
		title.addElement("Código");
		title.addElement("Descrição");
		
		Vector linha = new Vector();
		linha.add("1");
		linha.add("Maçã");
		
		Vector linha2 = new Vector();
		linha2.add("2");
		linha2.add("Maracujá");

		Vector produtos = new Vector();
		
		produtos.add(linha);
		produtos.add(linha2);
		
		lista = new JTable(produtos, title);
		lista.setBounds(0, 0, 300, 300);
		
		JScrollPane scroll1 = new JScrollPane();
		scroll1.setBounds(10, 240, 300, 300);
		
		scroll1.add(lista);
		
		//adjust size and set layout
		setPreferredSize (new Dimension (479, 534));
		setLayout (null);

		//add components
		add (btCalcular);
		add (btListar);
		add (btGravar);
		add (btSair);
		add (jcomp5);
		add (jcomp6);
		add (jcomp7);
		add (jcomp8);
		add (txtPreco_uni);
		add (txtValor);
		add (txtDescricao);
		add (comboItem);
		add(scroll1);

		txtValor.enable(false);

		//set component bounds (only needed by Absolute Positioning)
		btCalcular.setBounds (15, 205, 100, 25);
		btListar.setBounds (245, 205, 100, 25);
		btGravar.setBounds (130, 205, 100, 25);
		btSair.setBounds (360, 205, 100, 25);
		jcomp5.setBounds (25, 25, 100, 25);
		jcomp6.setBounds (25, 110, 100, 25);
		jcomp7.setBounds (25, 70, 100, 25);
		jcomp8.setBounds (25, 150, 100, 25);
		txtPreco_uni.setBounds (115, 70, 100, 25);
		txtValor.setBounds (115, 150, 100, 25);
		txtDescricao.setBounds (115, 25, 315, 25);
		comboItem.setBounds (115, 110, 100, 25);

		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});

		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtPreco_uni.getText().equals("") || txtPreco_uni.getText().equals("0")){

					JOptionPane.showMessageDialog(btGravar, "Por favor forneça um preço.");
				}
				else if (comboItem.getSelectedItem().equals("")){

					JOptionPane.showMessageDialog(btGravar, "Por favor selecione uma quantidade.");

				}
				else if (txtDescricao.getText().equals("")){
					JOptionPane.showMessageDialog(btGravar, "Por favor informe uma descrição.");
				}
				else if(txtValor.getText().equals("")){
					JOptionPane.showMessageDialog(btGravar, "Por favor forneça o valor total da compra.\nPara isso realize um calculo.\nPara relizar um calculo forneça o valor unitario e selecione uma quantidade e clique em calcular.");
				}
				else{

					CompraDAO c = new CompraDAO();

					c.setDescricao(txtDescricao.getText());
					c.setPreco_unitario(Float.parseFloat( txtPreco_uni.getText()));
					c.setQuantidade(comboItem.getSelectedIndex());
					c.setValor_total(Float.parseFloat(txtValor.getText()));

					JOptionPane.showMessageDialog(btGravar, c.inserirCompra());

				}
			}
		});

		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (txtPreco_uni.getText().equals("") || txtPreco_uni.getText().equals("0")){

					JOptionPane.showMessageDialog(btCalcular, "Por favor forneça um preço.");
				}
				else if (comboItem.getSelectedItem().equals("")){

					JOptionPane.showMessageDialog(btCalcular, "Por favor selecione uma quantidade.");

				}
				else{

					double preco = Double.parseDouble(txtPreco_uni.getText());
					int quantidade =  Integer.parseInt(""+comboItem.getSelectedItem());

					double valor = preco*quantidade;

					txtValor.setText(""+valor);
				}
			}
		});

		btListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {



			}
		});
	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("Caixa de Super Mercado.");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Caixa_mercado());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible (true);
	}
}