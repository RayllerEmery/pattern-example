package strategy;

public interface PaymentStrategy {
    void process(String accountId, double amount);
}

