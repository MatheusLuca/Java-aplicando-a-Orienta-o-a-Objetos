package desafio;

public class Aluno {
    String nome;
    int idade;

    String exibirInformacoes(){
        return """
                Nome: %s
                Idade: %d
                """.formatted(this.nome, this.idade);
    }

}
