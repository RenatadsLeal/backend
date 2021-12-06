package com.dh.aula21.controller;

import com.dh.aula21.dao.PokemonDAO;
import com.dh.aula21.domain.Pokemon;
import com.dh.aula21.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public Map<Integer, Pokemon> getPokemons(){
        return service.buscarPokemon();
    }

    @GetMapping("buscarid/{id}")
    public Pokemon getPokemonById(@PathVariable("id") Integer id) {
        return service.buscarPorId(id);
    }

    //Or
    @GetMapping("buscarid")
    public Pokemon getPokemonByIdBody(@RequestBody PokemonDAO dao){
        return service.buscarPorId(dao.getId());
    }

    @PostMapping
    public Pokemon postPokemon(@RequestBody PokemonDAO dao){
        return service.criarPokemon(dao);
    }

    @PutMapping
    public Pokemon putPokemon(@RequestBody PokemonDAO dao){
        return service.editarPokemon(dao);
    }

    @DeleteMapping
    public String deletePokemon(@RequestBody PokemonDAO dao){
        return service.deletarPokemon(dao);
    }

}
