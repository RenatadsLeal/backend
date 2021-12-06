package com.dh.aula19.services;

import com.dh.aula19.domain.Dentista;
import com.dh.aula19.domain.Endereco;
import com.dh.aula19.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteService implements IPaciente{
    @Override
    public List<Paciente> listarPacientes() {
        List<Paciente> lista = new ArrayList<>();
        lista.add(new Paciente(2543, "Lisa", "Limail", "lisa@email.com", "4564357", new Date(),
                new Endereco("Rua da Lisa", "54", "Outra", "MG"),new Dentista(342, "Lyeie", "Laufey", "2763653TM")));
        lista.add(new Paciente(4564, "Gnome", "Chapelus", "gnome@email.com", "77894645", new Date(),
                new Endereco("Rua do Gnome", "333", "Mais Uma", "XX"), new Dentista(455, "Sqap", "Vim", "23423333TM")));
        lista.add(new Paciente(1232, "Leech", "Lisk", "lisk@email.com", "23132221", new Date(),
                new Endereco("Rua do Leech", "11", "Criativa", "AL"), new Dentista(120, "Zoye", "Groul", "8989900653TN")));
        return lista;
    }

    @Override
    public Paciente pacientePorEmail(String email) {
        return new Paciente(2543, "Paciente", "Por Email", email, "863874687", new Date(),
                new Endereco("Rua do paciente", "777", "Alguma", "SP"), new Dentista(111, "Jlowes", "Frim", "23334553CM"));
    }
}
