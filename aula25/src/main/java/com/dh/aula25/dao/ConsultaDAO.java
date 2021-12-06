package com.dh.aula25.dao;

import com.dh.aula25.model.Dentista;
import com.dh.aula25.model.Paciente;
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
