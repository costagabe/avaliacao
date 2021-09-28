package com.avaliacao.avaliacao.controllers;

import com.avaliacao.avaliacao.domain.Rastreio;
import com.avaliacao.avaliacao.dtos.HistoricoDto;
import com.avaliacao.avaliacao.dtos.RastreioDto;
import com.avaliacao.avaliacao.services.RastreioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/rastreio")
@CrossOrigin(origins = "/**")
@AllArgsConstructor
public class RastreioController {
  private final RastreioService rastreioService;

  @GetMapping("/{codigo}")
  public ResponseEntity<RastreioDto> findRastreioByCodigo(@PathVariable String codigo) {
    final RastreioDto dto = toDto(rastreioService.findRastreioByCodigo(codigo));
    return ResponseEntity.ok().body(dto);
  }

  private RastreioDto toDto(Rastreio rastreio) {
    return RastreioDto
        .builder()
        .codigo(rastreio.getCodigo())
        .situacao(rastreio.getSituacao())
        .historicos(
            rastreio.getHistoricos().stream().map(
                historico ->
                    HistoricoDto
                        .builder()
                        .descricao(historico.getDescricao())
                        .data(historico.getHorario())
                        .build()
            ).collect(Collectors.toList())
        )
        .build();
  }
}
