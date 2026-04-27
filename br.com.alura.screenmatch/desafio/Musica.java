package desafio;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroAvaliacao;
    double mediasDaavaliacao;

    String fichaTecnica(){
        return String.format(
                "Titulo: %s%nArtista: %s%nAno de lançamento: %d%nAvaliação: %.2f%nNumero de avaliação: %d%n",
                this.titulo, this.artista, this.anoDeLancamento, this.avaliacao, this.numeroAvaliacao
        );
    }

    void  calcularAvaliacoes(double nota){
        numeroAvaliacao++;
        avaliacao += nota;
    }

    double calcularMediaDasAvaliacoes(){
        return this.mediasDaavaliacao = avaliacao / numeroAvaliacao;

    }


}
