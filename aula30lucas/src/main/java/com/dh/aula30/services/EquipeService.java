package com.dh.aula30.services;

import com.dh.aula30.model.Equipe;
import com.dh.aula30.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository repository;

    public Equipe insert(Equipe equipe){
        return repository.save(equipe);
    }

}
