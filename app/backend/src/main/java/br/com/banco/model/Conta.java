package br.com.banco.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Conta {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @OneToMany(mappedBy = "conta")
  private long id_conta;


  @Column(nullable = false)
  private String nome_responsavel;

  public long getId_conta() {
    return id_conta;
  }

  public void setId_conta(long id_conta) {
    this.id_conta = id_conta;
  }

  public String getNome_responsavel() {
    return nome_responsavel;
  }

  public void setNome_responsavel(String nome_responsavel) {
    this.nome_responsavel = nome_responsavel;
  }
}
