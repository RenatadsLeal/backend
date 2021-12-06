package com.dh.aula19.services;

import com.dh.aula19.domain.Paciente;

import java.util.List;

public interface IPaciente {
    List<Paciente> listarPacientes();
    Paciente pacientePorEmail(String email);
}
