package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Produto;
import com.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> getAllProdutos(){

        return produtoRepository.findAll();
    }

}
