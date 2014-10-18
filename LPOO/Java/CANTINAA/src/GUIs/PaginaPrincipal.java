package GUIs;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PaginaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaPrincipal window = new PaginaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaginaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 801, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setFont(new Font("Calibri", Font.BOLD, 16));
		frame.setJMenuBar(menuBar);

		JMenu mnFornecedor = new JMenu("Fornecedor");
		mnFornecedor.setFont(new Font("Calibri", Font.PLAIN, 16));
		menuBar.add(mnFornecedor);

		JMenuItem mnItemNovo_Fornecedor = new JMenuItem("Novo");
		mnItemNovo_Fornecedor.setBackground(Color.WHITE);
		mnItemNovo_Fornecedor.setSelectedIcon(new ImageIcon("C:\\Users\\luiz\\Desktop\\icone-mais-vendidos.gif"));
		mnItemNovo_Fornecedor.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFornecedor.add(mnItemNovo_Fornecedor);

		JMenuItem mnItemAtualizar_Fornecedor = new JMenuItem("Atualizar");
		mnItemAtualizar_Fornecedor.setBackground(Color.WHITE);
		mnItemAtualizar_Fornecedor.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFornecedor.add(mnItemAtualizar_Fornecedor);

		JMenuItem mnItemProcurar_Fornecedor = new JMenuItem("Porcurar");
		mnItemProcurar_Fornecedor.setBackground(Color.WHITE);
		mnItemProcurar_Fornecedor.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFornecedor.add(mnItemProcurar_Fornecedor);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mntmNewMenuItem_3.setBackground(Color.WHITE);
		mntmNewMenuItem_3.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFornecedor.add(mntmNewMenuItem_3);

		JMenu mnFuncionario = new JMenu("Funcion\u00E1rio");
		mnFuncionario.setFont(new Font("Calibri", Font.PLAIN, 16));
		menuBar.add(mnFuncionario);

		JMenuItem mnItemNovo_Funcionario = new JMenuItem("Novo");
		mnItemNovo_Funcionario.setBackground(Color.WHITE);
		mnItemNovo_Funcionario.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFuncionario.add(mnItemNovo_Funcionario);

		JMenuItem mnItemAtualizar_Funcionario = new JMenuItem("Atualizar");
		mnItemAtualizar_Funcionario.setBackground(Color.WHITE);
		mnItemAtualizar_Funcionario.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFuncionario.add(mnItemAtualizar_Funcionario);

		JMenuItem mnItemProcurar_Funcionario = new JMenuItem("Procurar");
		mnItemProcurar_Funcionario.setBackground(Color.WHITE);
		mnItemProcurar_Funcionario.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFuncionario.add(mnItemProcurar_Funcionario);

		JMenuItem mnItemExcluir_Funcionario = new JMenuItem("Excluir");
		mnItemExcluir_Funcionario.setBackground(Color.WHITE);
		mnItemExcluir_Funcionario.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFuncionario.add(mnItemExcluir_Funcionario);

		JMenu mnProduto = new JMenu("Produto");
		mnProduto.setBackground(Color.WHITE);
		mnProduto.setFont(new Font("Calibri", Font.PLAIN, 16));
		menuBar.add(mnProduto);

		JMenuItem mnItemNovo_Produto = new JMenuItem("Novo");
		mnItemNovo_Produto.setBackground(Color.WHITE);
		mnItemNovo_Produto.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnProduto.add(mnItemNovo_Produto);

		JMenuItem mnItemAtualizar_Produto = new JMenuItem("Atualizar");
		mnItemAtualizar_Produto.setBackground(Color.WHITE);
		mnItemAtualizar_Produto.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnProduto.add(mnItemAtualizar_Produto);

		JMenuItem mnItemProcurar_Produto = new JMenuItem("Procurar");
		mnItemProcurar_Produto.setBackground(Color.WHITE);
		mnItemProcurar_Produto.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnProduto.add(mnItemProcurar_Produto);

		JMenuItem mnItemExcluir_Produto = new JMenuItem("Excluir");
		mnItemExcluir_Produto.setBackground(Color.WHITE);
		mnItemExcluir_Produto.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnProduto.add(mnItemExcluir_Produto);

		JMenu mnVenda = new JMenu("Venda");
		mnVenda.setFont(new Font("Calibri", Font.PLAIN, 16));
		menuBar.add(mnVenda);

		JMenuItem mnItemNovo_Venda = new JMenuItem("Novo");
		mnItemNovo_Venda.setBackground(Color.WHITE);
		mnItemNovo_Venda.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVenda.add(mnItemNovo_Venda);

		JMenuItem mnItemAtualizar_Venda = new JMenuItem("Atualizar/Alterar");
		mnItemAtualizar_Venda.setBackground(Color.WHITE);
		mnItemAtualizar_Venda.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVenda.add(mnItemAtualizar_Venda);

		JMenuItem mnItemProcurar_Venda = new JMenuItem("Procurar");
		mnItemProcurar_Venda.setBackground(Color.WHITE);
		mnItemProcurar_Venda.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVenda.add(mnItemProcurar_Venda);

		JMenuItem mnItemEcluir_Venda = new JMenuItem("Excluir");
		mnItemEcluir_Venda.setBackground(Color.WHITE);
		mnItemEcluir_Venda.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVenda.add(mnItemEcluir_Venda);

		JMenu mnFinanças = new JMenu("Finan\u00E7as");
		mnFinanças.setBackground(Color.WHITE);
		mnFinanças.setFont(new Font("Calibri", Font.PLAIN, 16));
		menuBar.add(mnFinanças);

		JMenuItem mnItemGerar_LucroDiario = new JMenuItem("Gerar Lucro Di\u00E1rio");
		mnItemGerar_LucroDiario.setBackground(Color.WHITE);
		mnItemGerar_LucroDiario.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFinanças.add(mnItemGerar_LucroDiario);

		JMenuItem mntmGerar_lucro_semanal = new JMenuItem("Gerar lucro Semanal");
		mntmGerar_lucro_semanal.setBackground(Color.WHITE);
		mntmGerar_lucro_semanal.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFinanças.add(mntmGerar_lucro_semanal);

		JMenuItem mntmGerar_lucro_mensal = new JMenuItem("Gerar lucro mensal");
		mntmGerar_lucro_mensal.setBackground(Color.WHITE);
		mntmGerar_lucro_mensal.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnFinanças.add(mntmGerar_lucro_mensal);

		JMenu mnEstatisticas = new JMenu("Estat\u00EDsticas");
		mnEstatisticas.setBackground(Color.WHITE);
		mnEstatisticas.setFont(new Font("Calibri", Font.PLAIN, 16));
		menuBar.add(mnEstatisticas);

		JMenuItem mntmMensal = new JMenuItem("Mensal");
		mntmMensal.setBackground(Color.WHITE);
		mntmMensal.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnEstatisticas.add(mntmMensal);

		JMenu mnVarios_Meses = new JMenu("Varios Mes\u00EAs");
		mnVarios_Meses.setBackground(Color.WHITE);
		mnVarios_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnEstatisticas.add(mnVarios_Meses);

		JMenuItem mntm2_Meses = new JMenuItem("2 Mes\u00EAs");
		mntm2_Meses.setBackground(Color.WHITE);
		mntm2_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm2_Meses);

		JMenuItem mntm3_Meses = new JMenuItem("3 Mes\u00EAs");
		mntm3_Meses.setBackground(Color.WHITE);
		mntm3_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm3_Meses);

		JMenuItem mntm4_Meses = new JMenuItem("4 Mes\u00EAs");
		mntm4_Meses.setBackground(Color.WHITE);
		mntm4_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm4_Meses);

		JMenuItem mntm5_Meses = new JMenuItem("5 Mes\u00EAs");
		mntm5_Meses.setBackground(Color.WHITE);
		mntm5_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm5_Meses);

		JMenuItem mntm6_Meses = new JMenuItem("6 Mes\u00EAs");
		mntm6_Meses.setBackground(Color.WHITE);
		mntm6_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm6_Meses);

		JMenuItem mntm7_Meses = new JMenuItem("7 Mes\u00EAs");
		mntm7_Meses.setBackground(Color.WHITE);
		mntm7_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm7_Meses);

		JMenuItem mntm8_Meses = new JMenuItem("8 Mes\u00EAs");
		mntm8_Meses.setBackground(Color.WHITE);
		mntm8_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm8_Meses);

		JMenuItem mntm9_Meses = new JMenuItem("9 Mes\u00EAs");
		mntm9_Meses.setBackground(Color.WHITE);
		mntm9_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm9_Meses);

		JMenuItem mntm10_Meses = new JMenuItem("10 Mes\u00EAs");
		mntm10_Meses.setBackground(Color.WHITE);
		mntm10_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm10_Meses);

		JMenuItem mntm11_Meses = new JMenuItem("11 Mes\u00EAs");
		mntm11_Meses.setBackground(Color.WHITE);
		mntm11_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm11_Meses);

		JMenuItem mntm12_Meses = new JMenuItem("12 Mes\u00EAs");
		mntm12_Meses.setBackground(Color.WHITE);
		mntm12_Meses.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnVarios_Meses.add(mntm12_Meses);

		JMenuItem mntmAte_Momento = new JMenuItem("At\u00E9 o Momento");
		mntmAte_Momento.setBackground(Color.WHITE);
		mntmAte_Momento.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnEstatisticas.add(mntmAte_Momento);
	}
}