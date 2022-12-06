package entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Table(name = "tb_lojas")
public class Lojas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	private double preco;
	private boolean disponibilidade;
	public Lojas() {
		super();
	}
	public Lojas(String nome, double preco, boolean disponibilidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
}
