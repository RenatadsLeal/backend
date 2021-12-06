package com.digitalhouse.aula15.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.digitalhouse.aula15.model.Endereco;
import com.digitalhouse.aula15.model.Paciente;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServidorEnderecoTest {
    Endereco endereco;
    Endereco endereco2;
    ServidorEndereco servidorEndereco;
    ServidorPaciente servidorPaciente;
    Paciente paciente1;

    @BeforeEach
    void doBefore() {
        PropertyConfigurator.configure("log4j.properties");
        servidorEndereco = new ServidorEndereco();
        servidorEndereco.create();
        servidorPaciente = new ServidorPaciente();
        servidorPaciente.create();
        servidorPaciente.select(1);
        endereco = new Endereco("Primavera", "1", "Sao Paulo", "Sao Paulo");
        endereco2 = new Endereco("Outono", "1", "Maceio", "Alagoas");
        paciente1 = new Paciente("Carol", "Hakamada", "73645474", endereco);
        servidorEndereco.insert(endereco);
        servidorPaciente.insert(paciente1);
        servidorPaciente.selectAll();

    }
    @Test
    void insert() {
        String resultado = servidorEndereco.selectColuna(endereco.getId(), "rua");
        assertEquals("Primavera", resultado);
    }
}
