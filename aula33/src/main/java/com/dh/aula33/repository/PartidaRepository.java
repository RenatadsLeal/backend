package com.dh.aula33.repository;

import com.dh.aula33.model.Partida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends MongoRepository<Partida, String> {
}
