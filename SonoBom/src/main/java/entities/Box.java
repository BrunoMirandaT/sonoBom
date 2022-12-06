package entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Table(name = "tb_box")
public class Box extends Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String tipo;
	private String pes;
	private String estrutura;
	private Long id;
	
	public Box(String tipo, String pes, String estrutura, Long id) {
		this.tipo = tipo;
		this.pes = pes;
		this.estrutura = estrutura;
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

