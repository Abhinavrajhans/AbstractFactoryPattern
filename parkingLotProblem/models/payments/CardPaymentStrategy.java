package parkingLotProblem.models.payments;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(float amount) {
        System.out.println("Payment done using card");
    }
}
