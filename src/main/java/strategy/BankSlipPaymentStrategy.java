package strategy;

public class BankSlipPaymentStrategy implements PaymentStrategy {

    @Override
    public void process(String accountId, double amount) {
        System.out.println("[BANK_SLIP] Processing payment | account=" + accountId + " | amount=" + amount);
    }
}


