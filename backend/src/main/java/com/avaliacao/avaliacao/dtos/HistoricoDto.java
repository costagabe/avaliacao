package com.avaliacao.avaliacao.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class HistoricoDto {
  private String descricao;
  private LocalDateTime data;
}
