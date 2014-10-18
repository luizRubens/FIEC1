package frames;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Seguradora extends JPanel {
	
	private JButton btLimpar;
	private JButton btCalcular;
	private JLabel jcomp3;
	private JLabel jcomp4;
	private JRadioButton radioHomem;
	private JRadioButton radioMulher;
	private JTextField txtValor;
	private JList Lista;
	private JLabel jcomp9;
	private JTextField txtValorSeguro;
	private ButtonGroup gb;

	public Seguradora() {
		//construct preComponents
		
		String[] ListaItems = {"zero", "2013", "2014"};

		gb = new ButtonGroup();

		gb.add(radioHomem);
		gb.add(radioMulher);

		//radioHomem.setSelected(true);

		//construct components
		btLimpar = new JButton ("Limpar");
		btCalcular = new JButton ("Calcular");
		jcomp3 = new JLabel ("Valor do veículo:");
		jcomp4 = new JLabel ("Motorista");
		radioHomem = new JRadioButton ("Homem");
		radioMulher = new JRadioButton ("Mulher");
		txtValor = new JTextField (5);
		Lista = new JList (ListaItems);
		jcomp9 = new JLabel ("Valor do seguro:");
		txtValorSeguro = new JTextField (5);
		txtValorSeguro.setEnabled(false);

		//adjust size and set layout
		setPreferredSize (new Dimension (270, 335));
		setLayout (null);

		//add components
		add (btLimpar);
		add (btCalcular);
		add (jcomp3);
		add (jcomp4);
		add (radioHomem);
		add (radioMulher);
		add (txtValor);
		add (Lista);
		add (jcomp9);
		add (txtValorSeguro);

		//set component bounds (only needed by Absolute Positioning)
		btLimpar.setBounds (140, 225, 90, 30);
		btCalcular.setBounds (40, 225, 90, 30);
		jcomp3.setBounds (30, 20, 100, 25);
		jcomp4.setBounds (30, 50, 60, 25);
		radioHomem.setBounds (105, 50, 100, 25);
		radioMulher.setBounds (105, 75, 100, 25);
		txtValor.setBounds (130, 20, 100, 25);
		Lista.setBounds (85, 110, 100, 75);
		jcomp9.setBounds (25, 275, 95, 25);
		txtValorSeguro.setBounds (125, 275, 100, 25);

		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double vc = Double.parseDouble(txtValor.getText());
					double vs = 0;
					if (radioHomem.isSelected()){
						if (Lista.getSelectedIndex()==0){
							vs= vc - (vc*7/100);
						}
						if (Lista.getSelectedIndex()==1){
							vs= vc - (vc*8/100);
						}
						if (Lista.getSelectedIndex()==2){
							vs= vc - (vc*9/100);
						}
						txtValorSeguro.setText(""+vs);

					}
					if (radioMulher.isSelected()){
						if (Lista.getSelectedIndex()==0){
							vs= vc - (vc*7/100);
						}
						if (Lista.getSelectedIndex()==1){
							vs= vc - (vc*8/100);

						}
						if (Lista.getSelectedIndex()==2){
							vs= vc - (vc*9/100);

						}
						txtValorSeguro.setText(""+vs);
					}							
				}
				catch(NumberFormatException erro){
					JOptionPane.showMessageDialog(Lista, "Por favor forneça um numero real");
					txtValor.requestFocus();
				}
			}
		});
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtValor.setText("");
				txtValorSeguro.setText("");
				txtValor.requestFocus();
			}
		});
	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("Calculo de seguro.");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Seguradora());
		frame.pack();
		frame.setVisible (true);
	}
}