package desafio;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroAvaliacao;
    double mediasDaavaliacao;

    String fichaTecnica(){
        return """
                Titulo: %s
                Artista: %s
                Ano de lançamento: %d
                Avaliação: %.2f 
                Numero de avaliação: %d 
                """.formatted(this.titulo, this.artista, this.anoDeLancamento, this.avaliacao, this.numeroAvaliacao);
    }

    void  calcularAvaliacoes(double nota){
        numeroAvaliacao++;
        avaliacao += nota;
    }

    double calcularMediaDasAvaliacoes(){
        return this.mediasDaavaliacao = avaliacao / numeroAvaliacao;

    }


}
