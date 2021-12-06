package com.dh.aula19.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;

    public Endereco(String rua, String numero, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
}
