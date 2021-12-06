package com.digitalhouse.aula15.dao;

import com.digitalhouse.aula15.model.Endereco;
import com.digitalhouse.aula15.model.Paciente;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServidorPacienteTest {
    Endereco endereco1;
    Endereco endereco2;
    Endereco endereco3;
    Paciente paciente1;
    Paciente paciente2;
    Paciente paciente3;
    ServidorEndereco servidorEndereco;
    ServidorPaciente servidorPaciente;

    @BeforeEach
    void doBefore() {
        PropertyConfigurator.configure("log4j.properties");
        endereco1 = new Endereco("Inverno", "6", "Munchkin", "Gaia");
        endereco2 = new Endereco("Verão", "89", "Terraform", "Dobble");
        paciente1 = new Paciente("Barbie", "Mattel", "73633374", endereco1);
        paciente2 = new Paciente("Woody", "Pixar", "761236354", endereco2);
        servidorEndereco = new ServidorEndereco();
        servidorEndereco.create();
        servidorEndereco.insert(endereco1);
        servidorEndereco.insert(endereco2);
        servidorPaciente = new ServidorPaciente();
        servidorPaciente.create();
        servidorPaciente.insert(paciente1);
        servidorPaciente.insert(paciente2);
        servidorPaciente.selectAll();
    }

    @Test
    void insert() {
        endereco3 = new Endereco("Outono", "345", "Takenoko", "Everdell");
        servidorEndereco.insert(endereco3);
        paciente3 = new Paciente("Totoro", "Miyasaki", "5345456", endereco3);
        servidorPaciente.insert(paciente3);
        servidorPaciente.select(3);
        servidorPaciente.delete(3);

        assertEquals("Id não existe no banco!", servidorPaciente.select(3));
    }
}
