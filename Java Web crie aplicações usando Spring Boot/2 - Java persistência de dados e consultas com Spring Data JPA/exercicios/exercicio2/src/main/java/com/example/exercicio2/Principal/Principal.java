package com.example.exercicio2.Principal;

import com.example.exercicio2.Repository.CategoriaRepository;
import com.example.exercicio2.Repository.PedidoRepository;
import com.example.exercicio2.Repository.ProdutoRepository;
import com.example.exercicio2.model.Categoria;
import com.example.exercicio2.model.Pedido;
import com.example.exercicio2.model.Produto;

public class Principal {
    private PedidoRepository pedidoRepository;
    private CategoriaRepository categoriaRepository;
    private ProdutoRepository produtoRepository;

    public Principal(PedidoRepository pedidoRepository, ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository) {
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }


    public void adicionaPedido(Pedido pedido){
        pedidoRepository.save(pedido);
    }

    public void adicionaProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public void adicionaCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }


}
