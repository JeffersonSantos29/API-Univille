package com.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Produto {

    @Id
    @Column(name = "id_produto")
    private Integer id;
    @Column(name = "nome_produto")
    private String nome_produto;
    @Column(name = "valor")
    private Integer valor;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public Integer getValor() {
        return valor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }

    

}
