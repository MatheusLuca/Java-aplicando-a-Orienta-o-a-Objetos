package desafiointerface;

public class ProdutoFisico implements Calculavel{
    private String titulo;
    private String editora;
    private String autor;
    private double preco;
    private static final double DESCONTO = 0.1;

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
        return this.preco * ( 1.0 - DESCONTO );
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
