package com.dh.aula30.controller;

import com.dh.aula30.model.Equipe;
import com.dh.aula30.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("equipe")
public class EquipeController {

    @Autowired
    private EquipeService service;

    @PostMapping
    public Equipe postEquipe(@RequestBody Equipe equipe){
        return service.insert(equipe);
    }

}
