public class Builder {

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private int idade;

    public Builder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Builder email(String email) {
        this.email = email;
        return this;
    }

    public Builder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public Builder endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Builder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public Usuario build() {
        return new Usuario(this);
    }

    // Getters usados pelo Usuario
    String getNome() {
        return nome;
    }

    String getEmail() {
        return email;
    }

    String getTelefone() {
        return telefone;
    }

    String getEndereco() {
        return endereco;
    }

    int getIdade() {
        return idade;
    }
}
