package observer;

public class AuditLogObserver implements PaymentObserver {

    @Override
    public void update(String accountId, double amount, String status) {
        System.out.println("[AUDIT] Payment event recorded -> account=" + accountId + ", amount=" + amount + ", status=" + status);
    }
}

