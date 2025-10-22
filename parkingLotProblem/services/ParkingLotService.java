package parkingLotProblem.services;

import parkingLotProblem.models.mobility.Vehicle;
import parkingLotProblem.models.parking.FindSlotStrategy;
import parkingLotProblem.models.parking.ParkingLot;
import parkingLotProblem.models.parking.ParkingSlot;
import parkingLotProblem.models.tickets.Ticket;

import java.util.HashMap;
import java.util.Optional;

public class ParkingLotService {

    public ParkingLot parkingLot;
    public FindSlotStrategy findSlotStrategy;
    private final HashMap<String,ParkingSlot> vehicleSlotMap = new HashMap<>();
    private final HashMap<String, Ticket> vehicleTicketMap= new HashMap<>();

    public ParkingLotService(ParkingLot parkingLot, FindSlotStrategy findSlotStrategy) {
        this.parkingLot = parkingLot;
        this.findSlotStrategy = findSlotStrategy;
    }

    public void parkCar(Vehicle vehicle){
        Optional<ParkingSlot> slot = this.findSlotStrategy.findSlot(parkingLot,vehicle);
        if(slot.isEmpty()){
            System.out.println("No slot found, Parking is Full");
            return;
        }
        slot.get().setVehicle(vehicle);
        vehicleSlotMap.put(vehicle.getRegistrationNumber(),slot.get());
        System.out.println("Vehicle parked successfully");
        slot.get().display();
        // let's create a ticket
        Ticket ticket = new Ticket(System.currentTimeMillis(),vehicle,slot.get(),parkingLot.getPricingStrategies());
        vehicleTicketMap.put(vehicle.getRegistrationNumber(),ticket);
        System.out.println("Ticket created successfully");
        ticket.displayTicket();
    }

    public void leaveParking(Vehicle vehicle) {
        ParkingSlot slot = vehicleSlotMap.get(vehicle.getRegistrationNumber());
        if(slot == null){
            System.out.println("Vehicle not found in parking lot");
            return;
        }
        slot.removeVehicle();
        vehicleSlotMap.remove(vehicle.getRegistrationNumber());
        //pay before leaving
        Ticket ticket = vehicleTicketMap.get(vehicle.getRegistrationNumber());
        ticket.setExitTime(System.currentTimeMillis());
        ticket.calculateAndPay();
        vehicleTicketMap.remove(vehicle.getRegistrationNumber());

        System.out.println("Vehicle left successfully");
    }
}
