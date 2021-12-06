package com.digitalhouse.aula2.model;

public class FuncionarioEfetivo extends Funcionario{

    private Double salariobase;
    private Integer desconto = 14;
    private Integer beneficio = 5;

    public FuncionarioEfetivo(String nome, String sobrenome, String contaBancaria, Tipo tipo, Double salariobase) {
        super(nome, sobrenome, contaBancaria, tipo);
        this.salariobase = salariobase;
    }

    public Double getSalariobase() {
        return salariobase;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public Integer getBeneficio() {
        return beneficio;
    }

    public void setSalariobase(Double salariobase) {
        this.salariobase = salariobase;
    }
}
