package com.dh.aula27mesa.persistence.repository;

import com.dh.aula27mesa.persistence.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
