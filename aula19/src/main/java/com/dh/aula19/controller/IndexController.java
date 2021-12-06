package com.dh.aula19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("index/{nome}/{sobrenome}/{matricula}")
    public String index(@PathVariable String nome, @PathVariable String sobrenome, @PathVariable String matricula, Model model){
        model.addAttribute("nome", nome);
        model.addAttribute("sobrenome", sobrenome);
        model.addAttribute("matricula", matricula);

        return "index";
    }
}
