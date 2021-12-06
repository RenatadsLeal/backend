package com.dh.aula26.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Filme {
    private String nome;
    private String classificacao;
    private String genero;
    private String distribuidora;

    public Filme(String nome, String classificacao, String genero, String distribuidora) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.genero = genero;
        this.distribuidora = distribuidora;
    }
}
