package com.digitalhouse.aula2;

import com.digitalhouse.aula2.model.Mail;
import com.digitalhouse.aula2.service.CheckEmail;
import com.digitalhouse.aula2.service.impl.Comercial;
import com.digitalhouse.aula2.service.impl.Gerente;
import com.digitalhouse.aula2.service.impl.Tecnico;

public class Main {

    public static void main(String[] args) {

        Mail mail = new Mail("lucas@hotmail.com", "comercial@colmeia.com", "Spring Boot");

        CheckEmail checkEmail = new Gerente().setProximoDestinatario(new Comercial().setProximoDestinatario(new Tecnico()));

        checkEmail.processarEmail(mail);
    }
}
