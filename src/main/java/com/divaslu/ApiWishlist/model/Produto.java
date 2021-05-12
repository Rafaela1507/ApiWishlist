package com.divaslu.ApiWishlist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "tb_produto")

public class Produto {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //usando o mysql "Identity fará o auto incremento.
	long id;
	String nome;
	String descricao;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	Double valor;
	int estoque;
	
	public Produto() {

	}

	public Produto(String nome, String descricao, Double valor, int estoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
}


	
