import observer.AuditLogObserver;
import observer.EmailNotificationObserver;
import observer.PaymentEventPublisher;
import observer.SmsNotificationObserver;

import static java.lang.IO.println;

void main() {

    println("""

            Observer Pattern
            Observer defines a one-to-many dependency.
            When the main object changes state, all registered
            observers are notified automatically.

            In this example, payment events notify email, SMS, and audit observers.

            ===

            """);

    var publisher = new PaymentEventPublisher();

    var emailObserver = new EmailNotificationObserver();
    var smsObserver = new SmsNotificationObserver();
    var auditObserver = new AuditLogObserver();

    publisher.subscribe(emailObserver);
    publisher.subscribe(smsObserver);
    publisher.subscribe(auditObserver);

    String accountId = "ACC-999";
    double amount = 780.50;

    publisher.processPayment(accountId, amount);

    println("\nRemoving SMS observer and processing again...");
    publisher.unsubscribe(smsObserver);
    publisher.processPayment(accountId, amount);

    println("\nObserver flow finished.");
}

