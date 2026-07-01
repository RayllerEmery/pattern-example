import facade.PaymentFacade;
import facade.services.BalanceService;
import facade.services.NotificationService;
import facade.services.PaymentService;
import facade.services.ReservationService;

import static java.lang.IO.println;

void main() {

    println("""
            Facade is used as a Service orchestrator.
            With Spring Boot, this can be implemented with @Service.

            Example service flow:
            - BalanceService: validates available balance
            - ReservationService: reserves the amount on account
            - PaymentService: processes the payment
            - NotificationService: sends notifications
            
            ===
            
            """);

    println("""
            Example with no Facade:
            
            """);
    // Instantiate services.
    var balanceService = new BalanceService();
    var reservationService = new ReservationService();
    var paymentService = new PaymentService();
    var notificationService = new NotificationService();

    // Payment flow.
    String accountId = "123456";
    double amount = 500.00;

    // 1. Validate balance.
    if (balanceService.validate(accountId, amount)) {
        // 2. Reserve amount.
        if (reservationService.reserve(accountId, amount)) {
            // 3. Process payment.
            paymentService.process(accountId, amount);

            // 4. Send notification.
            notificationService.send("Payment completed");
        }
    }

    println("\n=== Flow finished ===");

    println("""
            Example with Facade:
            
            """);

    var paymentFacade =  new PaymentFacade(
            balanceService,
            reservationService,
            paymentService,
            notificationService
    );

    paymentFacade.doPayment(accountId, amount);

    println("""
            === Flow finished ===""");

}

