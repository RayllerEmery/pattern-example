package factory;

public class PaymentFactory {

    public static Payment createPayment(PaymentType type) {
        return switch (type) {
            case PIX -> new PixPayment();
            case CARD -> new CardPayment();
            case BANK_SLIP -> new BankSlipPayment();
        };
    }
}
