package com.dh.aula27.service;

import com.dh.aula27.persistence.entities.MovimentoEntity;
import com.dh.aula27.persistence.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentoService {

    @Autowired
    private MovimentoRepository repository;

    public List<MovimentoEntity> obterTodos() {
        return repository.findAll();
    }

    public String save(MovimentoEntity movimento) {
        if(repository.save(movimento) != null) {
            return "Salvo com sucesso";
        }
            return null;
    }
}
