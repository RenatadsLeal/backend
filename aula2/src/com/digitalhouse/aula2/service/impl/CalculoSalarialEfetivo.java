package com.digitalhouse.aula2.service.impl;

import com.digitalhouse.aula2.model.Funcionario;
import com.digitalhouse.aula2.model.FuncionarioEfetivo;
import com.digitalhouse.aula2.service.PagamentoService;

public class CalculoSalarialEfetivo extends PagamentoService {
    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioEfetivo efetivo = ((FuncionarioEfetivo) funcionario);
        Double salario = efetivo.getSalariobase();
        salario = salario - (efetivo.getSalariobase() * efetivo.getDesconto()/100);
        salario += (salario * efetivo.getBeneficio()/100);

        return salario;
    }
}
