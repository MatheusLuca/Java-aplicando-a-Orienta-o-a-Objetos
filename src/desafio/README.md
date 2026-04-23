# Desafio - pratica de classes em Java

Esta pasta concentra exercicios praticos de Orientacao a Objetos para treinar:

- criacao de classes e objetos;
- definicao de atributos;
- implementacao de metodos;
- retorno de valores e exibicao de mensagens;
- organizacao do codigo em pacote.

## Estrutura da pasta

```text
src/desafio/
|-- Main.java
|-- Pessoa.java
|-- Calculadora.java
|-- Musica.java
|-- Carro.java
`-- Aluno.java
```

## Papel de cada arquivo

### `Main.java`

Classe de execucao do pacote `desafio`. Ela cria objetos de todas as classes e demonstra o uso de seus metodos no console.

Fluxo principal:

1. chama mensagem inicial de `Pessoa`;
2. calcula o dobro de um numero com `Calculadora`;
3. monta uma musica, registra avaliacoes e calcula a media;
4. monta um carro e calcula a idade;
5. cria um aluno e imprime os dados formatados.

### `Pessoa.java`

Classe introdutoria com um metodo simples:

- `exibirMensagem()`: imprime `"Ola, mundo!"`.

Objetivo: demonstrar o primeiro comportamento encapsulado em uma classe.

### `Calculadora.java`

Classe com regra de negocio simples:

- `retornarDobro(double numero)`: retorna o valor multiplicado por 2.

Objetivo: praticar metodo com parametro e retorno.

### `Musica.java`

Classe de modelagem de uma musica com atributos e metodos relacionados a avaliacao:

- `titulo`, `artista`, `anoDeLancamento`;
- `avaliacao` (soma das notas) e `numeroAvaliacao`;
- `fichaTecnica()`: retorna texto formatado com os dados da musica;
- `calcularAvaliacoes(double nota)`: adiciona uma nova nota;
- `calcularMediaDasAvaliacoes()`: retorna a media das notas.

Objetivo: praticar acumuladores, formatacao e calculo de media.

### `Carro.java`

Classe para representar um carro:

- atributos `modelo`, `ano` e `cor`;
- `fichaTecnica()`: retorna dados do carro em formato de texto;
- `idadeCarro()`: calcula idade com base no ano atual usado na regra.

Objetivo: praticar retorno textual e calculo derivado de atributo.

### `Aluno.java`

Classe basica com dados de estudante:

- atributos `nome` e `idade`;
- `exibirInformacoes()`: retorna string formatada com os dados.

Objetivo: consolidar construcao de metodos que retornam texto.

## Como compilar e executar

No terminal, na raiz do projeto:

```bash
javac -d out src/desafio/*.java
java -cp out desafio.Main
```
