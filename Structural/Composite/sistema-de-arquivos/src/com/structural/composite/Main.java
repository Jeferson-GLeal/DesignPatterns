package com.structural.composite;

public class Main {

    public static void main(String[] args) {

        Arquivo arquivo1 = new Arquivo("contrato.pdf");
        Arquivo arquivo2 = new Arquivo("foto.png");

        Pasta pastaRaiz = new Pasta("Documentos");
        Pasta subPasta = new Pasta("imagens");

        subPasta.adicionar(arquivo2);
        pastaRaiz.adicionar(arquivo1);
        pastaRaiz.adicionar(subPasta);

        pastaRaiz.exibir();
    }
}
