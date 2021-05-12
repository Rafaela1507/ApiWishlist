package com.divaslu.ApiWishlist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divaslu.ApiWishlist.model.Produto;
import com.divaslu.ApiWishlist.service.ProdutoService;

@RestController  //é quem define as rotas ou url
@RequestMapping("/produtos")


public class ProdutoController {
	
	@Autowired  //é a ligação entre os objetos
	public ProdutoService service;
	
	
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveProduto(produto));
	}
	    
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(service.getProdutos());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Long id){
		return service.getProdutoById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
					
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		service.deleteById(id);
	}

}
