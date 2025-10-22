package parkingLotProblem.models.payments;

public class FastTagPaymentStrategy implements PaymentStrategy {


    @Override
    public void pay(float amount) {
        System.out.println("Payment done using card");
    }
}
