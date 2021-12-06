package com.dh.aula23.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Consulta {
    private Paciente paciente;
    private Dentista dentista;
    private Date dataDaConsulta;

    public Consulta(Paciente paciente, Dentista dentista, Date dataDaConsulta) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.dataDaConsulta = dataDaConsulta;
    }
}
