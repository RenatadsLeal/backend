package com.dh.aula33.service;

import com.dh.aula33.dao.PartidaDAO;
import com.dh.aula33.enums.Status;
import com.dh.aula33.model.Partida;
import com.dh.aula33.model.Time;
import com.dh.aula33.repository.PartidaRepository;
import com.dh.aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private TimeRepository timeRepository;

    public Partida createPartida(PartidaDAO dao) {
        Partida partida = new Partida();
        Optional<Time> timeLocal = timeRepository.findById(dao.getIdTimeLocal());
        Optional<Time> timeVisitante = timeRepository.findById(dao.getIdTimeVisitante());

        partida.setStatus(Status.valueOf(dao.getStatus()));
        partida.setResultado(dao.getResultado());


        partida.setTimeLocal(timeLocal.get());
        partida.setTimeVisitante(timeVisitante.get());

        return partidaRepository.save(partida);
    }
}
