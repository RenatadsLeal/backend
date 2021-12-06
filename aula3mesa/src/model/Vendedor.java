package model;

public abstract class Vendedor {
    private String nome;
    private Integer vendas = 0;
    private Integer pontos = 0;
    private Categoria categoria;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVendas() {
        return vendas;
    }

    public void setVendas(Integer vendas) {
        this.vendas = vendas;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void vender() {
        this.vendas++;
        System.out.println("Você fez uma venda!");
    }

    protected abstract void calcularPontos();

    protected abstract void recategorizar();

    public void mostrarcategoria() {
        calcularPontos();
        recategorizar();
        System.out.println(String.format("%s fez %s pontos e categoriza como %s", this.nome, this.pontos,
                this.categoria));
    }
}
