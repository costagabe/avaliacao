package com.avaliacao.avaliacao.services.impl;

import com.avaliacao.avaliacao.domain.Rastreio;
import com.avaliacao.avaliacao.exceptions.ObjectNotFoundException;
import com.avaliacao.avaliacao.repositories.RastreioRepository;
import com.avaliacao.avaliacao.services.RastreioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RastreioServiceImpl implements RastreioService {
  private final RastreioRepository rastreioRepository;

  @Override
  public Rastreio findRastreioByCodigo(String codigo) {
    return rastreioRepository.findByCodigo(codigo)
        .orElseThrow(() -> new ObjectNotFoundException("Código não encontrado."));
  }
}
