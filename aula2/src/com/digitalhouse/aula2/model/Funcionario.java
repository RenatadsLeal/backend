package com.digitalhouse.aula2.model;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String contaBancaria;
    private Tipo tipo;
    private Double salarioFinal;

    public Funcionario(String nome, String sobrenome, String contaBancaria, Tipo tipo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contaBancaria = contaBancaria;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
}
