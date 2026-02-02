public class Program {

    public static void main(String[] args) {
        Documento original = new Documento(
                "contrato",
                "Texto do contrato..."
        );

        Documento copia = original.clone();
        System.out.println(original);
        System.out.println(copia);
    }

}
