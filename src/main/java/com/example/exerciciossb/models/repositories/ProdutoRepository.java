package com.example.exerciciossb.models.repositories;

import com.example.exerciciossb.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
