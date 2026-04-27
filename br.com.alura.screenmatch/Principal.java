import calculadora.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Serie;
import modelos.Titulo;


public class Principal {
    public static void main(String[] args) {

        Titulo meuFilme = new Titulo();
        meuFilme.setNome("O poderoso castiga!");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(100);

        meuFilme.exibeFichaTecnica();

        System.out.println("*******************");

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());

        System.out.println("*********************");

        System.out.println("Media das avaliações: " + meuFilme.pegaMedia());
        System.out.println(meuFilme.getAnoDeLancamento());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

    }
}
