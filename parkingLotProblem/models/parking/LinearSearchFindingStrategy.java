package parkingLotProblem.models.parking;

import parkingLotProblem.models.mobility.Vehicle;

import java.util.Optional;

public class LinearSearchFindingStrategy implements FindSlotStrategy {

    @Override
    public Optional<ParkingSlot> findSlot(ParkingLot parkingLot, Vehicle vehicle) {
        for(ParkingFloor floor:parkingLot.getParkingFloors()){
            for(ParkingSlot slot:floor.getParkingSlots()){
                if(slot.isSlotAvailable() && slot.isVehicleSupported(vehicle)){
                    slot.display();
                    return Optional.of(slot);
                }
            }
        }
        System.out.println("No slot found");
        return Optional.empty();
    }
}
