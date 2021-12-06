package com.dh.aula19.services;

import com.dh.aula19.domain.Dentista;

import java.util.List;

public interface IDentista {
    List<Dentista> listarDentistas();
    Dentista dentistaPorId(Integer id);
}
