package observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentEventPublisher {

    private final List<PaymentObserver> observers = new ArrayList<>();

    public void subscribe(PaymentObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(PaymentObserver observer) {
        observers.remove(observer);
    }

    public void processPayment(String accountId, double amount) {
        notifyObservers(accountId, amount, "PAYMENT_STARTED");
        notifyObservers(accountId, amount, "PAYMENT_PROCESSING");
        notifyObservers(accountId, amount, "PAYMENT_COMPLETED");
    }

    private void notifyObservers(String accountId, double amount, String status) {
        for (PaymentObserver observer : observers) {
            observer.update(accountId, amount, status);
        }
    }
}

