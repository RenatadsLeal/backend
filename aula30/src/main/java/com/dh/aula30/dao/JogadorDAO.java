package com.dh.aula30.dao;

public class JogadorDAO {

    private String nome;
    private String numero;
    private String posicao;
    private Integer treinadorId;
    private Integer equipeId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getTreinadorId() {
        return treinadorId;
    }

    public void setTreinadorId(Integer treinadorId) {
        this.treinadorId = treinadorId;
    }

    public Integer getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(Integer equipeId) {
        this.equipeId = equipeId;
    }
}
