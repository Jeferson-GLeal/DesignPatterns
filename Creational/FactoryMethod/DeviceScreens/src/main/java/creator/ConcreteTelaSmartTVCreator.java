package creator;

import product.Tela;
import product.TelaSmartTV;

public class ConcreteTelaSmartTVCreator extends TelaCreator{
    @Override
    public Tela criaTela() {
        return new TelaSmartTV();
    }
}
