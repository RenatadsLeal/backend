package com.digitalhouse.aula6;

import com.digitalhouse.aula6.server.ISerie;
import com.digitalhouse.aula6.server.impl.SerieNaoHabilitadaException;
import com.digitalhouse.aula6.server.impl.SerieProxy;

public class Main {

    public static void main(String[] args) throws SerieNaoHabilitadaException {

        String[] series = {"thewitcher", "midnightmass", "dark", "lacasadepapel", "breakingbad", "squidgame", "kingdom", "lupin"};

        ISerie service = new SerieProxy();

        for(String serie: series){
            service.getSerie(serie);
        }
    }
}
