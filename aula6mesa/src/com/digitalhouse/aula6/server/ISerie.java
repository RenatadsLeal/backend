package com.digitalhouse.aula6.server;

import com.digitalhouse.aula6.server.impl.SerieNaoHabilitadaException;

public interface ISerie {
    String getSerie(String nome) throws SerieNaoHabilitadaException;
}
