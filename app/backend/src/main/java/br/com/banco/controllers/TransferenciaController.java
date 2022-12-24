package br.com.banco.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.dtos.TransferenciaDto;
import br.com.banco.model.TransferenciaModel;
import br.com.banco.services.TransferenciaService;

@RestController
@RequestMapping("/transacoes")
public class TransferenciaController {

  final TransferenciaService transferenciaService;

  public TransferenciaController(TransferenciaService transferenciaService) {
    this.transferenciaService = transferenciaService;
  }

  @PostMapping
  public ResponseEntity<Object> saveTransaction(@RequestBody @Valid TransferenciaDto transferenciaDto ) {
      var transferenciaModel = new TransferenciaModel();
      BeanUtils.copyProperties(transferenciaDto, transferenciaModel);
      transferenciaModel.setData_transferencia(LocalDateTime.now(ZoneId.of("UTC-3")));
      return ResponseEntity.status(HttpStatus.CREATED).body(transferenciaService.save(transferenciaModel));
  } 
}
