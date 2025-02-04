package com.example.exercicio2.Repository;

import com.example.exercicio2.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByDataIsNull();
    List<Pedido> findByDataIsNotNull();

}
