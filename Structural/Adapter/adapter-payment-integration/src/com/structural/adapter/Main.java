package com.structural.adapter;

public class Main {

    public static void main(String[] args) {
        PagamentoLegado sistemaLegado = new PagamentoLegado();

        Pagamento pagamento = new PagamentoAdapter(sistemaLegado);

        pagamento.pagar(150.00);

        sistemaLegado.realizarPagamento(300.00);
    }
}
