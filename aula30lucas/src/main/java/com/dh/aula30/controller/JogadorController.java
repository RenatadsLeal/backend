package com.dh.aula30.controller;


import com.dh.aula30.dao.JogadorDAO;
import com.dh.aula30.model.Jogador;
import com.dh.aula30.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jogador")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @PostMapping
    public Jogador postJogador(@RequestBody JogadorDAO dao){
        return service.insert(dao);
    }

    @GetMapping("/{id}")
    public List<String> getJogadorPorTreinador(@PathVariable Integer id){
        return service.buscarPorTreinador(id);
    }
}
