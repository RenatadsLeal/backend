package model;

public class Estagiario extends Vendedor{

    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    protected void calcularPontos() {
        Integer pontos = super.getVendas() * 5;
        super.setPontos(pontos);
    }

    @Override
    protected void recategorizar() {
        if(super.getPontos() < 50) {
            super.setCategoria(Categoria.ESTAGIARIO_NOVATO);
        }
        if(super.getPontos() >= 50) {
            super.setCategoria(Categoria.ESTAGIARIO_EXPERIENTE);
        }
    }
}
