package br.com.banco.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import br.com.banco.helpers.TipoOperacao;

@Entity(name = "transferencias")
public class TransferenciaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @DateTimeFormat
  @CreationTimestamp
  @Column(nullable = false)
  private LocalDateTime data; 

  @Column(nullable = false)
  private float valor;

  @Column(nullable = false)
  @Enumerated(value = EnumType.STRING)
  private TipoOperacao tipo; 

  @Column
  private String nome;

  @ManyToOne
  @JoinColumn(name= "conta_id", nullable = false)
  private ContaModel conta;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getData() {
    return this.data;
  }

  public void setData(LocalDateTime data_transferencia) {
    this.data = data_transferencia;
  }

  public float getValor() {
    return this.valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public TipoOperacao getTipo() {
    return this.tipo;
  }

  public void setTipo(TipoOperacao tipo) {
    this.tipo = tipo;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome_operador_transacao) {
    this.nome = nome_operador_transacao;
  }

  public ContaModel getConta() {
    return this.conta;
  }

  public void setConta(ContaModel conta) {
    this.conta = conta;
  }

}
