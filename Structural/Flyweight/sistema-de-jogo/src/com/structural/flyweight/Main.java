package com.structural.flyweight;

public class Main {

    public static void main(String[] args) {

        TipoArvore tipo1 = ArvoreFactory.getTipo("Carvalho ", "Verde", "Textura1");
        tipo1.exibir(10,20);

        TipoArvore tipo2 = ArvoreFactory.getTipo("Carvalho ", "Verde", "Textura1");
        tipo1.exibir(30,40);

        System.out.println(tipo1 == tipo2); // true
    }
}
