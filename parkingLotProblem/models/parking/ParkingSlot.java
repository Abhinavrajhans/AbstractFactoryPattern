package parkingLotProblem.models.parking;

import parkingLotProblem.models.mobility.Vehicle;
import parkingLotProblem.models.mobility.VehicleType;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public abstract class ParkingSlot {

    private final List<VehicleType> vehicleType;
    private final int slotNumber;
    private ParkingSlotStatus status;
    private ParkingFloor floor;
    private Optional<Vehicle> vehicle;

    public ParkingSlot(int slotNumber, ParkingFloor floor, List<VehicleType> vehicleType) {
        this.slotNumber = slotNumber;
        this.floor = floor;
        this.floor.addParkingSlot(this);
        this.status = ParkingSlotStatus.EMPTY;
        this.vehicleType = vehicleType;
    }

    public int getSlotNumber() {
        return slotNumber;
    }
    public ParkingFloor getFloor() {
        return floor;
    }
    public Optional<Vehicle> getVehicle() {
        return vehicle;
    }
    public ParkingSlotStatus getStatus() {
        return status;
    }
    public List<VehicleType> getVehicleType() {
        return vehicleType;
    }

    public void setStatus(ParkingSlotStatus status) {
        this.status = status;
    }
    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }
    public void setVehicle(Vehicle vehicle) {
       // we should first check that the type of vehicle is part of supported vehicle or not ?
        this.vehicle = Optional.of(vehicle);
        this.status=ParkingSlotStatus.OCCUPIED;
    }



    public void removeVehicle() {
        this.status = ParkingSlotStatus.EMPTY;
        this.vehicle = Optional.empty();
    }
    public boolean isSlotAvailable() {
        return status == ParkingSlotStatus.EMPTY;
    }
    public boolean isVehicleSupported(Vehicle vehicle) {
        return vehicleType.contains(vehicle.getVehicleType());
    }
    public void display(){
        System.out.println("Parking Slot Number " + slotNumber);
        System.out.println("Parking Slot Status " + status );
        System.out.println("Parking Slot Floor " + floor);
        System.out.println("Parking Slot Vehicle Type " + Arrays.toString(vehicleType.toArray()));
        vehicle.ifPresent(value -> System.out.println("Parked Vehicle " + value.getRegistrationNumber()));
    }

}
