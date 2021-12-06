package com.digitalhouse.aula6.server.impl;

import com.digitalhouse.aula6.server.ISerie;

public class SerieService implements ISerie {

    @Override
    public String getSerie(String nome) {
        String link = "www." + nome + ".com";
        System.out.println(link);
        return link;
    }
}
