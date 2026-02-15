package com.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Servico servico = new ServicoProxy();
        servico.executar();
    }
}
