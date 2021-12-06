package dao;

import model.Dentista;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServidorDentistaTest {
    Dentista dentista1;
    Dentista dentista2;
    Dentista dentista3;
    ServidorDentista servidorDentista;

    @BeforeEach
    void doBefore() {
        PropertyConfigurator.configure("log4j.properties");
        servidorDentista = new ServidorDentista();
        servidorDentista.create();
        dentista1 = new Dentista("35648LM", "Carol", "Hakamada");
        dentista2 = new Dentista("33348LN", "Ailla", "Freire");
        dentista3 = new Dentista("35908AT", "Helena", "Perdigueiro");

        servidorDentista.insert(dentista1);
        servidorDentista.insert(dentista2);
        servidorDentista.insert(dentista3);
    }

    @Test
    void selectAll() {
        ArrayList<String> selectAllDentistas = servidorDentista.selectAll();
        ArrayList<String> dentistas = new ArrayList<>();

        String dentista1Info = String.format("\n--------------------\n%s \n%s \n%s %s \n--------------------",
                dentista1.getId(),
                dentista1.getNumeroMatricula(),
                dentista1.getNome(),
                dentista1.getSobrenome());
        String dentista2Info = String.format("\n--------------------\n%s \n%s \n%s %s \n--------------------",
                dentista2.getId(),
                dentista2.getNumeroMatricula(),
                dentista2.getNome(),
                dentista2.getSobrenome());
        String dentista3Info = String.format("\n--------------------\n%s \n%s \n%s %s \n--------------------",
                dentista3.getId(),
                dentista3.getNumeroMatricula(),
                dentista3.getNome(),
                dentista3.getSobrenome());

        dentistas.add(dentista1Info);
        dentistas.add(dentista2Info);
        dentistas.add(dentista3Info);

        assertEquals(dentistas, selectAllDentistas);
    }
}