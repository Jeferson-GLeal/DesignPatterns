package com.structural.decorator;

public class EmailDecorator extends NotificacaoDecorator {

    public EmailDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando Email: " + mensagem);
    }
}
