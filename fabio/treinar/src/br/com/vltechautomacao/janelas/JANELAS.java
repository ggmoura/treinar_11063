package br.com.vltechautomacao.janelas;

import java.awt.EventQueue;
import br.com.treinarminas.academico.classandobject.Mouse;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class JANELAS {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JANELAS window = new JANELAS();
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
	public JANELAS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("calcula cliques");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mouse m = new Mouse();
				for (int i = 0; i < 10; i++) {
					m.clicarBtnDireito();
				}
				for (int i = 0; i < 13; i++) {
					m.clicarBtnEsquerdo();
				}
				
				JOptionPane.showMessageDialog(btnNewButton,"Botao direito imprimiu: "+m.retornaQtdclickBtndireito()+" e botao esquerdo clicou: "+m.retornaQtdclickBtnEsquerdo());
				 
			}
		});
		btnNewButton.setBounds(10, 41, 125, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblOi = new JLabel("oi");
		lblOi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOi.setBounds(10, 12, 303, 14);
		frame.getContentPane().add(lblOi);
	}
}
