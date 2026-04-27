package desafio;

public class Carro {
    String modelo;
    int ano;
    String cor;


    String fichaTecnica(){
        return String.format("Modelo do carro %s%nAno do carro %d%nCor do carro %s%n",
                this.modelo, this.ano, this.cor);
    }

    int idadeCarro(){
        return 2026 - this.ano;
    }


}
