package com.sonobom.websonobom.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name = "tb_filtro")
public class Filtro extends Colchao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

