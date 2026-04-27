package desafiomodificadores;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Conta bancaria\n" +
                "2) Idade pessoa!\n" +
                "3) Desconto produto\n" +
                "4) Notas aluno\n" +
                "5) Livros");

        System.out.println("");
        System.out.println("Digite o numero conforme o menu, para entrar em um exercicio: ");
        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                System.out.println("Digite os dados da conta bancaria!\n");
                System.out.println("Digite o titular da conta: ");
                String titularConta = sc.nextLine();
                System.out.println("Digite o numero da conta: ");
                int numeroConta = sc.nextInt();
                System.out.println("Digite o saldo da conta: ");
                double saldoConta = sc.nextDouble();

                ContaBancaria conta1 = new ContaBancaria();
                conta1.titular = titularConta;
                conta1.setSaldo(saldoConta);
                conta1.setNumeroConta(numeroConta);

                System.out.println("Informações da conta: ");
                System.out.printf("Saldo da conta: %.2f\n", conta1.getSaldo());
                System.out.printf("Numero da conta: %d\n", conta1.getNumeroConta());
                System.out.println("Nome do titular:" + conta1.titular);
                break;
            case 2:
                System.out.println("Digite o nome da pessoa: ");
                String nomePessoa = sc.nextLine();
                System.out.println("Digite a idade da pessoa!");
                int idadePessoa = sc.nextInt();
                IdadePessoa p1 = new IdadePessoa();
                p1.setNome(nomePessoa);
                p1.setIdade(idadePessoa);
                if (p1.verificaIdade()) {
                    System.out.println("A/O " + p1.getNome() + " é maior de idade!");
                } else {
                    System.out.println("A/O " + p1.getNome() + " é menor de idade!");
                }
                break;
            case 3:
                System.out.println("Insira as informações do produto!");
                System.out.println("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.println("Preço do produto: ");
                double precoProduto = sc.nextDouble();
                Produto produto1 = new Produto();
                produto1.setNome(nomeProduto);
                produto1.setPreco(precoProduto);
                System.out.println("Deseja aplicar desconto?(s) sim | (n) não");
                char desconto = sc.next().charAt(0);

                switch (desconto) {
                    case 's':
                        System.out.println("Digite o valor em inteiro da porcentagem de desconto:");
                        int percentualDescontoProduto = sc.nextInt();
                        produto1.setPreco(produto1.descontoProduto(percentualDescontoProduto));
                        System.out.println("Dados do produto apos aplicar desconto: ");
                        System.out.println("Produto: " + produto1.getNome());
                        System.out.println("Preço com desconto:  " + produto1.getPreco());
                        break;
                    case 'n':
                        System.out.println("Produto: " + produto1.getNome());
                        System.out.println("Preço: " + produto1.getPreco());
                        break;
                }
            case 4:
                System.out.println("Insira o nome do aluno: ");
                String nomeAluno = sc.nextLine();
                Aluno aluno1 = new Aluno();
                System.out.println("Quantas notas desejas inserir: ");
                int quantidadeDeNotas = sc.nextInt();
                for (int i = 0; i < quantidadeDeNotas; i++) {
                    System.out.println("Digite nota: " + (i + 1));
                    double notaAluno = sc.nextDouble();
                    aluno1.adicionarNotas(notaAluno);
                }
                System.out.println(aluno1.calcularMedia());
                break;
            case 5:
                System.out.println("Insira os dados do autor do livro e titulo do livro: ");
                String autorLivro = sc.nextLine();
                String tituloLivro = sc.nextLine();
                Livro livro1 = new Livro();
                livro1.setAutor(autorLivro);
                livro1.setTitulo(autorLivro);
                System.out.println("Informações do livro: " + livro1.toString());
                break;
            default:
                System.out.println("Escolha invalida!!");
        }
    }
}
