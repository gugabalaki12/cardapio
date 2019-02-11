package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewNutricionista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewNutricionista frame = new ViewNutricionista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewNutricionista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 504);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCardapio = new JMenu("Cardapio");
		menuBar.add(mnCardapio);
		
		JMenuItem mntmCadastrarCardapio = new JMenuItem("Cadastrar Cardapio");
	mnCardapio.add(mntmCadastrarCardapio);
		
		JMenuItem mntmEditarexcluir = new JMenuItem("Editar/Excluir");
		mnCardapio.add(mntmEditarexcluir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 693, 495);
		contentPane.add(panel);
		panel.setLayout(null);
	
		
	
		mntmCadastrarCardapio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   ViewCadastro frame = new ViewCadastro();
				   
				   panel.add(frame);
				   frame.setVisible(true);
			
			}
		});
		
	
	}
}
