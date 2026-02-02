import javax.print.Doc;

public class Documento implements Prototype <Documento> {

    private String titulo;
    private String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public Documento clone() {
        return new Documento(this.titulo, this.conteudo);
    }

    @Override
    public String toString() {
        return "Documento{" +
                "\n        \"titulo\"=\"" + titulo + "\"" +
                "\n        \"conteudo\"=\"" + conteudo + "\"" +
                "\n        }";
    }

}
