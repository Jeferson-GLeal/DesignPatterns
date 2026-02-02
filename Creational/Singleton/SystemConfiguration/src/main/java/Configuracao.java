public class Configuracao {

    //volatile evita problemas de reordenação de memória
    private static volatile Configuracao instancia;

    //Construtor privado impede o new
    private Configuracao(){}

    public static Configuracao getInstance() {
        if (instancia == null) {
            //o synchronized garante que apenas uma thread por vez possa criar a instância do Singleton.
            synchronized (Configuracao.class) {
                if (instancia == null) {
                    instancia = new Configuracao();
                }
            }
        }
        return instancia;
    }
}
