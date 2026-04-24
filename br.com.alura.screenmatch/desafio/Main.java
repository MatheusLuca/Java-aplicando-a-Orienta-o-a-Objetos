package desafio;

public class Main {
    static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.exibirMensagem();

        Calculadora dobro = new Calculadora();
        System.out.println(dobro.retornarDobro(500));
        System.out.println("*********************");

        Musica musica1 = new Musica();

        musica1.titulo = "Derek";
        musica1.artista = "Derek barra";
        musica1.anoDeLancamento = 2001;

        musica1.calcularAvaliacoes(2);
        musica1.calcularAvaliacoes(4);
        musica1.calcularAvaliacoes(8);

        System.out.println(musica1.fichaTecnica());
        double media = musica1.calcularMediaDasAvaliacoes();
        System.out.printf("Media da musica: %.2f", media );
        System.out.println();

        System.out.println("*********************");

        Carro carro1 = new Carro();
        carro1.modelo = "Celtinha";
        carro1.ano = 2000;
        carro1.cor = "Preto";
        System.out.println(carro1.fichaTecnica());
        System.out.println("O carro tem: " + carro1.idadeCarro() + " anos.");
        System.out.println("*********************");

        Aluno alunox = new Aluno();
        alunox.nome = "Luiz";
        alunox.idade  = 50;
        System.out.println(alunox.exibirInformacoes());

    }
}
