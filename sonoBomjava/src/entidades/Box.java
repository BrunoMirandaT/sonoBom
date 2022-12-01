package entidades;

public class Box extends Produto {

	private String tipo;
	private String pes;
	private String estrutura;
	
	public Box(String tipo, String pes, String estrutura) {
		this.tipo = tipo;
		this.pes = pes;
		this.estrutura = estrutura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPes() {
		return pes;
	}

	public void setPes(String pes) {
		this.pes = pes;
	}

	public String getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
	}
	
}
