package entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cor;
	private String tamanho;
	private double suportePeso;
	private double precoMin;
	private double nota;
	private String marca;
	private String modelo;
	
	public Produto() {
		super();
	}
	
	public Produto(String cor, String tamanho, double suportePeso, double precoMin, double nota, String marca,
			String modelo) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;
		this.suportePeso = suportePeso;
		this.precoMin = precoMin;
		this.nota = nota;
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public double getSuportePeso() {
		return suportePeso;
	}


	public void setSuportePeso(double suportePeso) {
		this.suportePeso = suportePeso;
	}


	public double getPrecoMin() {
		return precoMin;
	}


	public void setPrecoMin(double precoMin) {
		this.precoMin = precoMin;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}

