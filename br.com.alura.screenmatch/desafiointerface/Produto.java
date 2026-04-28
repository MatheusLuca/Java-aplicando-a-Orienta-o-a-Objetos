package desafiointerface;

public class Produto implements Vendavel {
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String categoriaProduto;
    private double percentualDesconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    @Override
    public double precoTotalProduto() {
        return this.preco * this.quantidade;
    }

    @Override
    public double aplicarDesconto() {
        if(this.quantidade <= 5){
            this.percentualDesconto = ((0.95 * 100) - 100) * -1.0;
            return this.preco * 0.95;
        } else if (this.quantidade > 5 && this.quantidade <= 15) {
            this.percentualDesconto = ((0.90 * 100) - 100) * -1.0;
            return this.preco * 0.90;
        }else{
            this.percentualDesconto = ((0.85 * 100) - 100) * -1.0;
            return this.preco * 0.85;
        }
    }

    public String imprimirProduto(){
        return """
                Produto: %s
                Descrição: %s
                Preço total: %.2f
                Percentual desconto: %.0f%%
                """.formatted(this.nome, this.descricao, this.preco, this.percentualDesconto);
    }

}
