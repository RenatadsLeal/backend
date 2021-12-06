package com.digitalhouse.aula6.server.impl;

import com.digitalhouse.aula6.server.ISerie;

public class SerieProxy implements ISerie {

    private Integer quantidadeViews = 0;
    private SerieService serieService = new SerieService();

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException{
        quantidadeViews++;
        if(quantidadeViews <= 5){
            return serieService.getSerie(nome);
        } else {
             throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas!");
        }
    }
}
