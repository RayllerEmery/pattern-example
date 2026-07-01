import strategy.BankSlipPaymentStrategy;
import strategy.CardPaymentStrategy;
import strategy.PaymentContext;
import strategy.PixPaymentStrategy;

import static java.lang.IO.println;

void main() {

    println("""

            Strategy Pattern
            Strategy allows changing the algorithm at runtime,
            while keeping the same client-facing interface.

            In this example, we dynamically switch the payment method.

            ===

            """);

    var paymentContext = new PaymentContext();
    var accountId = "ACC-567";
    var amount = 320.75;

    paymentContext.setStrategy(new PixPaymentStrategy());
    paymentContext.processPayment(accountId, amount);

    paymentContext.setStrategy(new CardPaymentStrategy());
    paymentContext.processPayment(accountId, amount);

    paymentContext.setStrategy(new BankSlipPaymentStrategy());
    paymentContext.processPayment(accountId, amount);

    println("\nStrategy flow finished.");
}

