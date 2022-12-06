package entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Table(name = "tb_colchao")
public class Colchao extends Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String molagem;
	private String densidade;
	private String conforto;
	
	public Colchao(){
	super();
	}
	
	public Colchao(String molagem, String densidade, String conforto, int id) {
		super();
		this.molagem = molagem;
		this.densidade = densidade;
		this.conforto = conforto;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

