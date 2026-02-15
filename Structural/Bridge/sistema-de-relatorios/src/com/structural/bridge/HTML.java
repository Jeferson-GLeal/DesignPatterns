package com.structural.bridge;

public class HTML implements Formato {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando HTML: " + conteudo);
    }
}
