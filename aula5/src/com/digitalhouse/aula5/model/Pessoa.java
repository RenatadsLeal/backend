package com.digitalhouse.aula5.model;

import java.util.Date;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String rg;
    private String vacina;
    private Date dataVacina;

    public Pessoa(String nome, String sobrenome, String rg, String vacina, Date dataVacina) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.vacina = vacina;
        this.dataVacina = dataVacina;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public Date getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
    }
}
