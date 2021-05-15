package com.divaslu.ApiWishlist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@AllArgsConstructor

@Getter
@Setter
@Entity
@Table(name = "tb_produto")

public class Produto {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //usando o mysql "Identity fará o auto incremento.
	 long id;
	 String nome;
	 String descricao;
	 String cor;
	 double valor;
	
	
	
	public Produto(String nome, String descricao, String cor, Double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.cor = cor;
		this.valor = valor;
	}

	public Produto () {}
		
}


	
