package com.leal.aula18.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {
    private String nome;
    private Integer idade;
    private String especialidade;

    public Professor(String nome, Integer idade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
    }
}
