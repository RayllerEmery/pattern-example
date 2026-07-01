# Facade Services / Servicos da Facade

## PT-BR

Este subpacote contem servicos usados pela `PaymentFacade`.

### Arquivos

- `BalanceService.java`: valida saldo disponivel.
- `ReservationService.java`: reserva valor na conta.
- `PaymentService.java`: processa o pagamento.
- `NotificationService.java`: envia notificacao ao fim do fluxo.

### Ideia principal

Cada servico possui uma unica responsabilidade. A orquestracao entre eles fica concentrada na fachada.

---

## EN

This subpackage contains services used by `PaymentFacade`.

### Files

- `BalanceService.java`: validates available balance.
- `ReservationService.java`: reserves amount on account.
- `PaymentService.java`: processes the payment.
- `NotificationService.java`: sends a notification at the end of the flow.

### Main idea

Each service has a single responsibility. The orchestration across them is centralized in the facade.

