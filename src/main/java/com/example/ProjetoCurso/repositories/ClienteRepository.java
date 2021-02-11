package com.example.ProjetoCurso.repositories;


import com.example.ProjetoCurso.domain.Categoria;
import com.example.ProjetoCurso.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
