<div align="center">

# ☕ Java — Arrays, ArrayList & Loops

**Store data. Traverse elements. Work with collections.**

A practical guide to arrays, `ArrayList`, `for`, and `for-each` in Java.

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)
![Documentation](https://img.shields.io/badge/Documentation-Bilingual-blue)

[English](#-english) · [Português](#-português) · [Roadmap](#-roadmap) · [Project Structure](#-project-structure)

</div>

---

<details open>
<summary><h2>🇺🇸 English</h2></summary>

## About the project

This project documents the fundamentals of arrays, `ArrayList`, and loops in Java. These concepts help store multiple values, access individual elements, traverse data, and perform operations on each item.

## What you will find here

- **Arrays** — store multiple values of the same type in a fixed-size structure.
- **Array length** — use `length` to find how many elements an array contains.
- **ArrayList** — create a resizable collection and use methods such as `add()`, `get()`, `remove()`, and `size()`.
- **Traditional `for` loop** — iterate using an index, a condition, and an increment.
- **`for-each` loop** — iterate directly over each element in an array or collection.
- **Conditionals and counters** — use `if/else` to check a condition and a counter to track how many elements satisfy it.

## 1. Arrays

An array stores multiple values of the same type. Its size is fixed when it is created, and its indexes start at `0`.

```java
int[] numeros = {1, 2, 3, 4, 5};

System.out.println(numeros[0]);       // First element: 1
System.out.println(numeros[4]);       // Last element: 5
System.out.println(numeros.length);   // Number of elements: 5
```

### Important points

- `numeros[0]` accesses the first element.
- `numeros[4]` accesses the fifth element in this array.
- `numeros.length` returns the number of elements, not the last index.
- To display the array as a whole, you can use `Arrays.toString()`:

```java
System.out.println(java.util.Arrays.toString(numeros));
```

Output:

```text
[1, 2, 3, 4, 5]
```

## 2. ArrayList

`ArrayList` is a resizable collection. Unlike an array, its number of elements can change as items are added or removed.

```java
import java.util.ArrayList;

ArrayList<String> produtos = new ArrayList<>();

produtos.add("Detergente");
produtos.add("Mesa");
produtos.add("Cabo");

System.out.println(produtos.get(0)); // Detergente

produtos.remove(0);
System.out.println(produtos);        // [Mesa, Cabo]
System.out.println(produtos.size()); // 2
```

### Common methods

| Method | Purpose |
|---|---|
| `add(value)` | Adds an element |
| `get(index)` | Retrieves the element at an index |
| `remove(index)` | Removes the element at an index |
| `size()` | Returns the number of elements |

**Remember:** arrays use the property `length`; `ArrayList` uses the method `size()`.

## 3. Traditional `for` loop

A traditional `for` loop is useful when you need to work with an index or control the iteration.

```java
int[] numeros = {1, 2, 3, 4, 5};

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i] * 2);
}
```

Output:

```text
2
4
6
8
10
```

### How it works

1. `int i = 0` starts at the first index.
2. `i < numeros.length` keeps the loop within the array bounds.
3. `i++` advances to the next index.
4. `numeros[i]` accesses the current element.
5. `numeros[i] * 2` calculates a doubled value for printing; it does **not** change the original array.

## 4. `for-each` loop

A `for-each` loop visits each element directly, without requiring an index variable.

```java
double[] notas = {7.8, 8.0, 0.0, 1.5, 5.2};

for (double nota : notas) {
    System.out.println(nota);
}
```

The variable `nota` receives the current element on each iteration.

### Combining `for-each`, conditionals, and a counter

You can check each grade and count how many meet a requirement:

```java
double[] notas = {7.8, 8.0, 0.0, 1.5, 5.2};
int aprovados = 0;

for (double nota : notas) {
    if (nota >= 7) {
        aprovados++;
    }
}

System.out.println(aprovados);
```

Output:

```text
2
```

- `if (nota >= 7)` checks whether the current grade meets the passing threshold.
- `aprovados++` increases the counter by one each time the condition is true.
- The final `println` displays the total after the loop finishes.

**Key distinction:** `notas.length` gives the total number of grades; a counter gives the number of grades that meet a specific condition.

## Choosing the right approach

| Approach | Best used when |
|---|---|
| Array | You need a fixed-size group of values of the same type |
| `ArrayList` | You need to add or remove elements dynamically |
| Traditional `for` | You need the index or explicit control over iteration |
| `for-each` | You want to process each element directly |
| Counter with `if` | You need to count elements that satisfy a condition |

## Important principles

- Array indexes start at `0`.
- Use `array.length` for an array and `arrayList.size()` for an `ArrayList`.
- Use `for` when the index matters; use `for-each` when the element itself is enough.
- Printing a calculated expression does not automatically modify the stored value.
- A counter must be initialized before the loop and incremented only when the condition is met.
- Use the condition specified by the task; for example, `nota >= 7` means seven or higher.

</details>

---

<details>
<summary><h2>🇧🇷 Português</h2></summary>

## Sobre o projeto

Este projeto documenta os fundamentos de arrays, `ArrayList` e laços de repetição em Java. Esses conceitos permitem armazenar vários valores, acessar elementos específicos, percorrer dados e realizar operações em cada item.

## O que você encontrará aqui

- **Arrays** — armazenam vários valores do mesmo tipo em uma estrutura de tamanho fixo.
- **Tamanho do array** — usam `length` para descobrir quantos elementos o array contém.
- **ArrayList** — cria uma coleção redimensionável e utiliza métodos como `add()`, `get()`, `remove()` e `size()`.
- **Laço `for` tradicional** — percorre os elementos usando índice, condição e incremento.
- **Laço `for-each`** — percorre diretamente cada elemento de um array ou coleção.
- **Condicionais e contadores** — utilizam `if/else` para verificar condições e um contador para registrar quantos elementos atendem a elas.

## 1. Arrays

Um array armazena vários valores do mesmo tipo. Seu tamanho é fixo após a criação, e seus índices começam em `0`.

```java
int[] numeros = {1, 2, 3, 4, 5};

System.out.println(numeros[0]);       // Primeiro elemento: 1
System.out.println(numeros[4]);       // Último elemento: 5
System.out.println(numeros.length);   // Quantidade de elementos: 5
```

### Pontos importantes

- `numeros[0]` acessa o primeiro elemento.
- `numeros[4]` acessa o quinto elemento desse array.
- `numeros.length` retorna a quantidade de elementos, não o último índice.
- Para exibir o array inteiro como texto, você pode usar `Arrays.toString()`:

```java
System.out.println(java.util.Arrays.toString(numeros));
```

Saída:

```text
[1, 2, 3, 4, 5]
```

## 2. ArrayList

`ArrayList` é uma coleção redimensionável. Diferentemente de um array, sua quantidade de elementos pode mudar conforme itens são adicionados ou removidos.

```java
import java.util.ArrayList;

ArrayList<String> produtos = new ArrayList<>();

produtos.add("Detergente");
produtos.add("Mesa");
produtos.add("Cabo");

System.out.println(produtos.get(0)); // Detergente

produtos.remove(0);
System.out.println(produtos);        // [Mesa, Cabo]
System.out.println(produtos.size()); // 2
```

### Métodos comuns

| Método | Finalidade |
|---|---|
| `add(valor)` | Adiciona um elemento |
| `get(indice)` | Acessa o elemento de um índice |
| `remove(indice)` | Remove o elemento de um índice |
| `size()` | Retorna a quantidade de elementos |

**Lembre-se:** arrays usam a propriedade `length`; `ArrayList` usa o método `size()`.

## 3. Laço `for` tradicional

O `for` tradicional é útil quando você precisa trabalhar com um índice ou controlar a repetição.

```java
int[] numeros = {1, 2, 3, 4, 5};

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i] * 2);
}
```

Saída:

```text
2
4
6
8
10
```

### Como funciona

1. `int i = 0` começa no primeiro índice.
2. `i < numeros.length` mantém o laço dentro dos limites do array.
3. `i++` avança para o próximo índice.
4. `numeros[i]` acessa o elemento atual.
5. `numeros[i] * 2` calcula o dobro para exibição; **não** altera o array original.

## 4. Laço `for-each`

O `for-each` percorre cada elemento diretamente, sem precisar de uma variável de índice.

```java
double[] notas = {7.8, 8.0, 0.0, 1.5, 5.2};

for (double nota : notas) {
    System.out.println(nota);
}
```

A variável `nota` recebe o elemento atual a cada repetição.

### Combinando `for-each`, condicionais e contador

Você pode verificar cada nota e contar quantas atendem a um critério:

```java
double[] notas = {7.8, 8.0, 0.0, 1.5, 5.2};
int aprovados = 0;

for (double nota : notas) {
    if (nota >= 7) {
        aprovados++;
    }
}

System.out.println(aprovados);
```

Saída:

```text
2
```

- `if (nota >= 7)` verifica se a nota atual atende ao critério de aprovação.
- `aprovados++` aumenta o contador em um cada vez que a condição é verdadeira.
- O último `println` exibe o total depois que o laço termina.

**Distinção importante:** `notas.length` informa a quantidade total de notas; um contador informa quantas notas atendem a uma condição específica.

## Como escolher a abordagem

| Abordagem | Quando usar |
|---|---|
| Array | Quando precisa de um grupo de tamanho fixo com valores do mesmo tipo |
| `ArrayList` | Quando precisa adicionar ou remover elementos dinamicamente |
| `for` tradicional | Quando o índice importa ou você precisa controlar a repetição |
| `for-each` | Quando quer processar diretamente cada elemento |
| Contador com `if` | Quando precisa contar elementos que atendem a uma condição |

## Princípios importantes

- Os índices de um array começam em `0`.
- Use `array.length` para um array e `arrayList.size()` para um `ArrayList`.
- Use `for` quando o índice importa; use `for-each` quando o próprio elemento é suficiente.
- Exibir o resultado de uma expressão não modifica automaticamente o valor armazenado.
- Um contador deve ser inicializado antes do laço e incrementado somente quando a condição for atendida.
- Respeite a condição definida no exercício; por exemplo, `nota >= 7` significa sete ou mais.

</details>

---

## 🗺️ Roadmap

- [x] Understand array declaration and indexing / Entender declaração e índices de arrays
- [x] Access array elements and use `length` / Acessar elementos e usar `length`
- [x] Create and modify an `ArrayList` / Criar e modificar um `ArrayList`
- [x] Practice `add()`, `get()`, `remove()`, and `size()` / Praticar `add()`, `get()`, `remove()` e `size()`
- [x] Traverse an array with a traditional `for` / Percorrer um array com `for` tradicional
- [x] Use `for-each` to process elements / Usar `for-each` para processar elementos
- [x] Combine a conditional with individual element checks / Combinar uma condicional com a verificação de cada elemento
- [x] Learn the purpose of a counter / Entender a finalidade de um contador

---

## 📁 Project Structure

```text
Java-Learning-Library/
├── README.md
└── Fundamentos/
    ├── Arrays.java
    ├── ArrayList.java
    ├── For.java
    └── Foreach.java
```

*Adjust the filenames in this tree to match the actual names used in your repository. Each public Java class must have the same name as its file.*

---

## 🧠 Philosophy

> Store data with purpose. Traverse it with understanding. Choose the right tool for the task.

> Armazene dados com propósito. Percorra-os com entendimento. Escolha a ferramenta certa para cada tarefa.

<div align="center">

Made with ☕, curiosity, and consistency.

</div>
