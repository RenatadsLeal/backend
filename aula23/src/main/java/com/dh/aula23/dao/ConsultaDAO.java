package com.dh.aula23.dao;

import com.dh.aula23.model.Dentista;
import com.dh.aula23.model.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class ConsultaDAO {
    private Integer id;
    private Paciente paciente;
    private Dentista dentista;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date dataDaConsulta;
}
