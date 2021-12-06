package com.dh.aula27mesa.controller;

import com.dh.aula27mesa.persistence.entities.UsuarioEntity;
import com.dh.aula27mesa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody UsuarioEntity usuario) {
        if(service.salvar(usuario) != null) {
            return ResponseEntity.ok("Salvo com sucesso");
        }
        return ResponseEntity.badRequest().body("Não foi possível salvar");
    }
}