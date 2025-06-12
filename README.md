# 🔔 Padrão de Projeto Observer em Java

Este projeto demonstra a implementação do padrão de projeto **Observer** utilizando a linguagem **Java**. O objetivo é simular um sistema onde múltiplos observadores são notificados automaticamente sempre que o objeto observado sofre alguma alteração de estado.

## 📌 Sobre o Projeto

O sistema simula promoções de um produto (ex: notebooks) e notifica os observadores (clientes) quando há uma nova promoção disponível.

### 🧩 Estrutura de Classes

- `Observador` - Interface que define o método `atualizar()`.
- `Sujeito` - Classe abstrata que gerencia a lista de observadores e realiza as notificações.
- `SujeitoConcreto` - Classe concreta que contém o estado observado (ex: a promoção atual).
- `ObservadoConcreto` - Implementa a interface `Observador` e exibe as notificações.
- `Main` - Classe principal que instancia e conecta os objetos.

## 💡 Funcionamento

1. Cria-se um objeto `SujeitoConcreto` (ex: sistema de promoções).
2. Cadastram-se vários observadores.
3. Sempre que o `Sujeito` atualiza sua informação, todos os observadores são notificados automaticamente.

## 📥 Exemplo de Saída

```bash
Objeto (0) notificador
Nova informação recebida: PROMOÇÃO: notebook gamer R$ 4.000,00
Objeto (1) notificador
Nova informação recebida: PROMOÇÃO: notebook gamer R$ 4.000,00

Objeto (0) notificador
Nova informação recebida: PROMOÇÃO: notebook gamer R$ 3.200,00
Objeto (1) notificador
Nova informação recebida: PROMOÇÃO: notebook gamer R$ 3.200,00

Objeto (0) notificador
Nova informação recebida: PROMOÇÃO: notebook gamer R$ 2.900,00
````

## 🛠️ Tecnologias Utilizadas

* Java 8+
* IDE de sua preferência (Eclipse, IntelliJ, Replit, etc.)

## 🧠 Conceito do Padrão Observer

> Define uma dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

