package creator;

import product.Tela;
import product.TelaSmartPhone;

public class ConcreteTelaSmartPhoneCreator extends TelaCreator {
    @Override
    public Tela criaTela() {
        return new TelaSmartPhone();
    }
}
