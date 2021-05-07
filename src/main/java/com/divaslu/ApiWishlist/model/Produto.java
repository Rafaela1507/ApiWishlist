package com.divaslu.ApiWishlist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")

public class Produto {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	long id;
	String nome;
	String descricao;
	Double valor;
	
	
}
