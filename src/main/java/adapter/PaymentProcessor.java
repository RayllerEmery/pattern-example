package adapter;

public interface PaymentProcessor {
    void process(String accountId, double amount);
}

