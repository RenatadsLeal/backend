package com.digitalhouse.aula2.service.impl;

import com.digitalhouse.aula2.model.Mail;
import com.digitalhouse.aula2.service.CheckEmail;

public class Comercial extends CheckEmail {
    @Override
    public void processarEmail(Mail mail) {
        String[] arrayMail = mail.getDestino().split("@");

        if(arrayMail[0].equals("comercial")){
            System.out.println("Esse email é do Comercial e chegou ao seu destinatário");
        }else{
            this.proximoDestinatario.processarEmail(mail);
        }
    }
}
