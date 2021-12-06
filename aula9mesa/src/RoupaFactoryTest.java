import model.Roupa;
import model.Tamanho;
import model.Tipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoupaFactoryTest {
    List<Roupa> lista = new ArrayList<>();
    RoupaFactory factory = new RoupaFactory();

    @BeforeEach
    void doBefore(){
        lista.add(factory.buscarRoupa(Tamanho.M, Tipo.CAMISA, true, true));
        lista.add(factory.buscarRoupa(Tamanho.P, Tipo.CAMISA, false, true));
        lista.add(factory.buscarRoupa(Tamanho.M, Tipo.CALCA, true, false));
        lista.add(factory.buscarRoupa(Tamanho.G, Tipo.CALCA, true, false));
        lista.add(factory.buscarRoupa(Tamanho.M, Tipo.CAMISA, true, true));
        lista.add(factory.buscarRoupa(Tamanho.G, Tipo.CALCA, true, false));
    }

    @Test
    void getRoupa() {
        assertEquals(Tamanho.M, lista.get(0).getTamanho());
    }

    @Test
    void getContador() {
        assertEquals(4, RoupaFactory.getContador());
    }

}
