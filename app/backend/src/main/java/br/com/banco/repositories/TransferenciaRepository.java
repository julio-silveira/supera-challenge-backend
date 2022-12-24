package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.model.Transferencia;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia,Long> {
  
}
