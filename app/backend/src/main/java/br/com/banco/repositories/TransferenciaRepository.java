package br.com.banco.repositories;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.model.TransferenciaModel;

@Repository
public interface TransferenciaRepository extends JpaRepository<TransferenciaModel,Long> {

  List<TransferenciaModel> findByContaIdAndDataBetween(Long id, LocalDateTime startingDate, LocalDateTime endingDate);

  List<TransferenciaModel> findByContaIdAndNomeAndDataBetween(Long id, String nome, LocalDateTime startingDate, LocalDateTime endingDate);
}
