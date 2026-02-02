import creator.ConcreteTelaSmartPhoneCreator;
import creator.ConcreteTelaSmartTVCreator;
import creator.ConcreteTelaSmarthWatchCreator;
import creator.ConcreteTelaWebCreator;
import product.Tela;

public class Program {

    public static void main(String[] args) {

        Tela tela1 = new ConcreteTelaWebCreator().criaTela();
        Tela tela2 = new ConcreteTelaSmarthWatchCreator().criaTela();
        Tela tela3 = new ConcreteTelaSmartPhoneCreator().criaTela();
        Tela tela4 = new ConcreteTelaSmartTVCreator().criaTela();

        System.out.println("Tela Web => " + tela1.getBackgroundColor() + ",git s " + tela1.getMessageText());
        System.out.println("Tela de SmartWatch => " + tela2.getBackgroundColor() + ", " + tela2.getMessageText());
        System.out.println("Tela de Smartphone => " + tela3.getBackgroundColor() + ", " + tela3.getMessageText());
        System.out.println("Tela de SmartTV => " + tela4.getBackgroundColor() + ", " + tela4.getMessageText());
    }
}
