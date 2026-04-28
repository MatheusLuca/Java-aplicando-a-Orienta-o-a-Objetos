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
        double perimetro = retangulo1.calcularPerimetro(comprimento, altura);
        double area = retangulo1.calcularArea(comprimento, altura);
        System.out.printf("Perimetro do retangulo: %.2f \n Area do retangulo: %.2f ", perimetro, area);


        System.out.println("Insira numero para mostrar a tabuada: ");
        int tabuada = sc.nextInt();
        TabuadaMultiplicacao tabuada1 = new TabuadaMultiplicacao();
        tabuada1.mostrarTabuada(tabuada);

        char sair = 'n';
        ConversorTemperaturaPadrao temp1 = new ConversorTemperaturaPadrao();
        while (sair != 's') {
            System.out.println("Temperatura em C ou F?");
            char escolhaTemp = sc.next().charAt(0);
            switch (escolhaTemp) {
                case 'c':
                    System.out.println("Insira o valor da temperatura em C: ");
                    double temperaturaC = sc.nextDouble();
                    temp1.setTemperatura(temperaturaC);
                    System.out.printf("Temperatura %.2f C é equivalente a %.2f F \n", temp1.getTemperatura(), temp1.celsiusParaFahrenheit());
                    System.out.println("Deseja sair? s ou n");
                    char opcao = sc.next().charAt(0);
                    if (opcao == 's') {
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
                    if (opcao == 's') {
                        sair = 's';
                    }
                    break;
                default:
                    System.out.println("Operação invalida!");
            }

            System.out.println("O livro é para retirada fisico (0) ou entrega (1): ");
            int opcaoDigitada = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite os dados para o produto livro");
            System.out.println("titulo: ");
            String tituloLivro = sc.nextLine();
            System.out.println("editora: ");
            String editoraLivro = sc.nextLine();
            System.out.println("autor: ");
            String autorLivro = sc.nextLine();
            System.out.println("preço: ");
            double precoLivro = sc.nextDouble();

            switch (opcaoDigitada) {
                case 0:
                    ProdutoFisico livroFisico = new ProdutoFisico();
                    livroFisico.setTitulo(tituloLivro);
                    livroFisico.setEditora(editoraLivro);
                    livroFisico.setAutor(autorLivro);
                    livroFisico.setPreco(precoLivro);

                    System.out.println("O pagamento é a vista s ou n?");
                    char opcaoPagamento = sc.next().charAt(0);
                    if (opcaoPagamento == 's') {
                        livroFisico.setPreco(livroFisico.calcularPrecoFinal());
                        System.out.println(livroFisico.imprimirInfoLivro());
                    } else {
                        System.out.println(livroFisico.imprimirInfoLivro());
                    }
                    break;
                case 1:
                    Livro livroEntrega = new Livro();
                    livroEntrega.setTitulo(tituloLivro);
                    livroEntrega.setEditora(editoraLivro);
                    livroEntrega.setAutor(autorLivro);
                    livroEntrega.setPreco(precoLivro);
                    double precoFinal = livroEntrega.calcularPrecoFinal();
                    livroEntrega.setPreco(precoFinal);
                    System.out.println(livroEntrega.imprimirInfoLivro());
                    break;
            }
        }


        System.out.println("Serviço | Produto?");
        char escolha = sc.next().charAt(0);
        sc.nextLine();
        switch (escolha) {
            case 's':
                System.out.println("Tipo de Serviço: ");
                String servicoTipo = sc.nextLine();
                System.out.println("Descrição: ");
                String servicoDescricao = sc.nextLine();
                System.out.println("Valor do pagamento: ");
                double servicoPagamento = sc.nextDouble();
                System.out.println("Horas trabalhadas: ");
                int servicoHorasTrabalhadas = sc.nextInt();
                Servico servico1 = new Servico();
                servico1.setTipoServico(servicoTipo);
                servico1.setDescricao(servicoDescricao);
                servico1.setPagamento(servicoPagamento);
                servico1.setHorasTrabalhadas(servicoHorasTrabalhadas);
                System.out.println("Digite a modalidade de pagamento (1) pix  (2) cartao de credito!");
                int modalidadePagamento = sc.nextInt();
                switch (modalidadePagamento) {
                    case 1:
                        servico1.setPagamentoTotal(servico1.precoTotalProduto());
                        System.out.println("Valor total com desconto pix incluido: " + servico1.aplicarDesconto());
                        break;
                    case 2:
                        System.out.println("Valor do servico: " + servico1.precoTotalProduto());
                }
                break;
            case 'p':
                System.out.println("Nome produto: ");
                String nomeProduto = sc.nextLine();
                System.out.println("Descricao: ");
                String descricaoProduto = sc.nextLine();
                System.out.println("Preço: ");
                double precoProduto = sc.nextDouble();
                System.out.println("Quantidade comprada: ");
                int quantidadeProduto = sc.nextInt();
                Produto produto1 = new Produto();
                produto1.setNome(nomeProduto);
                produto1.setDescricao(descricaoProduto);
                produto1.setPreco(precoProduto);
                produto1.setQuantidade(quantidadeProduto);
                produto1.setPreco(produto1.precoTotalProduto());
                produto1.aplicarDesconto();
                System.out.println(produto1.imprimirProduto());
                break;
        }
    }
}
