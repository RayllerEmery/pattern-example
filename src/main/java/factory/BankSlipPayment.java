package factory;

public class BankSlipPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment... BANK_SLIP");
    }
}

