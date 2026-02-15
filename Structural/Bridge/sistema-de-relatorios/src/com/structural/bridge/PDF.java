package com.structural.bridge;

public class PDF implements Formato {

    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando PDF: " + conteudo);
    }
}
