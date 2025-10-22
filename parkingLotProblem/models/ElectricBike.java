package parkingLotProblem.models;

import parkingLotProblem.models.mobility.Bike;

public class ElectricBike extends Vehicle implements ElectricVehicle{

    ElectricBike(String registrationNumber, Bike.ColorType color){
        super(registrationNumber,color,VehicleType.ELECTRIC_BIKE);
    }

    @Override
    public void charge() {
        System.out.println("ElectricBike is charging";
    }

    @Override
    public float getBatteryLevel() {
        return 0;
    }
}
