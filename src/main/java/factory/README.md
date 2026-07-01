# Factory Example / Exemplo Factory

## PT-BR

Este pacote contem um exemplo do padrao Factory para centralizar a criacao de tipos de pagamento.

### Arquivos

- `Payment.java`: contrato comum de pagamento.
- `PaymentType.java`: tipos disponiveis de pagamento.
- `PaymentFactory.java`: ponto central de criacao das implementacoes.
- `PixPayment.java`: implementacao para PIX.
- `CardPayment.java`: implementacao para cartao.
- `BankSlipPayment.java`: implementacao para boleto bancario.
- `ExecuteFactory.java`: runner de demonstracao.

### Ideia principal

A Factory remove a necessidade de espalhar `new` no codigo cliente e encapsula a decisao de qual implementacao deve ser criada.

---

## EN

This package contains a Factory pattern example to centralize payment type creation.

### Files

- `Payment.java`: common payment contract.
- `PaymentType.java`: available payment types.
- `PaymentFactory.java`: central creation point for implementations.
- `PixPayment.java`: PIX implementation.
- `CardPayment.java`: card implementation.
- `BankSlipPayment.java`: bank slip implementation.
- `ExecuteFactory.java`: demonstration runner.

### Main idea

Factory removes the need to spread `new` across client code and encapsulates the decision of which implementation to instantiate.

