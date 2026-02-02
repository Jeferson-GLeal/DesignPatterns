package creator;

import product.Tela;
import product.TelaWeb;

public class ConcreteTelaWebCreator extends TelaCreator {
    @Override
    public Tela criaTela() {
        return new TelaWeb();
    }
}
