package desafiointerface;

public class Servico implements Vendavel{
    private String tipoServico;
    private String descricao;
    private double pagamento;
    private int horasTrabalhadas;
    private static final double VALOR_HORA = 30.00;
    private double pagamentoTotal;
    private static final double VALOR_DESCONTO_PIX = 0.9;

    public double getPagamentoTotal() {
        return pagamentoTotal;
    }

    public void setPagamentoTotal(double pagamentoTotal) {
        this.pagamentoTotal = pagamentoTotal;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double precoTotalProduto() {
        return this.horasTrabalhadas * VALOR_HORA + this.pagamento;
    }

    @Override
    public double aplicarDesconto() {
        return this.pagamentoTotal * VALOR_DESCONTO_PIX;
    }
}
