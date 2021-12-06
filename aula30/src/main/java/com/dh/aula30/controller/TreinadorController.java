package com.dh.aula30.controller;

import com.dh.aula30.model.Treinador;
import com.dh.aula30.services.TreinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("treinador")
public class TreinadorController {

    @Autowired
    private TreinadorService service;

    @PostMapping
    public Treinador postTreinador(@RequestBody Treinador treinador) {
        return service.inset(treinador);
    }
}
