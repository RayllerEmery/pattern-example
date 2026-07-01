package adapter;

public class LegacyPaymentGateway {

    public void makePaymentInCents(String accountCode, long amountInCents) {
        System.out.println("Legacy gateway -> account: " + accountCode + " | cents: " + amountInCents);
    }
}

