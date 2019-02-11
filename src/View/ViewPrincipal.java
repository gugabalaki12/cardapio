package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrincipal frame = new ViewPrincipal();
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
	public ViewPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 445);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\PC Casa\\Documents\\Cardapio\\src\\img1\\restaurant-cutlery-circular-symbol-of-a-spoon-and-a-fork-in-a-circle (1).png"));
		lblNewLabel.setBounds(333, 39, 195, 140);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 285, 406);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSelecioneSeuTipo = new JLabel("\u2022Selecione:");
		lblSelecioneSeuTipo.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblSelecioneSeuTipo.setBounds(40, 27, 265, 35);
		panel.add(lblSelecioneSeuTipo);
		
		JRadioButton rdbtnUsuarioDoInstituto = new JRadioButton("Usuario do instituto");
		rdbtnUsuarioDoInstituto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		rdbtnUsuarioDoInstituto.setBackground(Color.GRAY);
		rdbtnUsuarioDoInstituto.setBounds(61, 76, 203, 23);
		panel.add(rdbtnUsuarioDoInstituto);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\PC Casa\\Documents\\Cardapio\\src\\img1\\student (1).png"));
		lblNewLabel_1.setBounds(20, 62, 46, 50);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbtnUsuarioDeFora = new JRadioButton("Usuario de Fora");
		rdbtnUsuarioDeFora.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		rdbtnUsuarioDeFora.setBackground(Color.GRAY);
		rdbtnUsuarioDeFora.setBounds(61, 150, 203, 23);
		panel.add(rdbtnUsuarioDeFora);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\PC Casa\\Documents\\Cardapio\\src\\img1\\man.png"));
		lblNewLabel_2.setBounds(20, 136, 66, 50);
		panel.add(lblNewLabel_2);
		
		JRadioButton rdnutri = new JRadioButton("Nutricionista");
		rdnutri.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		rdnutri.setBackground(Color.GRAY);
		rdnutri.setBounds(61, 216, 203, 23);
		panel.add(rdnutri);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\PC Casa\\Documents\\Cardapio\\src\\img1\\scientist.png"));
		label.setBounds(20, 197, 78, 50);
		panel.add(label);
		
		JButton btnNewButton = new JButton("Seguir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(rdnutri.isSelected()) {
					  LoginNutricionista frame = new LoginNutricionista();
					  frame.setVisible(true);
					  dispose();
					 
				 }
			
			}
		});
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(79, 317, 126, 35);
		panel.add(btnNewButton);
		
		JLabel lblProblemasComO = new JLabel("Problemas com o aplicativo?");
		lblProblemasComO.setForeground(Color.GRAY);
		lblProblemasComO.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProblemasComO.setBounds(295, 297, 188, 14);
		contentPane.add(lblProblemasComO);
		
		JLabel lblSuporteNutrionrestaurantifmaedubr = new JLabel("Suporte: nutrionrestaurant@ifma.edu.br");
		lblSuporteNutrionrestaurantifmaedubr.setForeground(Color.GRAY);
		lblSuporteNutrionrestaurantifmaedubr.setBounds(295, 311, 253, 14);
		contentPane.add(lblSuporteNutrionrestaurantifmaedubr);
	}
}
