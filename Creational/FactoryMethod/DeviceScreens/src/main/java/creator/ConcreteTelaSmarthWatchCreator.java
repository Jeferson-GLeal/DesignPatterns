package creator;

import product.Tela;
import product.TelaSmartWatch;

public class ConcreteTelaSmarthWatchCreator extends TelaCreator {
    @Override
    public Tela criaTela() {
        return new TelaSmartWatch();
    }
}
