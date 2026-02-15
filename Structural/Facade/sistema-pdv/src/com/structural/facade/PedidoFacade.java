package com.structural.facade;

public class PedidoFacade {

    private EstoqueService estoqueService;
    private PagamentoService pagamentoService;
    private EmailService emailService;

    public PedidoFacade() {
        this.estoqueService = new EstoqueService();
        this.pagamentoService = new PagamentoService();
        this.emailService = new EmailService();
    }

    public void finalizarPedido() {
        estoqueService.validarEstoque();
        pagamentoService.processarPagamento();
        emailService.enviarConfirmacao();
        System.out.println("Pedido finalizado com sucesso.");
    }
}
