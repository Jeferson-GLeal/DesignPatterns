package com.structural.bridge;

public class RelatorioDetalhado extends Relatorio {

    public RelatorioDetalhado(Formato formato){
        super(formato);
    }

    @Override
    public void gerar() {
        formato.gerar("Conteúdo do relatório detalhado com métricas e gráficos");
    }
}
