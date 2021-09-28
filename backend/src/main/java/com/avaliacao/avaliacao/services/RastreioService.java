package com.avaliacao.avaliacao.services;

import com.avaliacao.avaliacao.domain.Rastreio;

public interface RastreioService {
  Rastreio findRastreioByCodigo(String codigo);
}
