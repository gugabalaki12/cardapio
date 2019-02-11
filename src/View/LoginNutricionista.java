package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.DAOnutrocionista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginNutricionista extends JFrame {

	private JPanel contentPane;
	private JTextField txtlogin;
	private JPasswordField pss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginNutricionista frame = new LoginNutricionista();
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
	public LoginNutricionista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(77, 54, 336, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblLogin.setBounds(30, 25, 79, 32);
		panel.add(lblLogin);
		
		txtlogin = new JTextField();
		txtlogin.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		txtlogin.setBounds(82, 32, 231, 20);
		panel.add(txtlogin);
		txtlogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblSenha.setBounds(30, 81, 79, 32);
		panel.add(lblSenha);
		
		pss = new JPasswordField();
		pss.setBounds(82, 88, 231, 20);
		panel.add(pss);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 DAOnutrocionista dao = new DAOnutrocionista();
		            String login, senha;
		            login = txtlogin.getText();
		            senha = pss.getText();
		            
		            boolean check = dao.checkLogin(login,senha);
		            
				    if(check == true) {
				    	ViewNutricionista frame = new ViewNutricionista();
				    	frame.setVisible(true);
				    	dispose();
				    }else {
				    	JOptionPane.showMessageDialog(null,"Login ou Senha Incorreto");  
				    }
				
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		btnNewButton.setBounds(156, 220, 138, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\PC Casa\\Documents\\Cardapio\\src\\img1\\scientist.png"));
		lblNewLabel.setBounds(218, 11, 57, 46);
		contentPane.add(lblNewLabel);
	}
}
