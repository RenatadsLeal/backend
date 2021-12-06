package com.dh.aula28.controller;

import com.dh.aula28.persistence.entities.ProdutoEntity;
import com.dh.aula28.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoEntity>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<ProdutoEntity> salvar(@RequestBody ProdutoEntity produtoEntity) {
        return ResponseEntity.ok(service.salvar(produtoEntity));
    }

    @PutMapping("{id}/{quantidade}")
    public ResponseEntity<ProdutoEntity> subtrairQuantidade(@PathVariable Integer id, @PathVariable Integer quantidade) {
        return ResponseEntity.ok(service.subtrair(id, quantidade));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.ok("Produto deletado com sucesso!");
    }
}
