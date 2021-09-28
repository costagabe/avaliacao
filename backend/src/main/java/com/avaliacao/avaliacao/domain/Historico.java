package com.avaliacao.avaliacao.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Historico {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name="rastreio_id", nullable=false)
    private Rastreio rastreio;

    @Column(name = "horario", nullable = false)
    private LocalDateTime horario;
}
