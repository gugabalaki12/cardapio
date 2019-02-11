package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Control.Cardapio;

public class DAOcardapio {
	private final String URL = "jdbc:mysql://localhost:3306/restaurante?useTimezone=true&serverTimezone=UTC",  
	         NOME = "root", SENHA = "";  
	   private Connection con;  
	
	   public void inserir(Cardapio card){

			  conectar(); 
			  String sql = "INSERT INTO cardapio(pratoprincipal, arroz, guarnicao, bebida, dia, periodo, tipo) VALUES(?,?,?,?,?,?,?)";
				 try{
					 PreparedStatement stmt = con.prepareStatement(sql);
			            stmt.setString(1, card.getPratoPrincipal());
			            stmt.setString(2, card.getArroz());
			            stmt.setString (3, card.getGuarnicao());
			            stmt.setString(4, card.getBebida());
			            stmt.setString(5, card.getDia());
			            stmt.setString(6, card.getPeriodo());
			            stmt.setString(7, card.getTipo());
			            stmt.execute();
			            stmt.close();
			            JOptionPane.showMessageDialog(null, "Usuario Cadastrado");  
				   
				 }catch (SQLException e) {  
			         imprimeErro("Erro ao cadastrar", e.getMessage());  
			      }
			   
			   
		   }
	
	 private void conectar() {  
	      try {  
	         con = ConFactory.conexao(URL, NOME, SENHA, ConFactory.MYSQL);  
	         System.out.println("Conectado!");  
	      } catch (ClassNotFoundException e) {  
	         imprimeErro("Erro ao carregar o driver", e.getMessage());  
	      } catch (SQLException e) {  
	         imprimeErro("Erro ao conectar", e.getMessage());  
	      }  
	   }  

  private void imprimeErro(String msg, String msgErro) {  
	      JOptionPane.showMessageDialog(null, msg, "Erro cr�tico", 0);  
	      System.err.println(msg);  
	      System.out.println(msgErro);  
	      System.exit(0);  
	   }  
}
