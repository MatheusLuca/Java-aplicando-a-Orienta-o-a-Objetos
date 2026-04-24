import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
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
    }
}
