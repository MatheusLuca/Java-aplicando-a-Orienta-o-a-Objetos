package desafiointerface;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return this.temperatura * 1.8 + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return   (this.temperatura - 32) * (5.0 / 9.0);
    }
}
