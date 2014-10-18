package banco;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GuiFornecedor2 extends JFrame {

	private JButton btConsultar, btSair;
	private JPanel panel;
	private BD bd;

	public GuiFornecedor2(){
		bd = new BD();
		setTitle("Consulta de Fornecedores");
		setBounds(0,0,800,400);
		setResizable(false);
		setBackground(Color.white);
		btConsultar = new JButton("Consultar");
		btSair= new JButton("Sair");
		panel = new JPanel();
		panel.add(btConsultar);
		panel.add(btSair);

		add (panel, BorderLayout.NORTH);
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0){
				System.exit(0);

			}
		});
		btConsultar.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0){
				String sql = "select * from fornecedor";
				if (bd.getConnection()){
					JScrollPane sp = new JScrollPane(TableGrade.getTable (bd,sql));
					add(sp, BorderLayout.CENTER);
					panel.updateUI();
					bd.Close();

				}
				else {
					JOptionPane.showMessageDialog(btConsultar, "Falha na conexão");
				}
			}
		});
	}

	public static void main(String[] args) {

		GuiFornecedor2 g= new GuiFornecedor2();
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}