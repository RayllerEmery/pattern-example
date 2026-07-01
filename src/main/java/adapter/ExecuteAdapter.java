import adapter.LegacyPaymentGateway;
import adapter.PaymentGatewayAdapter;
import adapter.PaymentProcessor;

import static java.lang.IO.println;

void main() {

    println("""

            Adapter Pattern
            The Adapter allows reusing an existing API with a new interface expected by the system.
            In this example, the flow works with process(accountId, amount),
            but the legacy gateway receives accountCode and amount in cents.

            ===

            """);

    PaymentProcessor paymentProcessor = new PaymentGatewayAdapter(new LegacyPaymentGateway());

    String accountId = "ACC-123";
    double amount = 249.90;

    paymentProcessor.process(accountId, amount);

    println("Payment completed via adapter.");
}

