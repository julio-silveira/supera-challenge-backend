package br.com.banco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.services.TransferenciaService;

@RestController
@RequestMapping("/transacoes")
public class TransferenciaController {

  final TransferenciaService transferenciaService;

  public TransferenciaController(TransferenciaService transferenciaService) {
    this.transferenciaService = transferenciaService;
  }


  
  // @GetMapping
  // public String findAll(){
  // } 
}
