package com.divaslu.ApiWishlist;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.divaslu.ApiWishlist.domain.model.ProdutoBuilder;
import com.divaslu.ApiWishlist.model.Produto;
import com.divaslu.ApiWishlist.repository.ProdutoRepository;



@SpringBootTest
@AutoConfigureMockMvc
public abstract class BaseTest {
	
	@BeforeEach
    public void setup(){
		Produto produto = new ProdutoBuilder().defaultValues();
		produtoRepository.save(produto);

	}
	
	@Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ProdutoRepository produtoRepository;

}
