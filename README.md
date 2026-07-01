# Pattern Example

PT-BR | EN

Projeto Java com exemplos práticos de padroes de projeto voltados ao dominio de pagamentos.
Java project with practical design pattern examples focused on the payment domain.

## PT-BR

### Visao geral

Este repositorio demonstra, de forma simples e didatica, como aplicar diferentes padroes de projeto para resolver problemas comuns de organizacao, extensibilidade e reutilizacao de codigo.

### Padroes implementados

- **Builder** (`src/main/java/builder`)
  - Construcao de objetos complexos passo a passo, com melhor legibilidade e sem excesso de parametros opcionais.
- **Factory** (`src/main/java/factory`)
  - Centralizacao da criacao de objetos de pagamento (`PIX`, `CARD`, `BANK_SLIP`) via fabrica.
- **Adapter** (`src/main/java/adapter`)
  - Adaptacao entre uma interface moderna do sistema e um gateway legado com contrato diferente.
- **Strategy** (`src/main/java/strategy`)
  - Troca dinamica de algoritmos de pagamento em tempo de execucao, mantendo a mesma interface.
- **Observer** (`src/main/java/observer`)
  - Notificacao automatica de multiplos assinantes quando eventos de pagamento mudam de status.
- **Facade** (`src/main/java/facade`)
  - Interface unica para orquestrar um fluxo completo de pagamento com varios servicos.

### Objetivo

Servir como referencia rapida para estudo de padroes de projeto em Java, com exemplos pequenos e focados.

---

## EN

### Overview

This repository demonstrates, in a simple and didactic way, how to apply different design patterns to solve common problems of organization, extensibility, and code reuse.

### Implemented patterns

- **Builder** (`src/main/java/builder`)
  - Step-by-step construction of complex objects, improving readability and avoiding too many optional parameters.
- **Factory** (`src/main/java/factory`)
  - Centralized creation of payment objects (`PIX`, `CARD`, `BANK_SLIP`) through a factory.
- **Adapter** (`src/main/java/adapter`)
  - Adaptation between a modern system interface and a legacy gateway with a different contract.
- **Strategy** (`src/main/java/strategy`)
  - Runtime switching of payment algorithms while keeping the same interface.
- **Observer** (`src/main/java/observer`)
  - Automatic notification of multiple subscribers when payment events change status.
- **Facade** (`src/main/java/facade`)
  - A single interface to orchestrate a complete payment flow across multiple services.

### Goal

Provide a quick reference for studying design patterns in Java with small and focused examples.

