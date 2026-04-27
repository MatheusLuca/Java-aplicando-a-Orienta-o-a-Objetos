package desafiomodificadores;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return """
                   Titulo do livro: %s\n
                   Autor do livro: %s\n 
                """.formatted(this.titulo, this.autor);
    }

}
