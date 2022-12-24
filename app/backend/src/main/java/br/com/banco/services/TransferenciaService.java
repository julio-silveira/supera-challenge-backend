package br.com.banco.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.banco.model.TransferenciaModel;
import br.com.banco.repositories.TransferenciaRepository;

@Service
public class TransferenciaService {
  
 
  final TransferenciaRepository transferenciaRepository;

  public TransferenciaService(TransferenciaRepository transferenciaRepository) {
    this.transferenciaRepository = transferenciaRepository;
  }

  @Transactional
  public TransferenciaModel save(TransferenciaModel transferenciaModel){
    return transferenciaRepository.save(transferenciaModel);
  } 
}
