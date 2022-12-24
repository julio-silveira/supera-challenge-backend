package br.com.banco.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.banco.helpers.TipoOperacao;
import br.com.banco.model.TransferenciaModel;
import br.com.banco.repositories.TransferenciaRepository;

@Service
public class TransferenciaService {
  
 
  final TransferenciaRepository transferenciaRepository;

  public TransferenciaService(TransferenciaRepository transferenciaRepository) {
    this.transferenciaRepository = transferenciaRepository;
  }

  public List<TransferenciaModel> find(Long id, String name, LocalDateTime startingDate, LocalDateTime endingDate) {
    if( name == null) {
    return transferenciaRepository.findByContaIdAndDataBetween(id, startingDate, endingDate);
    } else {
      return transferenciaRepository.findByContaIdAndNomeAndDataBetween(id, name, startingDate, endingDate);
    }
  }
}
