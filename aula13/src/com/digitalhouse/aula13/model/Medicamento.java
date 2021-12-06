package com.digitalhouse.aula13.model;

public class Medicamento {
    private Integer id;
    private String codigoNumerico;
    private String nome;
    private String laboratorio;
    private Integer quantidade;
    private Double preco;

    public Medicamento(Integer id, String codigoNumerico, String nome, String laboratorio, Integer quantidade, Double preco) {
        this.id = id;
        this.codigoNumerico = codigoNumerico;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoddigoNumerico() {
        return codigoNumerico;
    }

    public void setCoddigoNumerico(String coddigoNumerico) {
        this.codigoNumerico = coddigoNumerico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
