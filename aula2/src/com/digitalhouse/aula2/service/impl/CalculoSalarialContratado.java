package com.digitalhouse.aula2.service.impl;

import com.digitalhouse.aula2.model.Funcionario;
import com.digitalhouse.aula2.model.FuncionarioContratado;
import com.digitalhouse.aula2.service.PagamentoService;

public class CalculoSalarialContratado extends PagamentoService {
    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioContratado contratado = ((FuncionarioContratado) funcionario);

        return contratado.getValorHora() * contratado.getNumHoras();
    }
}
