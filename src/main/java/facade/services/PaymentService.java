package facade.services;

public class PaymentService {

    public void process(String accountId, double amount) {
        System.out.println("Processing payment of: " + amount + " from account: " + accountId);
        // Simulates payment processing.
        System.out.println("Payment processed successfully!");
    }
}


