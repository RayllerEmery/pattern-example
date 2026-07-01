package facade.services;

public class BalanceService {

    public boolean validate(String accountId, double amount) {
        System.out.println("Validating balance for account: " + accountId + " | Amount: " + amount);
        // Simulates balance validation.
        boolean balanceAvailable = amount > 0 && amount <= 10000;
        System.out.println("Balance valid: " + balanceAvailable);
        return balanceAvailable;
    }
}


