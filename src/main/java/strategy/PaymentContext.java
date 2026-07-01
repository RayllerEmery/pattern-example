package strategy;

public class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(String accountId, double amount) {
        if (strategy == null) {
            throw new IllegalStateException("No payment strategy has been defined.");
        }
        strategy.process(accountId, amount);
    }
}

