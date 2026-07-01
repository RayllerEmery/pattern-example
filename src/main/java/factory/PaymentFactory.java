package factory;

public class PaymentFactory {

    public static Payment createPayment(PaymentType type) {
        return switch (type) {
            case PIX -> new PagamentPix();
            case CARD -> new PagamentCard();
            case BOLETO -> new PagamentBoleto();
        };
    }
}
