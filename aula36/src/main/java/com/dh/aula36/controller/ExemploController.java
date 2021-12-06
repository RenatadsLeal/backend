package com.dh.aula36.controller;

import com.dh.aula36.exception.BadRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @GetMapping("/{num}")
    public String validarCalculo(@PathVariable String num) throws BadRequestException {

        try {
            Integer i = Integer.valueOf(num) * 2;
            return "É um número";
        } catch (Exception e) {
            throw new BadRequestException("Não é um número");

        }

    }
}
