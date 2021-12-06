package com.digitalhouse.aula5.server.impl;

import com.digitalhouse.aula5.model.Pessoa;
import com.digitalhouse.aula5.server.IVacinacao;

import java.util.Date;

public class VacinacaoProxy implements IVacinacao {

    private VacinacaoService vacinacaoService;

    public VacinacaoProxy(VacinacaoService vacinacaoService) {
        this.vacinacaoService = vacinacaoService;
    }

    @Override
    public void vacinar(Pessoa pessoa) {

        Date dataAtual = new Date();

        if(pessoa.getDataVacina().before(dataAtual) || pessoa.getDataVacina().equals(dataAtual)){
            vacinacaoService.vacinar(pessoa);
        }else{
            System.out.println("Ainda não chegou seu momento de se vacinar");
        }

    }
}
