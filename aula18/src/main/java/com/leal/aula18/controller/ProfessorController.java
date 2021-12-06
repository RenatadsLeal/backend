package com.leal.aula18.controller;

import com.leal.aula18.domain.Professor;
import com.leal.aula18.service.ProfessorServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("prof")
public class ProfessorController {

    @Autowired
    private ProfessorServer server;

    @GetMapping("/lista")
    public List<Professor> buscarProfessores(){
        return server.listarProfessores();
    }
}
