package Control;

public class Nutricionista { 
         private int id;
         private String nome;
         private int codServ;
         private String senha;
         
         
         public Nutricionista( int id, String nome, int codServ , String senha){
        	  this.id = id;
        	  this.nome = nome;
        	  this.codServ = codServ;
        	  this.senha = senha;
         }


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getCodServ() {
			return codServ;
		}


		public void setCodServ(int codServ) {
			this.codServ = codServ;
		}


		public String getSenha() {
			return senha;
		}


		public void setSenha(String senha) {
			this.senha = senha;
		}
         
         
	

}
