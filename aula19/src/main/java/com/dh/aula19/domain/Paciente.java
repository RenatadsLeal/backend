package com.dh.aula19.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Paciente {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
    private Date dataCadastro;
    private Endereco endereco;
    private Dentista dentista;

    public Paciente(Integer id, String nome, String sobrenome, String email, String cpf, Date dataCadastro, Endereco endereco, Dentista dentista) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.dentista = dentista;
    }
}
