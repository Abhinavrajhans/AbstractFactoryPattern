package parkingLotProblem.models.parking;

import parkingLotProblem.models.pricing.PricingStrategy;
import parkingLotProblem.services.ParkingLotService;

import java.util.List;

public class ParkingLot {

    private List<ParkingFloor> floors;
    private List<PricingStrategy> pricingStrategies;

    public ParkingLot(List<ParkingFloor> parkingFloors,List<PricingStrategy> pricingStrategies) {
        this.floors = parkingFloors;
        this.pricingStrategies = pricingStrategies;
    }

    public void addParkingFloor(ParkingFloor floor) {
        this.floors.add(floor);
    }

    public void removeParkingFloor(ParkingFloor floor) {
        this.floors.remove(floor);
    }

    public List<ParkingFloor> getParkingFloors() {
        return this.floors;
    }

    public List<PricingStrategy> getPricingStrategies() {
        return this.pricingStrategies;
    }
}
