package com.dh.aula25.controller;

import com.dh.aula25.dao.ConsultaDAO;
import com.dh.aula25.model.Consulta;
import com.dh.aula25.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ConsultaController implements IController<Consulta, ConsultaDAO>{

    @Autowired
    private ConsultaService service;

//    @GetMapping
//    public ResponseEntity<Map<Integer, Consulta>> getConsultas() {
//        return ResponseEntity.status(HttpStatus.OK).body(service.buscarConsultas());
//    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteConsulta(@PathVariable Integer id) {
//        service.deletarConsulta(id);
//
//        return  ResponseEntity.ok("Deletado com sucesso");
//    }

//    @PostMapping
//    public ResponseEntity<Consulta> postConsulta(@RequestBody ConsultaDAO dao) {
//        Consulta consulta = service.criarConsulta(dao);
//
//        if(consulta == null) {
//            return ResponseEntity.badRequest().build();
//        }
//
//        return ResponseEntity.ok(consulta);
//    }

//    @PutMapping
//    public ResponseEntity<Consulta> putConsulta(@RequestBody ConsultaDAO dao) {
//        return ResponseEntity.status(200).body(service.editarConsulta(dao));
//    }

    @Override
    public ResponseEntity<Map<Integer, Consulta>> getMethod() {
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarConsultas());
    }

    @Override
    public ResponseEntity<String> deleteMethoda(Integer id) {
        service.deletarConsulta(id);

        return  ResponseEntity.ok("Deletado com sucesso");
    }

    @Override
    public ResponseEntity<Consulta> postMethod(ConsultaDAO dao) {
        Consulta consulta = service.criarConsulta(dao);

        if(consulta == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(consulta);
    }

    @Override
    public ResponseEntity<Consulta> putMethod(ConsultaDAO dao) {
        return ResponseEntity.status(200).body(service.editarConsulta(dao));
    }
}
