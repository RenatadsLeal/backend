package com.leal.aula22.controller;

import com.leal.aula22.dao.DentistaDAO;
import com.leal.aula22.domain.Dentista;
import com.leal.aula22.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("dentista")
public class DentistaController {

    @Autowired
    private DentistaService service;

    @GetMapping
    public Map<Integer, Dentista> getDentistas(){
        return service.buscarDentistas();
    }

    @GetMapping("buscarid/{id}")
    public Dentista getDentistaById(@PathVariable("id") Integer id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Dentista postDentista(@RequestBody DentistaDAO dao){
        return service.registrarDentista(dao);
    }

    @PutMapping
    public Dentista putDentista(@RequestBody DentistaDAO dao){
        return service.editarDentista(dao);
    }

    @DeleteMapping
    public String deleteDentista(@RequestBody Integer id){
        return service.deletarDentista(id);
    }
}
