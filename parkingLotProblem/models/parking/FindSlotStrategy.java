package parkingLotProblem.models.parking;

import parkingLotProblem.models.mobility.Vehicle;

import java.util.Optional;

public interface FindSlotStrategy {
    Optional<ParkingSlot> findSlot(ParkingLot parkingLot, Vehicle vehicle);
}
