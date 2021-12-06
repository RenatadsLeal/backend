package com.leal.checkpoint2.persistence.repository;

import com.leal.checkpoint2.persistence.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Integer> {
}
