package entidades;

public class Colchao extends Produto {
	
	private String molagem;
	private String densidade;
	private String conforto;
	
	public Colchao(){
	super();
	}
	
	public Colchao(String molagem, String densidade, String conforto) {
		super();
		this.molagem = molagem;
		this.densidade = densidade;
		this.conforto = conforto;
	}

	public String getMolagem() {
		return molagem;
	}

	public void setMolagem(String molagem) {
		this.molagem = molagem;
	}

	public String getDensidade() {
		return densidade;
	}

	public void setDensidade(String densidade) {
		this.densidade = densidade;
	}

	public String getConforto() {
		return conforto;
	}

	public void setConforto(String conforto) {
		this.conforto = conforto;
	}
	
	
	
	

}
