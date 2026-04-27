package desafiomodificadores;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double descontoProduto( int desconto){
        double percentualDesconto = ((desconto - 100) / 100.0) * -1;
        double precoFinal = getPreco() * percentualDesconto;
        return precoFinal;

    }

}
