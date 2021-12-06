package com.dh.aula25.controller;

import com.dh.aula25.dao.ConsultaDAO;
import com.dh.aula25.model.Consulta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public interface IController <T, U>{

    @GetMapping
    public ResponseEntity<Map<Integer, T>> getMethod();

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMethoda(@PathVariable Integer id);

    @PostMapping
    public ResponseEntity<T> postMethod(@RequestBody U dao);

    @PutMapping
    public ResponseEntity<T> putMethod(@RequestBody U dao);

}
