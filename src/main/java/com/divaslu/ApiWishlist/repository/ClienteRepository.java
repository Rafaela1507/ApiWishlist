package com.divaslu.ApiWishlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divaslu.ApiWishlist.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


	
	
}

