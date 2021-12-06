import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTest {
    
    @Test
    void PerimetroQuadrado(){
        Quadrado quadrado = new Quadrado(5.0);
        Double perimetro = quadrado.calcularPerimetro();

        assertEquals(20.0, perimetro);
    }

    @Test
    void PerimetroCirculo(){
        DecimalFormat df = new DecimalFormat("#.#");
        Circulo circulo = new Circulo(5.0);
        Double perimetro = circulo.calcularPerimetro();
        perimetro = Double.valueOf(df.format(perimetro));

        assertEquals(31.4, perimetro);
    }
}
