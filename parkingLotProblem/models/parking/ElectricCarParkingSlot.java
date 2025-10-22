package parkingLotProblem.models.parking;

import parkingLotProblem.models.mobility.Vehicle;
import parkingLotProblem.models.mobility.VehicleType;

import java.util.List;

public class ElectricCarParkingSlot extends  ParkingSlot implements ElectricSlot , CarSlot {

    ElectricCarParkingSlot(int slotNumber,ParkingFloor floor) {
            super(slotNumber,floor, List.of(VehicleType.ELECTRIC_CAR,VehicleType.ELECTRIC_BIKE));
    }

    @Override
    public void chargeVehicle() {
        System.out.println("Charging Electric Vehicle...");
    }
}
