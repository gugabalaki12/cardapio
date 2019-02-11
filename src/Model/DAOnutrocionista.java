package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConFactory;

public class DAOnutrocionista {
	private final String URL = "jdbc:mysql://localhost:3306/restaurante?useTimezone=true&serverTimezone=UTC",  
	         NOME = "root", SENHA = "";  
	   private Connection con;  
	
	   
	 public boolean checkLogin(String login,String senha){
		 conectar(); 
		 PreparedStatement stmt = null;
		 ResultSet rs; 
		 boolean check = false;		
		 try{
			 stmt = con.prepareStatement("select * from nutricionista where login = ? and senha = ?;");
	            stmt.setString(1, login);
	            stmt.setString(2, senha);
	            rs = stmt.executeQuery();
		   if(rs.next()){
			   check = true;   
		   } 
		 }catch (SQLException e) {  
	         imprimeErro("Erro ", e.getMessage());  
	      }
		 
		 return check;
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
