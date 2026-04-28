# Java: aplicando orientacao a objetos

Projeto de estudo com exercicios progressivos de Java cobrindo:

- criacao de classes, atributos e metodos;
- encapsulamento com modificadores de acesso e getters/setters;
- heranca e polimorfismo;
- interfaces e classes que implementam contratos.

## Estrutura do projeto

```text
br.com.alura.screenmatch/
|-- Principal.java
|-- calculadora/
|   |-- CalculadoraDeTempo.java
|   |-- Classificacao.java
|   `-- FiltroRecomendacao.java
|-- modelos/
|   |-- Titulo.java
|   |-- Filme.java
|   |-- Serie.java
|   `-- Episodio.java
|-- desafio/
|   |-- Aluno.java
|   |-- Calculadora.java
|   |-- Carro.java
|   |-- Main.java
|   |-- Musica.java
|   `-- Pessoa.java
|-- desafiomodificadores/
|   |-- Aluno.java
|   |-- ContaBancaria.java
|   |-- IdadePessoa.java
|   |-- Livro.java
|   |-- Main.java
|   `-- Produto.java
`-- desafiointerface/
    |-- CalculoGeometrico.java
    |-- CalculadoraSalaRetangular.java
    |-- ConversaoFinanceira.java
    |-- ConversorMoeda.java
    |-- ConversorTemperatura.java
    |-- ConversorTemperaturaPadrao.java
    |-- Tabuada.java
    |-- TabuadaMultiplicacao.java
    |-- Calculavel.java
    |-- Livro.java
    |-- ProdutoFisico.java
    |-- Vendavel.java
    |-- Produto.java
    |-- Servico.java
    `-- Main.java
```

## Modulo principal (`Principal`, `modelos`, `calculadora`)

- `Titulo` — classe base com nome, ano, duracao e sistema de avaliacoes;
- `Filme` — estende `Titulo`, adiciona diretor e implementa `Classificacao`;
- `Serie` — estende `Titulo`, sobrescreve duracao com base em temporadas/episodios;
- `Episodio` — implementa `Classificacao` com regra baseada em visualizacoes;
- `Classificacao` — interface com metodo `getClassificacao()`;
- `FiltroRecomendacao` — sugere conteudos de acordo com a classificacao;
- `CalculadoraDeTempo` — soma a duracao de varios titulos;
- `Principal` — ponto de entrada que cria titulos, avalia e exibe resultados.

## Subpasta `desafio`

Exercicios de fundamentos de POO com classes simples:

- `Pessoa` — exibe mensagem;
- `Calculadora` — retorna o dobro de um numero;
- `Musica` — ficha tecnica, avaliacoes e media;
- `Carro` — ficha tecnica e calculo de idade do veiculo;
- `Aluno` — exibe nome e idade;
- `Main` — executa todos os exemplos acima.

## Subpasta `desafiomodificadores`

Exercicios focados em **modificadores de acesso** e **encapsulamento**. Menu interativo via `Scanner` com 5 opcoes:

1. **Conta bancaria** (`ContaBancaria`) — titular, numero e saldo com getters/setters;
2. **Idade pessoa** (`IdadePessoa`) — verifica maioridade;
3. **Desconto produto** (`Produto`) — aplica porcentagem de desconto;
4. **Notas aluno** (`Aluno`) — registra notas e calcula media;
5. **Livros** (`Livro`) — cadastra autor/titulo e exibe com `toString()`.

## Subpasta `desafiointerface`

Exercicios focados em **interfaces** — cada exercicio define uma interface e uma classe que a implementa:

| Interface | Implementacao | Descricao |
|---|---|---|
| `ConversaoFinanceira` | `ConversorMoeda` | Converte dolar para real (taxa fixa 5.00) |
| `CalculoGeometrico` | `CalculadoraSalaRetangular` | Calcula area e perimetro de um retangulo |
| `Tabuada` | `TabuadaMultiplicacao` | Exibe a tabuada de multiplicacao de 0 a 10 |
| `ConversorTemperatura` | `ConversorTemperaturaPadrao` | Converte entre Celsius e Fahrenheit |
| `Calculavel` | `Livro` | Calcula o preco final de um livro com taxa de entrega (1.2x) |
| `Calculavel` | `ProdutoFisico` | Calcula o preco final de um livro fisico com desconto (10%) a vista |
| `Vendavel` | `Produto` | Calcula preco total (preco x quantidade) e aplica desconto progressivo (5%, 10% ou 15%) conforme a quantidade |
| `Vendavel` | `Servico` | Calcula valor total (horas trabalhadas x R$ 30 + pagamento adicional) e aplica desconto de 10% no pagamento via Pix |

`Main` — executa todos os exercicios com entrada de dados via `Scanner`, incluindo um loop para conversoes de temperatura, cadastro de livros (fisico ou para entrega) e o fluxo final de escolha entre `Servico` e `Produto` com diferentes modalidades de pagamento.

## Como executar

Use a IDE (IntelliJ/Cursor) para compilar e executar por pacote, ou pelo terminal:

```bash
javac -d out br.com.alura.screenmatch/Principal.java br.com.alura.screenmatch/modelos/*.java br.com.alura.screenmatch/calculadora/*.java
java -cp out Principal
```

Pontos de entrada disponiveis:

- `Principal` — modulo principal
- `desafio.Main` — exercicios de fundamentos
- `desafiomodificadores.Main` — exercicios de encapsulamento
- `desafiointerface.Main` — exercicios de interfaces

## Objetivo pedagogico

Ao concluir os exemplos, voce pratica:

- criacao de classes e objetos;
- separacao entre dados e comportamento;
- heranca (`extends`) e polimorfismo;
- interfaces (`implements`) como contratos;
- modificadores de acesso e encapsulamento;
- organizacao de codigo em pacotes.
