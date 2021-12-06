package com.dh.aula30.services;

import com.dh.aula30.dao.JogadorDAO;
import com.dh.aula30.model.Equipe;
import com.dh.aula30.model.Jogador;
import com.dh.aula30.model.Treinador;
import com.dh.aula30.repository.EquipeRepository;
import com.dh.aula30.repository.JogadorRepository;
import com.dh.aula30.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private TreinadorRepository treinadorRepository;

    @Autowired
    private EquipeRepository equipeRepository;

    public Jogador insert(JogadorDAO dao) {
        Treinador treinador = treinadorRepository.getById(dao.getTreinadorId());
        Equipe equipe = equipeRepository.getById(dao.getEquipeId());

        Jogador jogador = new Jogador(dao.getNome(), dao.getPosicao(), dao.getNumero(), equipe, treinador);

        return jogadorRepository.save(jogador);
    }

    public List<String> buscarPorTreinador(Integer idTreinador) {
        Treinador treinador = treinadorRepository.getById(idTreinador);

        return jogadorRepository.findAllJogadoresPorTreinador(treinador);

    }

}
