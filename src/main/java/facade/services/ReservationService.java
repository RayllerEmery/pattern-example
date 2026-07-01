package facade.services;

public class ReservationService {

    public boolean reserve(String accountId, double amount) {
        System.out.println("Reserving amount: " + amount + " for account: " + accountId);
        // Simulates amount reservation on account.
        boolean reserved = true;
        System.out.println("Reservation successful: " + reserved);
        return reserved;
    }
}


