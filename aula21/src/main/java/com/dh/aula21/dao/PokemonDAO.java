package com.dh.aula21.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonDAO {
    private Integer id;
    private String nome;
    private String tipo;
    private Integer pokedex;
    private String[] habilidades;
}
