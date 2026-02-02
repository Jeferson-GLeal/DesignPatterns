import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();


        System.out.println(config1 == config2);
    }
}
