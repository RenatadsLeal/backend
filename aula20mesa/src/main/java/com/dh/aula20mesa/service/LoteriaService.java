package com.dh.aula20mesa.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class LoteriaService {
    public ArrayList<Integer> jogar(){
        List<Integer> numsSorte = new ArrayList<>();

        Random random = new Random();

        for (i=1;i<=6;i++){
            numsSorte.add(random.nextInt(60+1))
        }


    }

}
