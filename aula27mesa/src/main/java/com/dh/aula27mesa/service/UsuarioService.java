package com.dh.aula27mesa.service;

import com.dh.aula27mesa.persistence.entities.UsuarioEntity;
import com.dh.aula27mesa.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioEntity> buscarTodos() {
        return repository.findAll();
    }

    public String salvar(UsuarioEntity usuario) {
        repository.save(usuario);
        return "Salvo com sucesso!";
    }
}
