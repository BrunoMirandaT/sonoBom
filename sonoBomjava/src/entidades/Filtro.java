package entidades;

public class Filtro extends Colchao {
	
	private Double valorMax;
	private String conforto;
	private String problemasColuna;
	
	
	public Filtro(Double valorMax, String conforto, String problemasColuna) {
		this.valorMax = valorMax;
		this.conforto = conforto;
		this.problemasColuna = problemasColuna;
	}
	public Double getValorMax() {
		return valorMax;
	}
	public void setValorMax(Double valorMax) {
		this.valorMax = valorMax;
	}
	public String getConforto() {
		return conforto;
	}
	public void setConforto(String conforto) {
		this.conforto = conforto;
	}
	public String getProblemasColuna() {
		return problemasColuna;
	}
	public void setProblemasColuna(String problemasColuna) {
		this.problemasColuna = problemasColuna;
	}
	
}
