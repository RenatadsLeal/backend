package com.digitalhouse.aula14;

import com.digitalhouse.aula14.model.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Clarissa", "clarisa@gmail.com", "2324345455");
        Contato contato2 = new Contato("Carol", "carol@bol.com", "38397483674");
        Contato contato3 = new Contato("Adryana", "adryana@gmail.com", "9836345474");

        // Contato[] contatos = {contato1, contato2, contato3};

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);

        try {
            FileOutputStream fileOut = new FileOutputStream("ListaContatos.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(contatos);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Contato> contatos2 = null;

        try {
            FileInputStream fileInput = new FileInputStream("ListaContatos.txt");
            ObjectInputStream objInput = new ObjectInputStream(fileInput);

            contatos2 = (ArrayList) objInput.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Contato contact: contatos2){
            System.out.println("Nome: " + contact.getNome() + " ---- Email: " + contact.getEmail() + " ---- Telefone: " + contact.getTelefone());
        }
    }
}
