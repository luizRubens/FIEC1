package persistencia;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiAluno extends JPanel {

	private JButton btGravar;
	private JButton btLer;
	private JButton btSair;
	private JLabel lbNome;
	private JLabel lbRa;
	private JLabel lbEmail;
	private JLabel lbCurso;
	private JTextField tfNome;
	private JTextField tfRa;
	private JTextField tfEmail;
	private JTextField tfCurso;
	private Aluno aluno;

	public GuiAluno() {
		//construct components

		aluno=new Aluno();

		btGravar = new JButton ("Gravar");
		btLer = new JButton ("Ler");
		btSair = new JButton ("Sair");
		lbNome = new JLabel ("Nome");
		lbRa = new JLabel ("RA");
		lbEmail = new JLabel ("E-mail");
		lbCurso = new JLabel ("Curso");
		tfNome = new JTextField (5);
		tfRa = new JTextField (5);
		tfEmail = new JTextField (5);
		tfCurso = new JTextField (5);

		//adjust size and set layout
		setPreferredSize (new Dimension (369, 261));
		setLayout (null);

		//add components
		add (btGravar);
		add (btLer);
		add (btSair);
		add (lbNome);
		add (lbRa);
		add (lbEmail);
		add (lbCurso);
		add (tfNome);
		add (tfRa);
		add (tfEmail);
		add (tfCurso);

		//set component bounds (only needed by Absolute Positioning)
		btGravar.setBounds (135, 185, 100, 20);
		btLer.setBounds (25, 185, 100, 20);
		btSair.setBounds (245, 185, 115, 20);
		lbNome.setBounds (20, 10, 60, 30);
		lbRa.setBounds (25, 45, 55, 30);
		lbEmail.setBounds (20, 90, 60, 25);
		lbCurso.setBounds (20, 130, 60, 25);
		tfNome.setBounds (80, 15, 150, 20);
		tfRa.setBounds (80, 50, 150, 20);
		tfEmail.setBounds (80, 90, 150, 20);
		tfCurso.setBounds (80, 130, 155, 20);



		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pegar dados da tela e colocar no objeto
				aluno.ra =tfRa.getText();
				aluno.nome =tfNome.getText();
				aluno.curso =tfCurso.getText();
				aluno.email =tfEmail.getText();
				//grava e mostra o resultado
				if(aluno.gravar()){
					JOptionPane.showMessageDialog(null,"Gravado");
				}
				else{
					JOptionPane.showMessageDialog(null,"Falha na gravação");
				}
			}
		});

		btLer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					aluno = aluno.ler(tfRa.getText());	
					tfNome.setText(aluno.nome);
					tfCurso.setText(aluno.nome);
					tfEmail.setText(aluno.nome);

				}
				catch(Exception erro){
					JOptionPane.showMessageDialog(null,"Aluno não encontrado");
				}



			}
		});
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);

			}
		});        
	}
	public static void main (String[] args) {
		JFrame frame = new JFrame ("MyPanel");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new GuiAluno());
		frame.pack();
		frame.setVisible (true);
	}
}
