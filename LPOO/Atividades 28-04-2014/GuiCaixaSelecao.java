package frames;
import java.awt.event.*;

import javax.swing.*;
public class GuiCaixaSelecao extends JPanel {
    private JButton btVerificar;
    private JCheckBox ckIngles;
    private JCheckBox ckInformatica;
    private JButton btMarcar;
    private JButton btDesmarcar;

    public GuiCaixaSelecao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setBounds(90, 30, 200, 200);
        btVerificar = new JButton("Verificar");
        ckIngles = new JCheckBox("Ingles");
        ckInformatica = new JCheckBox("Informatica");
        btMarcar = new JButton("Marcar");
        btDesmarcar = new JButton("Desmarcar");
        setLayout(null);
        add(btVerificar);
        add(ckIngles);
        add(ckInformatica);
        add(btMarcar);
        add(btDesmarcar);
        btVerificar.setBounds(20, 70, 100, 20);
        ckIngles.setBounds(15, 15, 100, 25);
        ckInformatica.setBounds(15, 40, 100, 25);
        btMarcar.setBounds(20, 100, 100, 20);
        btDesmarcar.setBounds(20, 130, 100, 20);
    }
    private void definirEventos() {
        btMarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);
            }
        });
        btDesmarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ckInformatica.setSelected(false);
                ckIngles.setSelected(false);
            }
        });
        btVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String selecao = "Selecionados: ";
                if (ckIngles.isSelected()) {
                    selecao += "\nIngles";
                }
                if (ckInformatica.isSelected()) {
                    selecao += "\nInformatica";
                }
                JOptionPane.showMessageDialog(null, selecao);
            }
        });
    }
    
    public static void main (String[] args) {
        JFrame frame = new JFrame ("GuiCaixaSelecao");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GuiCaixaSelecao());
        frame.setBounds(0,0,200,200);
        frame.setVisible (true);
    }
}





