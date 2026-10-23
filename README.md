# 🎓 Boletim Escolar — Java

**Arrays, ArrayList e For-each em um projeto de console.**

A mini console application that registers students, calculates averages, and displays class statistics.

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Documentation](https://img.shields.io/badge/Documentation-Bilingual-blue)

[English](#-english) · [Português](#-português) · [Roadmap](#-roadmap) · [Project Structure](#-project-structure)

---

<details open>
<summary><h2>🇺🇸 English</h2></summary>

## About the project

**Boletim Escolar** (School Report Card) is a Java console application that registers students, stores their grades, calculates averages, and displays individual reports and class statistics.

## Features

- **Register students** — stores each student's name and four grades.
- **Validate grades** — accepts grades between 0 and 10 and handles invalid numeric input.
- **Display report cards** — shows each student's grades, average, and approval status.
- **Calculate class statistics** — displays the number of students, class average, best performance, and approval results.
- **Interactive menu** — allows the user to select an operation until choosing to exit.

## Concepts practiced

| Concept | Where it appears in the code |
|---|---|
| `ArrayList<String>` | Stores student names |
| `ArrayList<double[]>` | Stores each student's grade array |
| Arrays (`double[]`) | Store four grades per student |
| Traditional `for` | Iterates through students using their indexes |
| `for-each` | Iterates through grades to calculate averages and display results |
| Methods | Separate the program's operations into reusable sections |
| Constants (`static final`) | Define the number of grades and passing average |
| `do-while` | Keeps the menu running |
| `switch` | Selects the requested menu operation |
| `if/else` and ternary operator | Determine student status and handle conditions |
| `try/catch` | Handles invalid numeric input |
| Input validation | Checks student names and ensures grades are between 0 and 10 |

## How it works

### 1. Student data

The application uses two `ArrayList` collections: one for names and another for grade arrays.

```java
private static final ArrayList<String> nomes = new ArrayList<>();
private static final ArrayList<double[]> notasDosAlunos = new ArrayList<>();
```

Each student's name and grades are associated through their position in the lists.

### 2. Grade registration

Each student receives an array containing four grades. A loop collects the grades, while input validation ensures that each value is valid.

```java
double[] notas = new double[QTD_NOTAS];

for (int i = 0; i < notas.length; i++) {
    notas[i] = lerNota(i + 1);
}
```

### 3. Average calculation

The `calcularMedia()` method uses `for-each` to add the grades and calculate the average.

```java
private static double calcularMedia(double[] notas) {
    double soma = 0;

    for (double nota : notas) {
        soma += nota;
    }

    return soma / notas.length;
}
```

### 4. Student status

The `situacao()` method determines whether the student passed based on the minimum average.

```java
private static String situacao(double media) {
    return media >= MEDIA_APROVACAO
            ? "APROVADO"
            : "REPROVADO";
}
```

### 5. Class statistics

The statistics method calculates the class average, identifies the student with the highest average, and counts approved and failed students.

## How to run

```bash
javac BoletimEscolar.java
java BoletimEscolar
```

Requires the Java Development Kit (JDK). The project can also be run from a Java IDE.

</details>

---

<details>
<summary><h2>🇧🇷 Português</h2></summary>

## Sobre o projeto

O **Boletim Escolar** é uma aplicação de console desenvolvida em Java que cadastra alunos, armazena suas notas, calcula médias e apresenta boletins individuais e estatísticas da turma.

## Funcionalidades

- **Cadastrar alunos** — armazena o nome de cada aluno e suas quatro notas.
- **Validar notas** — aceita notas entre 0 e 10 e trata entradas numéricas inválidas.
- **Exibir boletins** — apresenta as notas, a média e a situação de cada aluno.
- **Calcular estatísticas da turma** — mostra a quantidade de alunos, a média da turma, o melhor desempenho e os resultados de aprovação.
- **Menu interativo** — permite selecionar operações até que o usuário escolha sair.

## Conceitos praticados

| Conceito | Onde aparece no código |
|---|---|
| `ArrayList<String>` | Armazena os nomes dos alunos |
| `ArrayList<double[]>` | Armazena o array de notas de cada aluno |
| Arrays (`double[]`) | Guardam quatro notas por aluno |
| `for` tradicional | Percorre os alunos utilizando seus índices |
| `for-each` | Percorre as notas para calcular médias e exibir resultados |
| Métodos | Separam as operações do programa em partes reutilizáveis |
| Constantes (`static final`) | Definem a quantidade de notas e a média de aprovação |
| `do-while` | Mantém o menu em execução |
| `switch` | Seleciona a operação solicitada no menu |
| `if/else` e operador ternário | Determinam a situação dos alunos e tratam condições |
| `try/catch` | Trata entradas numéricas inválidas |
| Validação de entrada | Verifica nomes e garante que as notas estejam entre 0 e 10 |

## Como funciona

### 1. Dados dos alunos

A aplicação utiliza duas coleções `ArrayList`: uma para os nomes e outra para os arrays de notas.

```java
private static final ArrayList<String> nomes = new ArrayList<>();
private static final ArrayList<double[]> notasDosAlunos = new ArrayList<>();
```

O nome e as notas de cada aluno são associados por meio da mesma posição nas listas.

### 2. Cadastro de notas

Cada aluno recebe um array com quatro notas. Um laço coleta os valores, enquanto a validação garante que cada nota seja válida.

```java
double[] notas = new double[QTD_NOTAS];

for (int i = 0; i < notas.length; i++) {
    notas[i] = lerNota(i + 1);
}
```

### 3. Cálculo da média

O método `calcularMedia()` utiliza `for-each` para somar as notas e calcular a média.

```java
private static double calcularMedia(double[] notas) {
    double soma = 0;

    for (double nota : notas) {
        soma += nota;
    }

    return soma / notas.length;
}
```

### 4. Situação do aluno

O método `situacao()` determina se o aluno foi aprovado de acordo com a média mínima.

```java
private static String situacao(double media) {
    return media >= MEDIA_APROVACAO
            ? "APROVADO"
            : "REPROVADO";
}
```

### 5. Estatísticas da turma

O método de estatísticas calcula a média da turma, identifica o aluno com a maior média e contabiliza os aprovados e reprovados.

## Como executar

```bash
javac BoletimEscolar.java
java BoletimEscolar
```

É necessário ter o Java Development Kit (JDK) instalado. O projeto também pode ser executado em uma IDE Java.

</details>

---

## 🗺️ Roadmap

- [x] Store four grades per student in an array / Armazenar quatro notas por aluno em um array
- [x] Store student names and grades using `ArrayList` / Armazenar nomes e notas utilizando `ArrayList`
- [x] Calculate individual averages / Calcular médias individuais
- [x] Determine approval status / Determinar a situação de aprovação
- [x] Validate grades and handle invalid input / Validar notas e tratar entradas inválidas
- [x] Display individual reports / Exibir boletins individuais
- [x] Calculate class statistics / Calcular estatísticas da turma
- [x] Organize the application using methods and constants / Organizar a aplicação com métodos e constantes

---

## 📁 Project Structure

```text
Java-Learning-Library/
├── README.md
└── Projetos/
    └── BoletimEscolar.java
```

---

## 🧠 Philosophy

*Store data with purpose. Organize code with understanding. Build one step at a time.*

*Armazene dados com propósito. Organize o código com entendimento. Construa um passo de cada vez.*

<div align="center">

Made with ☕, curiosity, and consistency.

</div>
