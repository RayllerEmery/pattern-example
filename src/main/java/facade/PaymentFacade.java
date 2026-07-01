package facade;

import facade.services.BalanceService;
import facade.services.NotificationService;
import facade.services.PaymentService;
import facade.services.ReservationService;

public class PaymentFacade {
    private final BalanceService balanceService;
    private final ReservationService reservationService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public PaymentFacade(
            BalanceService balanceService,
            ReservationService reservationService,
            PaymentService paymentService,
            NotificationService notificationService
    ) {
        this.balanceService = balanceService;
        this.reservationService = reservationService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void doPayment(String accountId, double amount) {
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
    }
}
