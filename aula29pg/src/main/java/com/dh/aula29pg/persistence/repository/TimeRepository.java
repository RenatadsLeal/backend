package com.dh.aula29pg.persistence.repository;

import com.dh.aula29pg.persistence.entities.TimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<TimeEntity, Integer> {
}
