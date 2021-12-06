package com.dh.aula29pg.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "JOGADORES")
public class JogadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String posicao;
    private Integer numero;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_id")
    private TimeEntity timeEntity;

}

