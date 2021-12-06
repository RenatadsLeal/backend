package com.digitalhouse.aula5.server.impl;

import com.digitalhouse.aula5.model.Pessoa;
import com.digitalhouse.aula5.server.IVacinacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VacinacaoService implements IVacinacao {
    @Override
    public void vacinar(Pessoa pessoa) {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String dataAtualFormatada = formato.format(new Date());

        System.out.println(pessoa.getNome() + " portador do RG: " + pessoa.getRg() + " tomou a vacina " +
                pessoa.getVacina() + " no dia " + dataAtualFormatada);
    }
}
