package com.structural.proxy;

public class ServicoReal implements Servico {
    @Override
    public void executar() {
        System.out.println("Executando operacao critica...");
    }
}
