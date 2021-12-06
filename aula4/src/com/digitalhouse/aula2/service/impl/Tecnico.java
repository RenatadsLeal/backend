package com.digitalhouse.aula2.service.impl;

import com.digitalhouse.aula2.model.Mail;
import com.digitalhouse.aula2.service.CheckEmail;

public class Tecnico extends CheckEmail {
    @Override
    public void processarEmail(Mail mail) {
        String[] arrayMail = mail.getDestino().split("@");

        if(arrayMail[0].equals("tecnico")){
            System.out.println("Esse email é do Tecnico e chegou ao seu destinatário");
        }else{
            System.out.println("Esse email é Spam!");
        }
    }
}
