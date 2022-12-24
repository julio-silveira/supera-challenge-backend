package br.com.banco.services;

import org.springframework.stereotype.Service;

import br.com.banco.repositories.TransferenciaRepository;

@Service
public class TransferenciaService {
  
 
  final TransferenciaRepository transferenciaRepository;

  public TransferenciaService(TransferenciaRepository transferenciaRepository) {
    this.transferenciaRepository = transferenciaRepository;
  }

  
}
