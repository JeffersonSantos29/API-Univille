package com.APIUniville.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Produto;
import com.service.ProdutoService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }
    
    @GetMapping("/todos")
    public List<Produto> getTodosProdutos() {
        return produtoService.getAllProdutos();
        
    }
    }
    


