package com.dh.aula29pg.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "TIMES")
public class TimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String cidade;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jogadores")
    private List<JogadorEntity> jogadores;
}