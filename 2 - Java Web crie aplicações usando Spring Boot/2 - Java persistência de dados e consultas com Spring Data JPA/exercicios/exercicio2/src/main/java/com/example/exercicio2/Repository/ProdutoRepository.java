package com.example.exercicio2.Repository;

import com.example.exercicio2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNome(String produto);
    List<Produto> findByCategoriaNome(String categoria);
    List<Produto> findByPrecoGreaterThan(Double valor);
    List<Produto> findByPrecoLessThan(Double valor);
    List<Produto> findByNomeContaining(String termo);
    List<Produto> findByCategoriaNomeOrderByPrecoAsc(String nome);

}
