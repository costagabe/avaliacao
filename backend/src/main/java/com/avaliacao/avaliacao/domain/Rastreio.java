package com.avaliacao.avaliacao.domain;

import com.avaliacao.avaliacao.domain.enums.Situacao;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Rastreio {
  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "codigo", nullable = false, length = 32)
  private String codigo;

  @Column(name = "situacao", nullable = false)
  @Enumerated(EnumType.STRING)
  private Situacao situacao;

  @OneToMany(mappedBy = "rastreio")
  List<Historico> historicos;
}
