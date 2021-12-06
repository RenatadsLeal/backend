package com.dh.aula33.controller;

import com.dh.aula33.dao.PartidaDAO;
import com.dh.aula33.model.Partida;
import com.dh.aula33.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partida")
public class PartidaController {

    @Autowired
    private PartidaService service;

    @PostMapping
    private Partida postPartida(@RequestBody PartidaDAO dao) {
        return service.createPartida(dao);
    }
}
