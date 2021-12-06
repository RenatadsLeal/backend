package com.dh.aula30.repository;

import com.dh.aula30.model.Treinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinadorRepository extends JpaRepository<Treinador, Integer> {
}
