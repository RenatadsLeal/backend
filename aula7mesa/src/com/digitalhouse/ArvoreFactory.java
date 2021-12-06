package com.digitalhouse;

import com.digitalhouse.model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, Arvore> flyweight = new HashMap<>();

    public Arvore buscarArvore(Double altura, Double largura, String cor) {
        String id = "altura" + altura + "largura" + largura + "cor" + cor;

        if(!flyweight.containsKey(id)){
            flyweight.put(id, new Arvore(altura, largura, cor));
            System.out.println("Uma nova árvore foi plantada!");
            System.out.println(flyweight.get(id).toString());
        } else {
            System.out.println("Essa árvore já foi plantada!");
        }

        return flyweight.get(id);
    }
}
