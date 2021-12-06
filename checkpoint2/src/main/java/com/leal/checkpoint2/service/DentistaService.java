package com.leal.checkpoint2.service;

import com.leal.checkpoint2.persistence.entity.DentistaEntity;
import com.leal.checkpoint2.persistence.repository.DentistaRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistaService {

    @Autowired
    private DentistaRepository dentistaRepository;

    private static final Logger logger = Logger.getLogger(DentistaService.class);

    public DentistaEntity insert(DentistaEntity dentista) {
        logger.info("Dentista inserido");
        return dentistaRepository.save(dentista);
    }

    public List<DentistaEntity> selectAll() {
        return dentistaRepository.findAll();
    }

    public DentistaEntity update(Integer id, String email) {
        if(dentistaRepository.existsById(id)) {
            Optional<DentistaEntity> dentista = dentistaRepository.findById(id);
            dentista.get().setEmail(email);
            logger.info(String.format("O dentista com id %s foi editado.", id));
            return insert(dentista.get());
        }
        return null;
    }

    public String delete(Integer id) {
        if(dentistaRepository.existsById(id)) {
            dentistaRepository.deleteById(id);
            logger.warn(String.format("O dentista com id %s foi deletado.", id));
            return "Dentista deletado com sucesso!";
        }
        return null;
    }
}
