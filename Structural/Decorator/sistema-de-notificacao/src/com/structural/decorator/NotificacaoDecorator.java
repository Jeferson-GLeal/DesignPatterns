package com.structural.decorator;

public class NotificacaoDecorator implements Notificacao {

    protected Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviar(String mensagem) {
        notificacao.enviar(mensagem);
    }
}
