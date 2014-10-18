package exercicio02;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_Livro extends JPanel implements Serializable{

	private JButton btBuscar;
	private JLabel jcomp2;
	private JLabel jcomp3;
	private JLabel jcomp4;
	private JLabel jcomp5;
	private JLabel jcomp6;
	private JTextField txtCodigo;
	private JTextField txtTitulo;
	private JTextField txtEditora;
	private JTextField txtPreco;
	private JTextField txtAno_publicacao;
	private JButton btGravar;
	private JButton btSair;

	public GUI_Livro() {
		//construct components
		btBuscar = new JButton ("Buscar");
		jcomp2 = new JLabel ("Codigo");
		jcomp3 = new JLabel ("Titulo");
		jcomp4 = new JLabel ("Editora");
		jcomp5 = new JLabel ("Preço");
		jcomp6 = new JLabel ("Ano de publicação");
		txtCodigo = new JTextField (5);
		txtTitulo = new JTextField (5);
		txtEditora = new JTextField (5);
		txtPreco = new JTextField (5);
		txtAno_publicacao = new JTextField (5);
		btGravar = new JButton ("Gravar");
		btSair = new JButton ("Sair");

		//adjust size and set layout
		setPreferredSize (new Dimension (324, 298));
		setLayout (null);

		//add components
		add (btBuscar);
		add (jcomp2);
		add (jcomp3);
		add (jcomp4);
		add (jcomp5);
		add (jcomp6);
		add (txtCodigo);
		add (txtTitulo);
		add (txtEditora);
		add (txtPreco);
		add (txtAno_publicacao);
		add (btGravar);
		add (btSair);

		//set component bounds (only needed by Absolute Positioning)
		btBuscar.setBounds (10, 255, 100, 25);
		jcomp2.setBounds (20, 30, 60, 25);
		jcomp3.setBounds (25, 75, 60, 25);
		jcomp4.setBounds (25, 120, 60, 25);
		jcomp5.setBounds (25, 160, 60, 25);
		jcomp6.setBounds (20, 200, 110, 25);
		txtCodigo.setBounds (130, 30, 170, 25);
		txtTitulo.setBounds (130, 75, 170, 25);
		txtEditora.setBounds (130, 120, 170, 25);
		txtPreco.setBounds (130, 160, 175, 25);
		txtAno_publicacao.setBounds (130, 200, 175, 25);
		btGravar.setBounds (110, 255, 100, 25);
		btSair.setBounds (210, 255, 100, 25);

		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});

		btBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String b=JOptionPane.showInputDialog(btBuscar,"Por favor didigte o codigo do livro.");

				GUI_Livro l1 = new GUI_Livro();

				try{
					l1=l1.ler(b);
					if(l1!=null){

						txtAno_publicacao.setText(String.valueOf(l1.ano));
						txtCodigo.setText(String.valueOf(l1.codigo));
						txtEditora.setText(l1.editora);
						txtPreco.setText(String.valueOf(l1.preco));
						txtTitulo.setText(l1.titulo);

					}
				}
				catch(Exception erro){
					JOptionPane.showMessageDialog(null,"Não encontrado!");

				}

			}
		});

		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				GUI_Livro l1 = new GUI_Livro();

				l1.codigo = Integer.parseInt(txtCodigo.getText());
				l1.titulo = txtTitulo.getText();
				l1.editora = txtEditora.getText();
				l1.preco = Double.parseDouble(txtPreco.getText());
				l1.ano = Integer.parseInt(txtAno_publicacao.getText());

				if (l1.gravar()){
					JOptionPane.showMessageDialog(null, "Gravado com sucesso!");

				}
				else {
					JOptionPane.showMessageDialog(null, "Tivemos um erro na gravação.");
				}

			}
		});

	}

	private String titulo, editora;
	private int ano,codigo;
	private double preco;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {

		if (codigo>=1){
			this.codigo = codigo;
		}
		else{
			JOptionPane.showMessageDialog(null, "Codigo invalido!");
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {

		if(preco>=1){

			this.preco = preco;

		}
		else{

			JOptionPane.showMessageDialog(null, "O preço não pode ser menor que 0.");

		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {

		if(ano<1919 && ano>2021){

			JOptionPane.showMessageDialog(null, "O ano não pode ser maior do que 1920");

			this.ano = ano;
		}
	}

	public boolean gravar(){
		FileOutputStream f= null;
		ObjectOutputStream obj = null;
		try{
			f= new FileOutputStream(String.valueOf(codigo));
			obj = new ObjectOutputStream(f);
			obj.writeObject(this);//this é o objeto que vc vai gravar que aqui é o livro
			obj.flush();//cria um fluxo entre a memoria e o disco e grava no disco
			return true;

		}
		catch (IOException erro) {
			System.out.println(erro.toString());
			return false;
		}
		finally{
			try{

				f.close ();
				obj.close ();}
			catch (IOException e){

			}		
		}

	}
	public GUI_Livro ler (String codigo){
		FileInputStream f= null;
		ObjectInputStream obj = null;
		try{
			f= new FileInputStream(codigo);
			obj = new ObjectInputStream(f);
			return (GUI_Livro) obj.readObject ();//aqui ele converte um objeto para o aluno 

		}
		catch (Exception erro) {
			System.out.println(erro.toString());
			return null;//aqui retorna nulo se não conseguiu ler
		}
		finally{
			try{

				f.close ();
				obj.close ();
			}
			catch (IOException e){

			}
		}
	}

	public void CalcularDesconto (){
		
	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("Cadastro de livros");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new GUI_Livro());
		frame.pack();
		frame.setVisible (true);
	}
}