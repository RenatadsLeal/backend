package com.dh.aula27.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TABELA_MOVIMENTOS")
@Getter @Setter
public class MovimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "desc")
    private String descricao;

    private Double quantidade;
}
