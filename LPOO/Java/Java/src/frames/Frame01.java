package frames;

import java.awt.GridLayout; // * é valido para todas as classes do pacote awt
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; // * é valido para todas as classes do pacote swing
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame01 extends JFrame {
	//Declaração dos elementos gráficos
	
	JButton btSomar, btLimpar, btSubtrair, btMultiplicar, btDividir, btSair;
	JLabel lbNumero1,lbNumero2,lbResultado;
	JTextField tfNumero1,tfNumero2,tfResultado;
	
	//método construtor.
	//executado pelo operador new
	public Frame01() {
		btSomar = new JButton ("Somar");
		btLimpar = new JButton("Limpar");
		btLimpar.setMnemonic('L'); //adiciona um atalho utilizando a tecla ALT mais a letra entre aspas
		btSomar.setMnemonic('S');
		btLimpar.setToolTipText("Limpa as caixas de textos");
		btSomar.setToolTipText("Soma os valores das caixa de texto");
		lbNumero1 = new JLabel("Numero 1");
		lbNumero2 = new JLabel("Numero 2");
		lbResultado = new JLabel("Resultado");
		tfNumero1 = new JTextField();
		tfNumero2 = new JTextField();
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		btSubtrair = new JButton ("Subtrair");
		btMultiplicar = new JButton("Multiplicar");
		btSubtrair.setToolTipText("Subtrai os valores");
		btMultiplicar.setToolTipText("Multiplica os valores");
		btDividir = new JButton("Dividir");
		btDividir.setToolTipText("Divide os valores");
		btSair = new JButton("Sair");

		//definição das propriedades do frame
		setTitle("Calculadora Basica");
		setBounds(100,200,300,200);
		setLayout(new GridLayout(6,2));
		setResizable(false);

		//Adcionar os componentes ao frame
		add(lbNumero1); //linha1
		add(tfNumero1); //linha1
		add(lbNumero2);//linha2
		add(tfNumero2); //linha2
		add(lbResultado); //linha3
		add(tfResultado);//linha3
		add(btLimpar);// linha4
		add(btSomar);//linha4
		add(btSubtrair);
		add(btMultiplicar);
		add(btDividir);
		add(btSair);
		//agora temos que criar um evento de interação com o usuario
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Limpando");
				tfNumero1.setText("");
				tfNumero2.setText("");
				tfResultado.setText("");
				tfNumero1.requestFocus();//atraves desse metodo quando limpar o cursor ira ficar na primeira janela para auxiliar a digitação
			}
		});
		btSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(btSomar,"Calculando");//por colocar o btsomar então aparecera essa mensagem em cima do botão somar ao inves do meio da tela usando o null
				calcular(1);
			}});
		btSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(btSomar,"Calculando");//por colocar o btsomar então aparecera essa mensagem em cima do botão somar ao inves do meio da tela usando o null
				calcular (2);
			}
		});
		btMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(btSomar,"Calculando");//por colocar o btsomar então aparecera essa mensagem em cima do botão somar ao inves do meio da tela usando o null
				calcular (3);
			}});
		btDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(btSomar,"Calculando");//por colocar o btsomar então aparecera essa mensagem em cima do botão somar ao inves do meio da tela usando o null
				calcular (4);
			}});
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			} });}
	public void calcular (int operacao){
		double n1, n2;
		double r=0;
		try {
			n1=Double.parseDouble(tfNumero1.getText());
		}
		catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null,"Digite o 1º valor");
			tfNumero1.setText("");
			tfNumero1.requestFocus();
			return;//vai cancelar o evento ele volta pra digitação
		}
		try {
			n2=Double.parseDouble(tfNumero2.getText());//parsedouble converte o numero em texto como ele entra e converte pra numero
		}
		catch (NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite o 2° valor ");
			tfNumero2.setText("");
			tfNumero2.requestFocus();
			return;
		}
		if (operacao==1){
			r=n1+n2;
		}
		else if (operacao==2){
			r=n1-n2;
		}
		else if (operacao==3){
			r=n1*n2;
		}
		else if (operacao==4){
			if (n2==0){
				JOptionPane.showMessageDialog(null,"O numero 2 não pode ser 0");
			}
			r=n1/n2;
		}
		else{
			JOptionPane.showMessageDialog(null,"Operação invalida");
		}
		tfResultado.setText(""+r);
	}
	public static void main(String[] args) {
		Frame01 frame01 = new Frame01();
		frame01.setVisible(true);
		frame01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//isso serve para matar a memoria, pois se o usuario fechar no X mesmo assim o programa continua rodando na RAM quando o usuario fechar vai fechar mesmo
	}//fim do construtor
}//fim da classe