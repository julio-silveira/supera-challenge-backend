package br.com.banco.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.banco.helpers.TipoOperacao;

public class TransferenciaDto {

  @NotBlank(message = "O Valor é obrigatório")
  private float valor;

  @NotBlank(message = "O tipo de operação é obrigatório")
  private TipoOperacao tipo; 

  @Size(max = 50, message = "O nome só pode ter 50 caracteres")
  private String nome_operador_transacao;

  @NotBlank
  private long conta_id;


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

  public String getNome_operador_transacao() {
    return this.nome_operador_transacao;
  }

  public void setNome_operador_transacao(String nome_operador_transacao) {
    this.nome_operador_transacao = nome_operador_transacao;
  }

  public long getConta_id() {
    return this.conta_id;
  }

  public void setConta_id(long conta_id) {
    this.conta_id = conta_id;
  }

}
