package br.com.banco.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.banco.model.TransferenciaModel;
import br.com.banco.repositories.TransferenciaRepository;

@Service
public class TransferenciaService {
  
 
  final TransferenciaRepository transferenciaRepository;

  public TransferenciaService(TransferenciaRepository transferenciaRepository) {
    this.transferenciaRepository = transferenciaRepository;
  }

  public List<TransferenciaModel> findAll(){
    return transferenciaRepository.findAll();
  
  }
}
