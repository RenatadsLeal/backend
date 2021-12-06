package com.digitalhouse.model;

public class Arvore {
    private Double altura;
    private Double largura;
    private String cor;

    public Arvore(Double altura, Double largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                '}';
    }
}
