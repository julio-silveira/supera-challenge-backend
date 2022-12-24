package br.com.banco.controllers;

import java.time.LocalDateTime;
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
    @RequestParam(required = false) String name,
    @RequestParam(required = false, defaultValue = "1700-01-01T00:00:00") String startingDate,
    @RequestParam(required = false, defaultValue = "3000-01-01T00:00:00") String endingDate){

     
    LocalDateTime sDate = LocalDateTime.parse(startingDate);
    LocalDateTime eDate = LocalDateTime.parse(endingDate);

      return ResponseEntity.status(HttpStatus.OK).body(transferenciaService.find(id, name, sDate, eDate));
  }
}
