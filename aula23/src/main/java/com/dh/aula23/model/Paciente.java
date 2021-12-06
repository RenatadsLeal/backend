package com.dh.aula23.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente {
    private String nome;
    private String sobrenome;
    private String email;

    public Paciente(String nome, String sobrenome, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }
}
