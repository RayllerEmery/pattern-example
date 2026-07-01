package strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void process(String accountId, double amount) {
        System.out.println("[CARD] Processing payment | account=" + accountId + " | amount=" + amount);
    }
}

