public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + numeroPaginas);
        System.out.println();
    }
}

