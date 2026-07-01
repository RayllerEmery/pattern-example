package observer;

public class SmsNotificationObserver implements PaymentObserver {

    @Override
    public void update(String accountId, double amount, String status) {
        System.out.println("[SMS] account=" + accountId + " amount=" + amount + " status=" + status);
    }
}

