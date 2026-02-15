package com.structural.decorator;

public class Main {

    public static void main(String[] args) {

        Notificacao notificacao =
                new SmsDecorator(
                        new EmailDecorator(
                                new NotificacaoSimples()
                        )
                );
        notificacao.enviar("Pedido confirmado");
    }
}
