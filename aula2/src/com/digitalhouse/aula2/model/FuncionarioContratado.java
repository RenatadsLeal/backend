package com.digitalhouse.aula2.model;

public class FuncionarioContratado extends Funcionario{

    private Integer numHoras;
    private Double valorHora;

    public FuncionarioContratado(String nome, String sobrenome, String contaBancaria, Tipo tipo, Integer numHoras, Double valorHora) {
        super(nome, sobrenome, contaBancaria, tipo);
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    public Integer getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(Integer numHoras) {
        this.numHoras = numHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
