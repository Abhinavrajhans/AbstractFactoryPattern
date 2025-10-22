package parkingLotProblem.models.payments;

import parkingLotProblem.models.pricing.PricingStrategy;

public interface PaymentStrategy {

    void pay(float amount);
}
