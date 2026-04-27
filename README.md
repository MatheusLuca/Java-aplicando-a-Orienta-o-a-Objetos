# Estrutura da pasta `src`

Esta pasta reune os exemplos do projeto de **Java com Orientacao a Objetos**, com foco em:

- criacao de classes;
- definicao de atributos e metodos;
- instanciacao de objetos;
- interacao entre objetos no fluxo principal;
- uso de **modificadores de acesso** (`private`, `public`) e encapsulamento com getters/setters.

## Visao geral da estrutura

```text
src/
|-- Filme.java
|-- Principal.java
|-- desafio/
|   |-- Aluno.java
|   |-- Calculadora.java
|   |-- Carro.java
|   |-- Main.java
|   |-- Musica.java
|   `-- Pessoa.java
`-- desafiomodificadores/
    |-- Aluno.java
    |-- ContaBancaria.java
    |-- IdadePessoa.java
    |-- Livro.java
    |-- Main.java
    `-- Produto.java
```

## Classes da raiz de `src`

### `Filme.java`

Representa uma entidade de filme com dados e comportamentos basicos:

- **Atributos**: nome, ano de lancamento, duracao, soma das avaliacoes e total de avaliacoes;
- **Metodo `exibeFichaTecnica()`**: imprime dados principais no console;
- **Metodo `avalia(double nota)`**: soma novas notas e incrementa o contador de avaliacoes;
- **Metodo `pegaMedia()`**: calcula a media simples das notas cadastradas.

Esse arquivo demonstra o conceito de modelagem de objeto e responsabilidade da classe.

### `Principal.java`

Funciona como ponto de entrada do exemplo principal:

1. cria um objeto da classe `Filme`;
2. preenche os atributos do filme;
3. imprime a ficha tecnica;
4. registra avaliacoes;
5. calcula e exibe a media final.

> Observacao: para executar como aplicacao Java diretamente, o metodo de entrada deve ser `public static void main(String[] args)`.

## Subpasta `desafio`

A pasta `desafio/` contem exercicios praticos para consolidar os fundamentos de POO com classes menores e objetivos especificos.

Documentacao detalhada da pasta:

- `src/desafio/README.md`

## Subpasta `desafiomodificadores`

A pasta `desafiomodificadores/` contem exercicios praticos focados em **modificadores de acesso** e **encapsulamento**. Os exercicios demonstram o uso de atributos `private` com acesso controlado por getters e setters.

### `Main.java`

Ponto de entrada do pacote. Apresenta um **menu interativo** via `Scanner` com 5 opcoes:

1. **Conta bancaria** — cadastra titular, numero e saldo;
2. **Idade pessoa** — verifica se a pessoa e maior de idade;
3. **Desconto produto** — aplica porcentagem de desconto sobre o preco;
4. **Notas aluno** — registra notas e calcula a media;
5. **Livros** — cadastra autor e titulo e exibe informacoes.

### `ContaBancaria.java`

Modela uma conta bancaria com encapsulamento:

- **Atributos privados**: `numeroConta` (int), `saldo` (double);
- **Atributo publico**: `titular` (String);
- **Getters/Setters**: `getNumeroConta()`, `setNumeroConta()`, `getSaldo()`, `setSaldo()`.

### `IdadePessoa.java`

Representa uma pessoa e verifica sua maioridade:

- **Atributos privados**: `nome` (String), `idade` (int);
- **Getters/Setters**: `getNome()`, `setNome()`, `getIdade()`, `setIdade()`;
- **Metodo `verificaIdade()`**: retorna `true` se a idade for >= 18.

### `Produto.java`

Modela um produto com funcionalidade de desconto:

- **Atributos privados**: `nome` (String), `preco` (double);
- **Getters/Setters**: `getNome()`, `setNome()`, `getPreco()`, `setPreco()`;
- **Metodo `descontoProduto(int desconto)`**: recebe a porcentagem de desconto e retorna o preco final.

### `Aluno.java`

Representa um aluno com registro de notas:

- **Atributos privados**: `nome` (String), `notas` (ArrayList\<Double\>);
- **Metodo `adicionarNotas(double nota)`**: adiciona uma nota a lista;
- **Metodo `calcularMedia()`**: percorre a lista e retorna a media aritmetica.

### `Livro.java`

Modela um livro com exibicao formatada:

- **Atributos privados**: `titulo` (String), `autor` (String);
- **Getters/Setters**: `getTitulo()`, `setTitulo()`, `getAutor()`, `setAutor()`;
- **Metodo `toString()`**: sobrescreve o metodo padrao para exibir titulo e autor formatados.

## Como compilar os exemplos da raiz

No terminal, na raiz do projeto:

```bash
javac -d out src/Filme.java src/Principal.java
java -cp out Principal
```

Para executar os desafios de modificadores de acesso:

```bash
javac -d out src/desafiomodificadores/*.java
java -cp out desafiomodificadores.Main
```

Se quiser executar os desafios da pasta `desafio`, veja os comandos especificos no README da pasta `desafio`.

## Objetivo pedagogico desta etapa

Ao concluir os exemplos de `src`, voce pratica:

- criacao de classes e objetos;
- separacao entre dados (atributos) e comportamento (metodos);
- chamadas de metodos de instancia;
- organizacao de codigo em multiplos arquivos;
- uso de modificadores de acesso (`private`, `public`) para encapsulamento;
- implementacao de getters e setters para controle de acesso aos atributos;
- validacao e logica de negocio dentro dos metodos da classe.
