package com.structural.flyweight;

public class TipoArvore {

    private String nome;
    private String cor;
    private String textura;

    public TipoArvore(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }

    public void exibir(int x, int y) {
        System.out.println("Arvore " + nome + "na posição  (" + x + "," + y + ")");
    }
}
