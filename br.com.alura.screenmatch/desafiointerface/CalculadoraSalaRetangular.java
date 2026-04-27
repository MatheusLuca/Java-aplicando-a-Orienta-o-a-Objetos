package desafiointerface;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double comprimento;
    private double altura;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calcularArea(double comprimento, double altura) {
        return comprimento * altura;
    }

    @Override
    public double calcularPerimetro(double comprimento, double altura) {
        return (comprimento * 2) + (altura * 2);
    }
}
