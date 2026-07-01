package factory;

public class CardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment... CARD");
    }
}

