import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    Pessoa pessoa;
    Pessoa pessoa1;
    Pessoa pessoa2;

    @BeforeEach
    void doBefore(){
        pessoa = new Pessoa("Renata", "Leal");
        pessoa.setIdade(LocalDate.of(1989, 5, 23));
        pessoa1 = new Pessoa("Helena", "Martinez");
        pessoa1.setIdade(LocalDate.of(1990, 11, 12));
        pessoa2 = new Pessoa("Matheus", "Affonso");
        pessoa2.setIdade(LocalDate.of(1987, 11, 12));
    }

    @Test
    void getNomeCompleto(){
        assertEquals("Renata Leal", pessoa.calcularNomeCompleto());
    }

    @Test
    void getEMaiorDeIdade(){
        assertEquals(true, pessoa.eMaiorDeIdade());
    }
}
