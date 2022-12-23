package br.com.banco.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.banco.helpers.TipoOperacao;

@Entity
public class Transferencia {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false)
  private String data_transferencia; 

  @Column(nullable = false)
  private float valor;

  @Column(nullable = false)
  private TipoOperacao tipo; 

  @Column(nullable = false)
  private String nome_operador;

  @ManyToOne
  @JoinColumn(name= "conta_id")
  @Column(nullable = false)
  private long conta_id;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getData_transferencia() {
    return this.data_transferencia;
  }

  public void setData_transferencia(String data_transferencia) {
    this.data_transferencia = data_transferencia;
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

  public String getNome_operador() {
    return this.nome_operador;
  }

  public void setNome_operador(String nome_operador) {
    this.nome_operador = nome_operador;
  }

  public long getConta_id() {
    return this.conta_id;
  }

  public void setConta_id(long conta_id) {
    this.conta_id = conta_id;
  }

}
