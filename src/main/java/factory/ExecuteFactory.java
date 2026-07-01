import factory.PaymentFactory;
import factory.PaymentType;

import static java.lang.IO.println;

void main() {

    println("""
            
            The Factory Pattern centralizes object creation.
            Instead of scattering `new` throughout the code,
            we use a class or method responsible for deciding which implementation to create.
            
            ===
            
            """);

    var paymentPix = PaymentFactory.createPayment(PaymentType.PIX);
    var paymentCard = PaymentFactory.createPayment(PaymentType.CARD);
    var bankSlipPayment = PaymentFactory.createPayment(PaymentType.BANK_SLIP);

    paymentPix.process();
    paymentCard.process();
    bankSlipPayment.process();
}
