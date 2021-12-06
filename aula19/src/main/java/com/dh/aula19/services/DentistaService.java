package com.dh.aula19.services;

import com.dh.aula19.domain.Dentista;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DentistaService implements IDentista{
    @Override
    public List<Dentista> listarDentistas() {
        List<Dentista> lista = new ArrayList<>();
        lista.add(new Dentista(4,"Mika", "Grus", "865345HM"));
        lista.add(new Dentista(13,"Lik", "Pom", "823211HM"));
        lista.add(new Dentista(14,"Swan", "Trey", "3423345HN"));

        return lista;
    }

    @Override
    public Dentista dentistaPorId(Integer id) {
        return new Dentista(id, "Loop", "Lawson","25223323PM");
    }
}
