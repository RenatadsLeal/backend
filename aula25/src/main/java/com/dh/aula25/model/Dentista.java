package com.dh.aula25.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dentista {
    private String nome;
    private String email;
    private String credencial;

    public Dentista(String nome, String email, String credencial) {
        this.nome = nome;
        this.email = email;
        this.credencial = credencial;
    }
}
