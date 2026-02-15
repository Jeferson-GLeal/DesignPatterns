package com.structural.bridge;

public class RelatorioSimples extends Relatorio {

    public RelatorioSimples(Formato formato) {
        super(formato);
    }

    @Override
    public void gerar() {
        formato.gerar("Conteúdo do relatório simples");
    }
}
