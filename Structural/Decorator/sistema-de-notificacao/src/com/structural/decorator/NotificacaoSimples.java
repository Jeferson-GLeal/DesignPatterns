package com.structural.decorator;

public class NotificacaoSimples implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Notificacao enviada: " + mensagem);
    }
}
