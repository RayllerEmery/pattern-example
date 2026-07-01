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
    var paymentBoleto = PaymentFactory.createPayment(PaymentType.BOLETO);

    paymentPix.process();
    paymentCard.process();
    paymentBoleto.process();
}
