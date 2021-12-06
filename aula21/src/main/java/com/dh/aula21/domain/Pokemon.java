package com.dh.aula21.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pokemon {
    private String nome;
    private String tipo;
    private Integer pokedex;
    private String[] habilidades;

    public Pokemon(String nome, String tipo, Integer pokedex, String[] habilidades) {
        this.nome = nome;
        this.tipo = tipo;
        this.pokedex = pokedex;
        this.habilidades = habilidades;
    }
}
