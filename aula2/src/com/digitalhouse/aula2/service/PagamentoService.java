package com.digitalhouse.aula2.service;

import com.digitalhouse.aula2.model.Funcionario;
import com.digitalhouse.aula2.model.Tipo;

import java.text.DecimalFormat;

public abstract class PagamentoService {

    public void pagar(Funcionario funcionario){
        funcionario.setSalarioFinal(calcularSalario(funcionario));
        Double salario = funcionario.getSalarioFinal();
        DecimalFormat formato = new DecimalFormat("#.##");
        salario = Double.valueOf(formato.format(salario));

        System.out.println(depositarSalario(funcionario.getContaBancaria(), salario));
        System.out.println(emitirComprovante(funcionario.getTipo()));
    }

    public String depositarSalario(String conta, Double salarioFinal){
        return "Depósito do salário " + salarioFinal + " efetuado na conta " + conta;
    }

    public String emitirComprovante(Tipo tipo){
        if(tipo == Tipo.CONTRATADO){
            return "Recibo enviado por Email";
        }else if(tipo == Tipo.EFETIVO){
            return "Recibo impresso com sucesso!";
        }

        return "Erro ao emitir o recibo";
    }

    protected abstract Double calcularSalario(Funcionario funcionario);
}
