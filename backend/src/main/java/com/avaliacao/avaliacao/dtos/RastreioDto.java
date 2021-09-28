package com.avaliacao.avaliacao.dtos;

import com.avaliacao.avaliacao.domain.enums.Situacao;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RastreioDto {
  private String codigo;
  private Situacao situacao;
  List<HistoricoDto> historicos;
}
