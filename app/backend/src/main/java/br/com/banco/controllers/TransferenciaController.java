package br.com.banco.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.model.TransferenciaModel;
import br.com.banco.services.TransferenciaService;

@RestController
@RequestMapping("/transacoes/{id}")
public class TransferenciaController {

  final TransferenciaService transferenciaService;

  public TransferenciaController(TransferenciaService transferenciaService) {
    this.transferenciaService = transferenciaService;
  }

  @GetMapping
  public ResponseEntity<List<TransferenciaModel>> getAllTransactions(@PathVariable Long id,
    @RequestParam String name,
    @RequestParam String startingDate,
    @RequestParam String endingDate){
      System.out.println(startingDate + " " + endingDate +" "+ name);

    return ResponseEntity.status(HttpStatus.OK).body(transferenciaService.findAll());
  }
}
