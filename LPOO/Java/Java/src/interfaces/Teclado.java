package interfaces;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.print.attribute.AttributeSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class Teclado extends JPanel implements MouseListener{
	private JButton b1;
	private JButton b3;
	private JButton b2;
	private JButton b5;
	private JButton b7;
	private JButton b9;
	private JButton b6;
	private JButton b0;
	private JButton blimpar;
	private JButton b4;
	private JButton b8;
	private JButton bsair;
	private JTextField campotext;

	public Teclado() {
		//construct components
		b1 = new JButton ("1");
		b3 = new JButton ("3");
		b2 = new JButton ("2");
		b5 = new JButton ("5");
		b7 = new JButton ("7");
		b9 = new JButton ("9");
		b6 = new JButton ("6");
		b0 = new JButton ("0");
		blimpar = new JButton ("C");
		b4 = new JButton ("4");
		b8 = new JButton ("8");
		bsair = new JButton ("Sair");
		campotext = new JTextField (5);
		campotext.setEditable(false);

		//adjust size and set layout
		setPreferredSize (new Dimension (291, 339));
		setLayout (null);

		//add components
		add (b1);
		add (b3);
		add (b2);
		add (b5);
		add (b7);
		add (b9);
		add (b6);
		add (b0);
		add (blimpar);
		add (b4);
		add (b8);
		add (bsair);
		add (campotext);

		//set component bounds (only needed by Absolute Positioning)
		b1.setBounds (40, 25, 100, 25);
		b3.setBounds (40, 65, 100, 25);
		b2.setBounds (160, 25, 100, 25);
		b5.setBounds (40, 110, 100, 25);
		b7.setBounds (40, 150, 100, 25);
		b9.setBounds (40, 190, 100, 25);
		b6.setBounds (160, 110, 100, 25);
		b0.setBounds (160, 190, 100, 25);
		blimpar.setBounds (40, 235, 100, 25);
		b4.setBounds (160, 65, 100, 25);
		b8.setBounds (160, 150, 100, 25);
		bsair.setBounds (160, 235, 100, 25);
		campotext.setBounds (25, 280, 250, 30);
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);
		b7.addMouseListener(this);
		b8.addMouseListener(this);
		b9.addMouseListener(this);
		b0.addMouseListener(this);
		bsair.addMouseListener(this);
		blimpar.addMouseListener(this);
	}


	public static void main (String[] args) {
		JFrame frame = new JFrame ("Teclado");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Teclado());
		frame.pack();
		frame.setResizable (false);
		frame.setVisible (true);
	}


	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==b1){
			campotext.setText(campotext.getText()+"1");
		}
		else if (e.getSource()==b2){
			campotext.setText(campotext.getText()+"2");
		}
		else if (e.getSource()==b3){
			campotext.setText(campotext.getText()+"3");
		}
		else if (e.getSource()==b4){
			campotext.setText(campotext.getText()+"4");
		}
		else if (e.getSource()==b5){
			campotext.setText(campotext.getText()+"5");
		}
		else if (e.getSource()==b6){
			campotext.setText(campotext.getText()+"6");
		}
		else if (e.getSource()==b7){
			campotext.setText(campotext.getText()+"7");
		}
		else if (e.getSource()==b8){
			campotext.setText(campotext.getText()+"8");
		}
		else if (e.getSource()==b9){
			campotext.setText(campotext.getText()+"9");
		}
		else if (e.getSource()==b0){
			campotext.setText(campotext.getText()+"0");
		}
		if (e.getSource()==bsair){
			System.exit(0);
		}
		if (e.getSource()==blimpar){
			campotext.setText("");
		}
		if (campotext.getText().length()>=9){//aqui se a quantidade de caracteres digitados forem maiores do que 9 ele não digita mais.
			
			b0.setEnabled(false);
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
			return;
		}
	}

	public void mouseEntered(MouseEvent arg0) {

	}

	public void mouseExited(MouseEvent arg0) {

	}


	public void mousePressed(MouseEvent arg0) {

	}



	public void mouseReleased(MouseEvent arg0) {

	}
}