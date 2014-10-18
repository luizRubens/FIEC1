package frames;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PainelImagem extends JPanel{

	private JList liFotos;
	private DefaultListModel dlm;
	private ImageIcon ic;
	private JScrollPane sp;
	private JLabel lbImagem;

	public PainelImagem(){
		setLayout(null);
		setBounds (0,0,400,300);
		dlm = new DefaultListModel();//aqui se pode adicionar os itens da lista
		for (int i = 1;i<=10;i++){
			dlm.addElement("FOTO"+i);
		}
		liFotos = new JList(dlm);
		sp=new JScrollPane(liFotos);
		sp.setBounds(50, 40, 70,150);
		add (sp);
		ic = new ImageIcon("fotos/white.jpg");
		lbImagem = new JLabel(ic);
		lbImagem.setBounds(150,30,180,180);
		add (lbImagem);

		liFotos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				ic = new ImageIcon("fotos/"+liFotos.getSelectedValue()+".jpg");
				lbImagem.setIcon(ic);
			}
		});
	}
}