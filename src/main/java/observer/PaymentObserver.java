package observer;

public interface PaymentObserver {
    void update(String accountId, double amount, String status);
}

