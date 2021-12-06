package com.dh.aula19.controller;

import com.dh.aula19.domain.Dentista;
import com.dh.aula19.services.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dentista")
public class DentistaRestController {

    @Autowired
    private DentistaService service;

    @GetMapping("listar")
    public List<Dentista> dentistas() {
        return service.listarDentistas();
    }

    @GetMapping("/id/{id}")
    public Dentista dentistaPorId(@PathVariable Integer id) {
        return service.dentistaPorId(id);
    }
}
