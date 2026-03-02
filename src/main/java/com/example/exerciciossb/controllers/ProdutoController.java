package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.entities.Produto;
import com.example.exerciciossb.service.ProdutoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto novoproduto(@RequestParam String nome) {
        Produto produto = new Produto(nome);
        produtoService.criarProduto(produto);
        return produto;
    }

}
