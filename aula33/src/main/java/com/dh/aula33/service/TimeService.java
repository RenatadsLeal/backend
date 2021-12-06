package com.dh.aula33.service;

import com.dh.aula33.model.Time;
import com.dh.aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    @Autowired
    private TimeRepository repository;

    public Time createTime(Time time) {
        return repository.save(time);
    }
}
