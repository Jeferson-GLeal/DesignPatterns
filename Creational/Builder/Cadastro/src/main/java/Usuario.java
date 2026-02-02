public class Usuario {

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private int idade;


    // Construtor recebe o Builder
    Usuario(Builder builder) {
        this.nome = builder.getNome();
        this.email = builder.getEmail();
        this.telefone = builder.getTelefone();
        this.endereco = builder.getEndereco();
        this.idade = builder.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\n        \"nome\"=\"" + nome + "\"" +
                "\n        \"email\"=\"" + email + "\"" +
                "\n        \"telefone\"=\"" + telefone + "\"" +
                "\n        \"endereco\"=\"" + endereco + "\"" +
                "\n        \"idade\"=\"" + idade + "\"" +
                "\n        }";
    }
}
