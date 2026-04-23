# Estrutura da pasta `src`

Esta pasta reune os exemplos do projeto de **Java com Orientacao a Objetos**, com foco em:

- criacao de classes;
- definicao de atributos e metodos;
- instanciacao de objetos;
- interacao entre objetos no fluxo principal.

## Visao geral da estrutura

```text
src/
|-- Filme.java
|-- Principal.java
`-- desafio/
    |-- Aluno.java
    |-- Calculadora.java
    |-- Carro.java
    |-- Main.java
    |-- Musica.java
    `-- Pessoa.java
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

## Como compilar os exemplos da raiz

No terminal, na raiz do projeto:

```bash
javac -d out src/Filme.java src/Principal.java
java -cp out Principal
```

Se quiser executar os desafios, veja os comandos especificos no README da pasta `desafio`.

## Objetivo pedagogico desta etapa

Ao concluir os exemplos de `src`, voce pratica:

- criacao de classes e objetos;
- separacao entre dados (atributos) e comportamento (metodos);
- chamadas de metodos de instancia;
- organizacao de codigo em multiplos arquivos.
