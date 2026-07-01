# Adapter Example / Exemplo Adapter

## PT-BR

Este pacote contem um exemplo do padrao Adapter para integrar um gateway legado a uma interface moderna.

### Arquivos

- `PaymentProcessor.java`: interface esperada pelo sistema atual.
- `LegacyPaymentGateway.java`: API legada com assinatura diferente.
- `PaymentGatewayAdapter.java`: adapter que converte chamadas do formato novo para o legado.
- `ExecuteAdapter.java`: runner de demonstracao.

### Ideia principal

O Adapter permite reutilizar componentes legados sem alterar o cliente, convertendo nomes, formatos e contratos entre interfaces.

---

## EN

This package contains an Adapter pattern example to integrate a legacy gateway into a modern interface.

### Files

- `PaymentProcessor.java`: interface expected by the current system.
- `LegacyPaymentGateway.java`: legacy API with a different signature.
- `PaymentGatewayAdapter.java`: adapter that converts calls from the new format to the legacy one.
- `ExecuteAdapter.java`: demonstration runner.

### Main idea

Adapter allows reusing legacy components without changing the client, converting names, formats, and contracts between interfaces.

