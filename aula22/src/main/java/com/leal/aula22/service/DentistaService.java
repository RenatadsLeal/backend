package com.leal.aula22.service;

import com.leal.aula22.dao.DentistaDAO;
import com.leal.aula22.domain.Dentista;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DentistaService {
    private static Map<Integer, Dentista> flyweight = new HashMap<>();

    public Map<Integer, Dentista> buscarDentistas() {
        return flyweight;
    }

    public Dentista buscarPorId(Integer id) {
        return flyweight.get(id);
    }

    public Dentista registrarDentista(DentistaDAO dao) {
        Integer id = flyweight.size() +1;

        Dentista dentista = new Dentista(dao.getNome(), dao.getSobrenome(), dao.getMatricula());

        flyweight.put(id, dentista);

        return flyweight.get(id);
    }

    public Dentista editarDentista(DentistaDAO dao) {
        Dentista dentista = flyweight.get(dao.getId());

        dentista.setNome(dao.getNome());
        dentista.setSobrenome(dao.getSobrenome());

        return dentista;
    }

    public String deletarDentista(Integer id) {
        flyweight.remove(id);

        return "Dentista deletado!";
    }
}
