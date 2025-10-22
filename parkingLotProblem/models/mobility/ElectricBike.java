package parkingLotProblem.models.mobility;

public class ElectricBike extends Vehicle implements ElectricVehicle{

    ElectricBike(String registrationNumber,ColorType color){
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
