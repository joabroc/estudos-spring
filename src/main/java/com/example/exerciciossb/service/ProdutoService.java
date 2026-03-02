package com.example.exerciciossb.service;

import com.example.exerciciossb.models.entities.Produto;
import com.example.exerciciossb.models.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto criarProduto(Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

}
