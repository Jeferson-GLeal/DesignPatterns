public class Program {
    public static void main(String[] args) {

        Usuario usuario1 = new Builder()
                .nome("João")
                .email("joao@email.com")
                .idade(30)
                .build();

        System.out.println(usuario1);



    Usuario usuario2 = new Builder()
            .nome("Jeferson")
            .email("jeferson@email.com")
            .telefone("1198877-6655")
            .endereco("Rua Terceira, 143 Jd Ficticio - Beterraba - SP")
            .idade(38)
            .build();

        System.out.println(usuario2);
    }
}
