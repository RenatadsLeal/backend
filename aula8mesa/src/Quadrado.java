public class Quadrado extends Figura{
    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = this.lado * 4;
        return perimetro;
    }
}
