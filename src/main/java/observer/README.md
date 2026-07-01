# Observer Example

## PT-BR

Este pacote contem um exemplo simples do padrao Observer no dominio de pagamento.

### Arquivos

- `PaymentObserver.java`: interface dos observadores.
- `PaymentEventPublisher.java`: subject/publicador de eventos.
- `EmailNotificationObserver.java`: observador de notificacao por email.
- `SmsNotificationObserver.java`: observador de notificacao por SMS.
- `AuditLogObserver.java`: observador de auditoria.
- `ExecuteObserver.java`: runner de demonstracao.

### Ideia principal

`PaymentEventPublisher` processa um pagamento e notifica todos os observers registrados sobre mudancas de status.

---

## EN

This package contains a simple Observer pattern example in the payment domain.

## Files

- `PaymentObserver.java`: observer interface.
- `PaymentEventPublisher.java`: subject/event publisher.
- `EmailNotificationObserver.java`: email notification observer.
- `SmsNotificationObserver.java`: SMS notification observer.
- `AuditLogObserver.java`: audit observer.
- `ExecuteObserver.java`: demo runner.

## Main idea

`PaymentEventPublisher` processes a payment and notifies all registered observers about status changes.

