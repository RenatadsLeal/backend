package com.leal.checkpoint2.controller;

import com.leal.checkpoint2.persistence.entity.PacienteEntity;
import com.leal.checkpoint2.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    public ResponseEntity<PacienteEntity> postPaciente(@RequestBody PacienteEntity paciente) {
        return ResponseEntity.ok(service.insert(paciente));
    }

    @GetMapping
    public ResponseEntity<List<PacienteEntity>> getPaciente() {
        return ResponseEntity.ok(service.selectAll());
    }

    @PutMapping("{id}/{email}")
    public ResponseEntity<PacienteEntity> putPaciente(@PathVariable Integer id, @PathVariable String email) {
        PacienteEntity paciente = service.update(id, email);
        if(paciente == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(paciente);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletePaciente(@PathVariable Integer id) {
        String resultado = service.delete(id);
        if(resultado == null) {
            return ResponseEntity.badRequest().body(String.format("O id %s não foi encontrado.", id));
        }
        return ResponseEntity.ok(resultado);
    }
}
