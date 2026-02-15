package com.structural.proxy;

public class ServicoProxy implements Servico {

    private ServicoReal servicoReal;

    @Override
    public void executar() {

        if (verificarPermissao()) {

            if (servicoReal == null) {
                servicoReal = new ServicoReal();
            }

            servicoReal.executar();
        } else {
            System.out.println("Acesso negado.");
        }
    }

    private boolean verificarPermissao() {
        return true; // Simulação
    }
}
