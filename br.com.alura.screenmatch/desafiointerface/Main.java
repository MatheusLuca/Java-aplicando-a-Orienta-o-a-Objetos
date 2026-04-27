package desafiointerface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em dolar para conversão: ");
        double valorDolar = sc.nextDouble();
        ConversorMoeda converte = new ConversorMoeda();
        System.out.println(converte.converterDolarParaReal(valorDolar));

        System.out.println("Digite comprimento e altura do retangulo: ");
        double comprimento = sc.nextDouble();
        double altura = sc.nextDouble();

        CalculadoraSalaRetangular retangulo1 = new CalculadoraSalaRetangular();
        double perimetro = retangulo1.calcularPerimetro(comprimento,altura);
        double area = retangulo1.calcularArea(comprimento,altura);
        System.out.printf("Perimetro do retangulo: %.2f \n Area do retangulo: %.2f ", perimetro, area);


        System.out.println("Insira numero para mostrar a tabuada: ");
        int tabuada = sc.nextInt();
        TabuadaMultiplicacao tabuada1 = new TabuadaMultiplicacao();
        tabuada1.mostrarTabuada(tabuada);

        char sair = 'n';
        ConversorTemperaturaPadrao temp1 = new ConversorTemperaturaPadrao();
        while( sair != 's'){
            System.out.println("Temperatura em C ou F?");
            char escolhaTemp = sc.next().charAt(0);
            switch (escolhaTemp){
                case 'c':
                    System.out.println("Insira o valor da temperatura em C: ");
                    double temperaturaC = sc.nextDouble();
                    temp1.setTemperatura(temperaturaC);
                    System.out.printf("Temperatura %.2f C é equivalente a %.2f F \n", temp1.getTemperatura(), temp1.celsiusParaFahrenheit());
                    System.out.println("Deseja sair? s ou n");
                    char opcao = sc.next().charAt(0);
                        if(opcao == 's'){
                            sair = 's';
                        }
                    break;
                case 'f':
                    System.out.println("Insira o valor da temperatura em F: ");
                    double temperaturaF = sc.nextDouble();
                    temp1.setTemperatura(temperaturaF);
                    System.out.printf("Temperatura %.2f F é equivalente a %.2f C \n", temp1.getTemperatura(), temp1.fahrenheitParaCelsius());
                    System.out.println("Deseja sair? s ou n");
                    opcao = sc.next().charAt(0);
                    if(opcao == 's'){
                        sair = 's';
                    }
                    break;
                default:
                    System.out.println("Operação invalida!");
            }


        }


    }
}
