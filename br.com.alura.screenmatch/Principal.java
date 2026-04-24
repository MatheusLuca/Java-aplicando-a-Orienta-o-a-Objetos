public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;


        meuFilme.exibeFichaTecnica();
        System.out.println("*******************");
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("*********************");
        System.out.println("Media das avaliações: " + meuFilme.pegaMedia());
        System.out.println(meuFilme.getAnoDeLancamento());


    }
}
