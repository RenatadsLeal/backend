package com.digitalhouse;

import com.digitalhouse.model.Arvore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArvoreFactory factory = new ArvoreFactory();
        List<Arvore> arvore = new ArrayList<>();
        List<Arvore> arvore2 = new ArrayList<>();

        for(int i=0; i<20; i++){
            arvore.add(factory.buscarArvore(200.0, 400.0, "verde"));
        }

        for(int i=0; i<20; i++){
            arvore2.add(factory.buscarArvore(500.0, 300.0, "vermelho"));
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
