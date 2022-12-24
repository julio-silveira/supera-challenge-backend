package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  br.com.banco.model.ContaModel;


@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long> {
  
}
