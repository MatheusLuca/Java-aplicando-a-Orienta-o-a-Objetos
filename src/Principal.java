public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avaliacao = 10.00;
        meuFilme.incluidoNoPlano = true ;
        meuFilme.totalDeAvaliacoes = 100 ;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);




    }
}
