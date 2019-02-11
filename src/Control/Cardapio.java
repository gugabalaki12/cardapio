package Control;

public class Cardapio {
	
	 private String pratoPrincipal;
	 private String arroz;
	 private  String guarnicao;
	 private String dia;
	 public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	private String periodo;
	 private String tipo;
	 private String bebida;
	public Cardapio(String pratoPrincipal, String arroz, String guarnicao, String dia, String periodo, String tipo,
			String bebida) {
	
		this.pratoPrincipal = pratoPrincipal;
		this.arroz = arroz;
		this.guarnicao = guarnicao;
		this.dia = dia;
		this.periodo = periodo;
		this.tipo = tipo;
		this.bebida = bebida;
	}
	
	public String getPratoPrincipal() {
		return pratoPrincipal;
	}
	public void setPratoPrincipal(String pratoPrincipal) {
		this.pratoPrincipal = pratoPrincipal;
	}
	public String getArroz() {
		return arroz;
	}
	public void setArroz(String arroz) {
		this.arroz = arroz;
	}
	public String getGuarnicao() {
		return guarnicao;
	}
	public void setGuarnicao(String guarnicao) {
		this.guarnicao = guarnicao;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	 
	 
	 
}
