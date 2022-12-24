package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  br.com.banco.model.Conta;


@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
  
}
