package model;

public class Roupa {
    private Tamanho tamanho;
    private Tipo tipo;
    private Boolean eNova;
    private Boolean eImportada;

    public Roupa(Tamanho tamanho, Tipo tipo, Boolean eNova, Boolean eImportada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNova = eNova;
        this.eImportada = eImportada;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Boolean geteNova() {
        return eNova;
    }

    public void seteNova(Boolean eNova) {
        this.eNova = eNova;
    }

    public Boolean geteImportada() {
        return eImportada;
    }

    public void seteImportada(Boolean eImportada) {
        this.eImportada = eImportada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho=" + tamanho +
                ", tipo=" + tipo +
                ", eNova=" + eNova +
                ", eImportada=" + eImportada +
                '}';
    }
}
