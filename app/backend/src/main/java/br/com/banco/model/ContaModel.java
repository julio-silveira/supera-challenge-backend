package br.com.banco.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name = "contas")
public class ContaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // @OneToMany(mappedBy = "conta")
  private Long id_conta;


  @Column(nullable = false)
  private String nome_responsavel;

  @JsonIgnore
  @OneToMany(mappedBy = "conta")
  private List<TransferenciaModel> transferencias = new ArrayList<>();

  public Long getId_conta() {
    return id_conta;
  }

  public void setId_conta(Long id_conta) {
    this.id_conta = id_conta;
  }

  public String getNome_responsavel() {
    return nome_responsavel;
  }

  public void setNome_responsavel(String nome_responsavel) {
    this.nome_responsavel = nome_responsavel;
  }
}
