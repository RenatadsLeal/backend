package com.dh.aula30.services;

import com.dh.aula30.model.Treinador;
import com.dh.aula30.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreinadorService {

    @Autowired
    private TreinadorRepository repository;

    public Treinador inset(Treinador treinador) {
        return repository.save(treinador);
    }
}
