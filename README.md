# Grafo: Rede de Amigos (Matriz de Adjacência)

Este projeto foi desenvolvido como parte da **2ª Webquest de Matemática Discreta**. O objetivo é implementar a estrutura de dados de um **Grafo** utilizando uma **Matriz de Adjacência** em Java, simulando uma rede social de amigos.

## 📋 Sobre o Projeto

O software modela relações entre pessoas (Vértices) e suas amizades (Arestas). Diferente de uma matriz de adjacência simples (que armazena apenas 0 ou 1), este projeto armazena objetos complexos nas arestas, permitindo guardar metadados sobre a relação, como o tipo e o tempo de amizade.

### Funcionalidades Principais
* **Criação de Grafo:** Capacidade definida na instanciação (número fixo de vértices).
* **Gerenciamento de Vértices:** Adição de pessoas à rede com verificação de capacidade.
* **Gerenciamento de Arestas:** Criação de laços de amizade bidirecionais (Grafo não direcionado).
* **Atributos da Aresta:** Validação de "Tipo de Amizade" (1 a 3) e "Tempo de Amizade".
* **Cálculo de Grau:** Contagem automática de quantas conexões (amigos) cada vértice possui.
* **Visualização:** Impressão da Matriz de Adjacência no console formatada para leitura.

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java
* **Conceitos:** Programação Orientada a Objetos, Estrutura de Dados (Grafos), Tratamento de Exceções.

## 📂 Estrutura do Projeto

O código está organizado no pacote `matrizAdjacencia`:

| Arquivo | Descrição |
| :--- | :--- |
| `GrafoMatrizAdjacencia.java` | Classe principal da estrutura de dados. Gerencia a matriz `Arestas[][]` e a lista de vértices. Contém a lógica de inserção e impressão. |
| `Vertices.java` | Representa os nós do grafo (Pessoas). Armazena o nome e calcula o grau (número de arestas conectadas). |
| `Arestas.java` | Representa as conexões. Armazena a origem, destino, tipo de amizade e tempo de amizade. Inclui validações de dados. |
| `Main.java` | Classe executável para demonstração. Instancia uma rede de 6 pessoas e cria diversas conexões para teste. |
