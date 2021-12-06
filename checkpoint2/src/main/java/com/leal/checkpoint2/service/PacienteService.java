package com.leal.checkpoint2.service;

import com.leal.checkpoint2.persistence.entity.PacienteEntity;
import com.leal.checkpoint2.persistence.repository.PacienteRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    private static final Logger logger = Logger.getLogger(PacienteService.class);

    public PacienteEntity insert(PacienteEntity paciente) {
        logger.info("Paciente inserido");
        return pacienteRepository.save(paciente);
    }

    public List<PacienteEntity> selectAll() {
        return pacienteRepository.findAll();
    }

    public PacienteEntity update(Integer id, String email) {
        if(pacienteRepository.existsById(id)) {
            Optional<PacienteEntity> paciente = pacienteRepository.findById(id);
            paciente.get().setEmail(email);
            logger.info(String.format("O paciente com id %s foi editado.", id));
            return insert(paciente.get());
        }
        return null;
    }

    public String delete(Integer id) {
        if(pacienteRepository.existsById(id)) {
            logger.warn(String.format("O paciente com id %s foi deletado.", id));
            pacienteRepository.deleteById(id);
            return ("O paciente foi deletado com sucesso!");
        }
        return null;
    }
}
