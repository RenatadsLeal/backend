package model;

public class Funcionario extends Vendedor{

    private Integer anosEmpresa = 0;
    private Integer afiliados = 0;

    public Funcionario(String nome) {
        super(nome);
    }

    public Integer getAnosEmpresa() {
        return anosEmpresa;
    }

    public void setAnosEmpresa(Integer anosEmpresa) {
        this.anosEmpresa = anosEmpresa;
    }

    public Integer getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Integer afiliados) {
        this.afiliados = afiliados;
    }

    @Override
    protected void calcularPontos() {
        Integer pontosVendas = super.getVendas() * 5;
        Integer pontosAfiliados = this.afiliados * 10;
        Integer pontosAnosEmpresa = this.anosEmpresa * 5;
        Integer pontos = pontosVendas + pontosAfiliados + pontosAnosEmpresa;
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

    public Afiliado obterAfiliado(String nome) {
        System.out.println("Você obteve um afiliado!");
        return new Afiliado(nome);
    }
}
