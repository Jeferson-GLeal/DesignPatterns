package com.structural.bridge;

public class Main {

    public static void main(String[] args) {

        Formato pdf = new PDF();
        Formato html = new HTML();

        Relatorio relatorio1 = new RelatorioSimples(pdf);
        relatorio1.gerar();

        Relatorio relatorio2 = new RelatorioDetalhado(html);
        relatorio2.gerar();
    }
}
