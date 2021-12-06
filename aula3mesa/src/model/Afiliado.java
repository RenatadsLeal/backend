package model;

public class Afiliado extends Vendedor{

    public Afiliado(String nome) {
        super(nome);
    }

    @Override
    protected void calcularPontos() {
        Integer pontos = super.getVendas() * 15;
        super.setPontos(pontos);
    }

    @Override
    protected void recategorizar() {
        if(super.getPontos() < 20) {
            super.setCategoria(Categoria.NOVATO);
        }
        if(super.getPontos() <= 30) {
            super.setCategoria(Categoria.APRENDIZ);
        }
        if(super.getPontos() <= 40) {
            super.setCategoria(Categoria.BOM);
        }
        if(super.getPontos() > 40) {
            super.setCategoria(Categoria.MESTRE);
        }
    }
}
