package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import Control.Cardapio;
import Model.DAOcardapio;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ViewCadastro extends JInternalFrame {
	private JTextField txtprato;
	private JTextField txtarroz;
	private JTextField txtguarnicao;
	private JTextField txtbebida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastro frame = new ViewCadastro();
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
	public ViewCadastro() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setTitle("Cadastro Cardapio");
		setEnabled(false);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(37, 47, 206, 100);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rbalunos = new JRadioButton("Alunos/Servidores");
		rbalunos.setBackground(Color.GRAY);
		rbalunos.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		rbalunos.setBounds(17, 17, 171, 23);
		panel.add(rbalunos);
		
		JRadioButton rboutros = new JRadioButton("Outros Ususarios");
		rboutros.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		rboutros.setBackground(Color.GRAY);
		rboutros.setBounds(17, 58, 171, 23);
		panel.add(rboutros);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblTipo.setBounds(57, 22, 46, 14);
		getContentPane().add(lblTipo);
		
		JLabel lblPeriodo = new JLabel("Periodo      /  Dia");
		lblPeriodo.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblPeriodo.setBounds(314, 22, 183, 14);
		getContentPane().add(lblPeriodo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(274, 47, 249, 100);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rbmanha = new JRadioButton("Almo\u00E7o");
		rbmanha.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		rbmanha.setBackground(Color.GRAY);
		rbmanha.setBounds(6, 18, 92, 23);
		panel_1.add(rbmanha);
		
		JRadioButton rbtarde = new JRadioButton("Jantar");
		rbtarde.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		rbtarde.setBackground(Color.GRAY);
		rbtarde.setBounds(6, 64, 171, 23);
		panel_1.add(rbtarde);
		
		JDateChooser date = new JDateChooser();
		date.setBounds(128, 21, 111, 20);
		panel_1.add(date);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(106, 158, 361, 121);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prato Principal:");
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 11, 97, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblArroz = new JLabel("Arroz:");
		lblArroz.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblArroz.setBounds(10, 36, 97, 14);
		panel_2.add(lblArroz);
		
		JLabel lblGuarnio = new JLabel("Guarni\u00E7\u00E3o:");
		lblGuarnio.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblGuarnio.setBounds(10, 61, 97, 14);
		panel_2.add(lblGuarnio);
		
		JLabel lblBebida = new JLabel("Bebida:");
		lblBebida.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblBebida.setBounds(10, 86, 97, 14);
		panel_2.add(lblBebida);
		
		txtprato = new JTextField();
		txtprato.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtprato.setBounds(104, 9, 233, 20);
		panel_2.add(txtprato);
		txtprato.setColumns(10);
		
		txtarroz = new JTextField();
		txtarroz.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtarroz.setColumns(10);
		txtarroz.setBounds(50, 34, 233, 20);
		panel_2.add(txtarroz);
		
		txtguarnicao = new JTextField();
		txtguarnicao.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtguarnicao.setColumns(10);
		txtguarnicao.setBounds(81, 61, 233, 20);
		panel_2.add(txtguarnicao);
		
		txtbebida = new JTextField();
		txtbebida.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtbebida.setColumns(10);
		txtbebida.setBounds(61, 86, 233, 20);
		panel_2.add(txtbebida);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String prato, bebida, guarnicao, arroz, tipo= "", dia, periodo = "";
				 prato = txtprato.getText();
				 bebida = txtbebida.getText();
				 guarnicao = txtguarnicao.getText();
				 arroz = txtarroz.getText();
				 SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
				 dia = formatador.format(date.getDate());
				 
				 JOptionPane.showMessageDialog(null, dia);  
				 if(rbalunos.isSelected()) {
					  tipo = "Alunos e Funcionarios";
				 }else if (rboutros.isSelected()) {
					  tipo = "Outros";
				 }
				 if(rbmanha.isSelected()) {
					 periodo = "Almoço";
				 } else if (rbtarde.isSelected()) {
					 periodo = "Jantar";
				 }
				Cardapio novo = new Cardapio(prato, arroz, guarnicao, dia, periodo,tipo,bebida); 
			     DAOcardapio dao = new DAOcardapio();
			       dao.inserir(novo);
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		btnNewButton.setBounds(213, 296, 132, 39);
		getContentPane().add(btnNewButton);
		setBounds(100, 100, 573, 401);

	}
}
