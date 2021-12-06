package com.digitalhouse.aula14;

import com.digitalhouse.aula14.model.Cachorro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro dog1 = new Cachorro("Baleia", 3);
        Cachorro dog2 = new Cachorro("Kal", 4);
        Cachorro dog3 = new Cachorro("Meg", 11);

        cachorros.add(dog1);
        cachorros.add(dog2);
        cachorros.add(dog3);

        //Criar um arquivo
        FileOutputStream fileOut;

        try {
            fileOut = new FileOutputStream("ListaCachorros.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(cachorros);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Para ler um arquivo
        List<Cachorro> cachorros2 = null;
        FileInputStream fileInput;

        try {
            fileInput = new FileInputStream("ListaCachorros.txt");
            ObjectInputStream objInput = new ObjectInputStream(fileInput);

            cachorros2 = (ArrayList) objInput.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("Erro no arquivo");
        }catch (Exception e) {
            e.printStackTrace();
        }

        for(Cachorro dog: cachorros2){
            System.out.println("Nome: " + dog.getNome() + " Idade: " + dog.getIdade());
        }
    }
}
