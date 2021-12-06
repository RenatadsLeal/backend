package com.dh.aula29pg.persistence.repository;

import com.dh.aula29pg.persistence.entities.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorEntity, Integer> {
}
