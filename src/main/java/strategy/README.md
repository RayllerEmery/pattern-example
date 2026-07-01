# Strategy Example

## PT-BR

Este pacote contem um exemplo simples do padrao Strategy no dominio de pagamento.

### Arquivos

- `PaymentStrategy.java`: interface comum das estrategias.
- `PixPaymentStrategy.java`: estrategia de pagamento para PIX.
- `CardPaymentStrategy.java`: estrategia de pagamento para cartao.
- `BankSlipPaymentStrategy.java`: estrategia de pagamento para boleto bancario.
- `PaymentContext.java`: contexto que recebe e executa uma estrategia.
- `ExecuteStrategy.java`: runner de demonstracao.

### Ideia principal

O cliente usa sempre `PaymentContext`, mas pode trocar a implementacao da estrategia em tempo de execucao.

---

## EN

This package contains a simple Strategy pattern example in the payment domain.

## Files

- `PaymentStrategy.java`: common strategy interface.
- `PixPaymentStrategy.java`: payment strategy for PIX.
- `CardPaymentStrategy.java`: payment strategy for CARD.
- `BankSlipPaymentStrategy.java`: payment strategy for BANK_SLIP.
- `PaymentContext.java`: context that receives and executes a strategy.
- `ExecuteStrategy.java`: demo runner.

## Main idea

The client always uses `PaymentContext`, but can switch strategy implementations at runtime.

