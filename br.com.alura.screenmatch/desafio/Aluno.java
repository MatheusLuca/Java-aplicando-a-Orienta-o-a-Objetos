package desafio;

public class Aluno {
    String nome;
    int idade;

    String exibirInformacoes(){
        return String.format("Nome: %s%nIdade: %d%n", this.nome, this.idade);
    }

}
