package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GuiPacote {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPacote window = new GuiPacote();
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
	public GuiPacote() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Cod de Pacote:");
		
		JLabel lblDiasDePacote = new JLabel("Dias de Pacote:");
		
		JLabel lblRoteiro = new JLabel("Roteiro:");
		
		JLabel lblDiaDeChegada_1 = new JLabel("Dia de Chegada:");
		
		JLabel lblDiaDeChegada = new JLabel("Dia de Saida:");
		
		JLabel lblHorarioDeSada = new JLabel("Horario de sa\u00EDda:");
		
		JLabel lblHorarioDeChegada = new JLabel("Horario de chegada:");
		
		JLabel label_6 = new JLabel("New label");
		
		JLabel label_7 = new JLabel("New label");
		
		JLabel lblRoteiro_1 = new JLabel("Roteiro:");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRoteiro_1)
						.addComponent(label_7)
						.addComponent(lblHorarioDeChegada)
						.addComponent(label_6)
						.addComponent(lblDiaDeChegada_1)
						.addComponent(lblHorarioDeSada)
						.addComponent(lblDiaDeChegada)
						.addComponent(lblRoteiro)
						.addComponent(lblDiasDePacote)
						.addComponent(lblNewLabel))
					.addContainerGap(368, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel)
					.addGap(30)
					.addComponent(lblDiasDePacote)
					.addGap(30)
					.addComponent(lblRoteiro)
					.addGap(28)
					.addComponent(lblDiaDeChegada)
					.addGap(30)
					.addComponent(lblDiaDeChegada_1)
					.addGap(26)
					.addComponent(lblHorarioDeSada)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addComponent(lblHorarioDeChegada)
					.addGap(32)
					.addComponent(label_6)
					.addGap(27)
					.addComponent(label_7)
					.addGap(30)
					.addComponent(lblRoteiro_1)
					.addGap(50))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
