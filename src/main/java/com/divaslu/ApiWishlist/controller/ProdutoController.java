package com.divaslu.ApiWishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divaslu.ApiWishlist.model.Produto;
import com.divaslu.ApiWishlist.repository.ProdutoRepository;

@RestController  //é quem define as rotas ou url
@RequestMapping("/produtos")

public class ProdutoController {
	
	@Autowired  //é a ligação entre os objetos
		
	public ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	

}
