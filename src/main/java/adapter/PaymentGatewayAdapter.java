package adapter;

public class PaymentGatewayAdapter implements PaymentProcessor {

    private final LegacyPaymentGateway legacyGateway;

    public PaymentGatewayAdapter(LegacyPaymentGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void process(String accountId, double amount) {
        long amountInCents = Math.round(amount * 100);
        legacyGateway.makePaymentInCents(accountId, amountInCents);
    }
}

