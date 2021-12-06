package com.leal.aula18.service;

import com.leal.aula18.domain.Professor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorServer implements IProfessor{
    @Override
    public List<Professor> listarProfessores() {
        List<Professor> lista = new ArrayList<>();

        lista.add(new Professor("Roberto", 32, "Matemática"));
        lista.add(new Professor("Júlia", 28, "História"));
        lista.add(new Professor("Robson", 45, "Física"));

        return lista;
    }
}
