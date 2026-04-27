package desafiointerface;

public class Livro implements Calculavel{
    private String titulo;
    private String editora;
    private String autor;
    private double preco;
    private static final double TAXA_DE_ENTREGA = 1.2;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco * TAXA_DE_ENTREGA;
    }
    public String imprimirInfoLivro(){
        return """
                Livro: %s 
                Editora: %s
                Autor: %s
                Preco: %.2f
                """.formatted( this.titulo, this.editora, this.autor, this.preco);
    }

}
