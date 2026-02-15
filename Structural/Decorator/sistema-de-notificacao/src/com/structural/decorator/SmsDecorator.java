package com.structural.decorator;

public class SmsDecorator extends NotificacaoDecorator {
    public SmsDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }
}
