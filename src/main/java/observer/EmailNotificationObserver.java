package observer;

public class EmailNotificationObserver implements PaymentObserver {

    @Override
    public void update(String accountId, double amount, String status) {
        System.out.println("[EMAIL] account=" + accountId + " amount=" + amount + " status=" + status);
    }
}

