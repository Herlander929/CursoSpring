package com.example.ProjetoCurso.repositories;


import com.example.ProjetoCurso.domain.ItemPedido;
import com.example.ProjetoCurso.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {


}
