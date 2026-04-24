package desafio;

public class Carro {
    String modelo;
    int ano;
    String cor;


    String fichaTecnica(){
        return """
                Modelo do carro %s
                Ano do carro %d
                Cor do carro %s
                """.formatted(this.modelo, this.ano, this.cor);
    }

    int idadeCarro(){
        return 2026 - this.ano;
    }


}
