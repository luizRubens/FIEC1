package frames;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PainelLista extends JPanel{

	private JButton btLimpar;
	private JButton btCalcular;
	private JLabel jcomp3;
	private JTextField txtValor;
	private JList Lista;
	private JLabel jcomp6;
	private JTextField txtTotal;
	private JScrollPane sp;

	public PainelLista() {
		//construct preComponents
		String[] ListaItems = {"10%", "20%", "30%","40%"};

		//construct components
		btLimpar = new JButton ("Limpar");
		btCalcular = new JButton ("Calcular");
		jcomp3 = new JLabel ("Valor");
		txtValor = new JTextField (5);
		Lista = new JList (ListaItems);
		jcomp6 = new JLabel ("Total");
		txtTotal = new JTextField (5);
		txtTotal.enable(false);

		sp = new JScrollPane(Lista);//adiciona barra de rolagem na rlista

		//adjust size and set layout
		setBounds(0,0,211,238);
		setLayout (null);

		//add components
		add (btLimpar);
		add (btCalcular);
		add (jcomp3);
		add (txtValor);
		add (jcomp6);
		add (txtTotal);
		add (sp);

		//set component bounds (only needed by Absolute Positioning)
		btLimpar.setBounds (105, 190, 95, 30);
		btCalcular.setBounds (10, 190, 95, 30);
		jcomp3.setBounds (25, 25, 60, 25);
		txtValor.setBounds (60, 25, 100, 25);
		sp.setBounds (60, 70, 100, 60);
		jcomp6.setBounds (25, 155, 60, 25);
		txtTotal.setBounds (60, 155, 100, 25);

		btLimpar.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
				txtTotal.setText("");
				txtValor.setText("");
				txtValor.requestFocus();
			}
		});
		btCalcular.addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent arg0) {
			try{//tenta converter o texto para numero e caso der erro ele mostra uma janela de erro
				double v = Double.parseDouble(txtValor.getText());
				double t = 0;
				if (Lista.getSelectedIndex()==0){
					t = v* 0.9;
				}
				else if (Lista.getSelectedIndex()==1){
					t = v* 0.8;
				}
				else if (Lista.getSelectedIndex()==2){
					t = v* 0.7;
				}
				else if (Lista.getSelectedIndex()==3){
					t = v* 0.6;
				}
				txtTotal.setText(""+t);
			}
			catch(NumberFormatException erro){
				JOptionPane.showMessageDialog(btCalcular, "Forneça um valor real");
				txtValor.requestFocus();
			}
		}
		});
	}
}