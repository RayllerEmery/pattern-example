# Facade Example / Exemplo Facade

## PT-BR

Este pacote contem um exemplo do padrao Facade para orquestrar o fluxo de pagamento com varios servicos.

### Arquivos

- `PaymentFacade.java`: fachada que centraliza o fluxo de pagamento.
- `ExecuteServices.java`: demonstracao comparando fluxo com e sem facade.

### Subpacote

- `services/`: servicos de validacao, reserva, processamento e notificacao.

### Ideia principal

A Facade simplifica o uso do sistema ao expor uma interface unica para uma sequencia de operacoes que envolvem multiplos servicos.

---

## EN

This package contains a Facade pattern example to orchestrate a payment flow across multiple services.

### Files

- `PaymentFacade.java`: facade that centralizes the payment flow.
- `ExecuteServices.java`: demonstration comparing flow with and without facade.

### Subpackage

- `services/`: validation, reservation, processing, and notification services.

### Main idea

Facade simplifies system usage by exposing a single interface for a sequence of operations that involve multiple services.

