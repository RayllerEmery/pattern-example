package strategy;

public class PixPaymentStrategy implements PaymentStrategy {

    @Override
    public void process(String accountId, double amount) {
        System.out.println("[PIX] Processing payment | account=" + accountId + " | amount=" + amount);
    }
}

