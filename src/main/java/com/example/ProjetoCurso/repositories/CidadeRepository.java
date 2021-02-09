package com.example.ProjetoCurso.repositories;


import com.example.ProjetoCurso.domain.Cidade;
import com.example.ProjetoCurso.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {


}
