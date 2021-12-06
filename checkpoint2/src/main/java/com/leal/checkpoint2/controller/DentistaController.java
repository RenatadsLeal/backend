package com.leal.checkpoint2.controller;

import com.leal.checkpoint2.persistence.entity.DentistaEntity;
import com.leal.checkpoint2.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dentista")
public class DentistaController {

    @Autowired
    private DentistaService service;

    @PostMapping
    public DentistaEntity postDentista(@RequestBody DentistaEntity dentista) {
        return service.insert(dentista);
    }

    @GetMapping
    public List<DentistaEntity> getDentista() {
        return service.selectAll();
    }

    @PutMapping("{id}/{email}")
    public ResponseEntity<DentistaEntity> putDentista(@PathVariable Integer id, @PathVariable String email) {
        DentistaEntity dentista = service.update(id, email);
        if(dentista == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(dentista);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDentista(@PathVariable Integer id) {
        String resultado = service.delete(id);
        if(resultado == null) {
            return ResponseEntity.badRequest().body(String.format("O id %s não foi encontrado.", id));
        }
        return ResponseEntity.ok(resultado);
    }
}
