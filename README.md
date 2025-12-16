# File System CLI (NTFS Manager)

A simple command-line interface (CLI) application built with Java to manage files and directories. This project was created to study and practice file manipulation using the Java Standard Library, specifically the `java.nio` package.

It allows users to perform basic CRUD operations on files directly from the console.

## Features

The application provides a numbered menu with the following capabilities:

* **List Directory:** View all files and folders within a specified path.
* **Read File:** Display the content of a text file in the console.
* **Write/Save File:** Create new files or overwrite existing ones.
* **Append Content:** Add text to the end of an existing file without deleting its current content.
* **Delete File:** Permanently remove a file.
* **Replace/Copy File:** Copy a file from a source to a destination, replacing it if it exists.
* **Rename File:** Change the name of a file within the same directory.
* **Move File:** Move a file from one directory to another.
* **File Info:** Display metadata such as size, absolute path, and last modification date.

## Technologies Used

* **Java (JDK 8+)**
* **java.nio.file:** Used for non-blocking I/O operations (`Paths`, `Files`, `StandardOpenOption`).
* **java.io:** Used for legacy `File` object handling where necessary.
* **Scanner:** For handling user input via console.

## How to Run

### Prerequisites

* Java Development Kit (JDK) installed.

### Compilation

Navigate to the project root folder and compile the source files located in `src`. You can output them to the `bin` folder:

```bash
javac -d bin src/*.java
```

### Execution

Run the compiled `Main` class from the `bin` directory:

```bash
java -cp bin Main
```

---

# Gerenciador de Arquivos (File System CLI)

Uma aplicação simples de interface de linha de comando (CLI) desenvolvida em Java para gerenciar arquivos e diretórios. Este projeto foi criado com o objetivo de estudar e praticar a manipulação de arquivos utilizando a biblioteca padrão do Java, especificamente o pacote `java.nio`.

O sistema permite que o usuário execute operações básicas de CRUD em arquivos diretamente pelo console.

## Funcionalidades

A aplicação oferece um menu numérico com as seguintes capacidades:

* **Listar Diretório:** Visualizar todos os arquivos e pastas dentro de um caminho especificado.
* **Ler Arquivo:** Exibir o conteúdo de um arquivo de texto no console.
* **Escrever/Salvar:** Criar novos arquivos ou sobrescrever arquivos existentes.
* **Acrescentar Texto (Append):** Adicionar texto ao final de um arquivo existente sem apagar o conteúdo atual.
* **Apagar Arquivo:** Remover permanentemente um arquivo.
* **Substituir/Copiar:** Copiar um arquivo de uma origem para um destino, substituindo-o se já existir.
* **Renomear Arquivo:** Alterar o nome de um arquivo dentro do mesmo diretório.
* **Mover Arquivo:** Mover um arquivo de um diretório para outro.
* **Informações do Arquivo:** Exibir metadados como tamanho, caminho absoluto e data da última modificação.

## Tecnologias Utilizadas

* **Java (JDK 8+)**
* **java.nio.file:** Utilizado para operações de I/O (`Paths`, `Files`, `StandardOpenOption`).
* **java.io:** Utilizado para manipulação de objetos `File` legados onde necessário.
* **Scanner:** Para capturar a entrada do usuário via console.

## Como Rodar

### Pré-requisitos

* Java Development Kit (JDK) instalado.

### Compilação

Navegue até a pasta raiz do projeto e compile os arquivos fonte localizados em `src`. Você pode direcionar a saída para a pasta `bin`:

```bash
javac -d bin src/*.java
```

### Execução

Execute a classe `Main` compilada a partir do diretório `bin`:

```bash
java -cp bin Main
```
