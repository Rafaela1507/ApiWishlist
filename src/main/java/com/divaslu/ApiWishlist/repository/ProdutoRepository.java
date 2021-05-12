package com.divaslu.ApiWishlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divaslu.ApiWishlist.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

		

}
