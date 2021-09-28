package com.avaliacao.avaliacao.repositories;

import com.avaliacao.avaliacao.domain.Rastreio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RastreioRepository extends JpaRepository<Rastreio, Long> {
    Optional<Rastreio> findByCodigo(String codigo);
}
