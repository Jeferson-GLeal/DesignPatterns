package com.structural.adapter;

public class PagamentoAdapter implements Pagamento {

    private final PagamentoLegado pagamentoLegado;

    public PagamentoAdapter(PagamentoLegado pagamentoLegado) {
        this.pagamentoLegado = pagamentoLegado;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado pelo sistema Adapter R$ " + valor);
    }
}
