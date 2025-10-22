package parkingLotProblem.models.tickets;

import parkingLotProblem.models.mobility.Vehicle;
import parkingLotProblem.models.parking.ParkingSlot;
import parkingLotProblem.models.payments.PaymentStrategy;
import parkingLotProblem.models.pricing.PricingStrategy;
import parkingLotProblem.services.PricingService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Ticket {

    private final String id;
    private final Long entryTime;
    private Optional<Long> exitTime;
    private final Vehicle vehicle;
    private final ParkingSlot parkingSlot;
    private final List<PricingStrategy> pricingStrategies;
    private Optional<PaymentStrategy> paymentStrategy;

    public Ticket(Long entryTime, Vehicle vehicle, ParkingSlot parkingSlot, List<PricingStrategy> pricingStrategies) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.pricingStrategies = pricingStrategies;
        this.id= UUID.randomUUID().toString();
    }

    public void setExitTime(Long exitTime) {
        this.exitTime = Optional.of(exitTime);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = Optional.of(paymentStrategy);
    }

    public void calculateAndPay(){

        //check if we have hourly pricing strategy and then we need to set the number of hours

        long price = PricingService.calculateParkingCharge(this);
        System.out.println("Price calculate :"+price);
        paymentStrategy.get().pay(price);
    }

    public Long getEntryTime() {
        return entryTime;
    }


    public Long getExitTime() {
        return exitTime.orElse(entryTime);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public List<PricingStrategy> getPricingStrategies() {
        return pricingStrategies;
    }

    public Optional<PaymentStrategy> getPaymentStrategy() {
        return paymentStrategy;
    }

    public String getId() {
        return id;
    }

    public void displayTicket()
    {
        System.out.println("Ticket ID : "+id);
        System.out.println("Entry Time : "+entryTime);
        System.out.println("Exit Time : "+exitTime);
        System.out.println("Parking Slot : "+parkingSlot);

    }
}
