package parkingLotProblem.models.pricing;

public class HourlyPricingStrategy implements PricingStrategy {

    private final long pricePerHour;
    private long numberOfHours;

    public HourlyPricingStrategy(long pricePerHour, long numberOfHours) {
        this.pricePerHour = pricePerHour;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public long calculatePrice() {
        return pricePerHour * numberOfHours;
    }

    public void setNumberOfHours(long numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public PricingStrategyType getType(){
        return PricingStrategyType.HOURLY;
    }

}
