package com.dh.aula30.repository;

import com.dh.aula30.model.Jogador;
import com.dh.aula30.model.Treinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {

    @Query("select j.nome from Jogador j where j.treinador = ?1")
    List<String> findAllJogadoresPorTreinador(Treinador treinador);

}
