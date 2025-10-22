package parkingLotProblem.models.parking;

import parkingLotProblem.models.mobility.VehicleType;

import java.util.Arrays;
import java.util.List;

public class CarParkingSlot extends ParkingSlot implements CarSlot{

    public CarParkingSlot(int slotNumber, ParkingFloor floor) {
        super(slotNumber, floor, List.of(VehicleType.CAR,VehicleType.BIKE));

    }
}
