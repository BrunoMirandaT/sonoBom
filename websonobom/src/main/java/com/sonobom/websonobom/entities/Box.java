package com.sonobom.websonobom.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name = "tb_box")
public class Box extends Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String tipo;
	private String pes;
	private String estrutura;
	private int id;
	
	public Box(String tipo, String pes, String estrutura, int id) {
		this.tipo = tipo;
		this.pes = pes;
		this.estrutura = estrutura;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
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

