package parkingLotProblem.models.parking;

import parkingLotProblem.models.mobility.VehicleType;

import java.util.List;

public class ElectricBikeParkingSlot extends ParkingSlot implements ElectricSlot,BikeSlot{

    ElectricBikeParkingSlot(int slotNumber, ParkingFloor floor) {
        super(slotNumber,floor, List.of(VehicleType.BIKE));
    }

    @Override
    public void chargeVehicle() {
        System.out.println("Charging Electric Bike.");
    }
}
