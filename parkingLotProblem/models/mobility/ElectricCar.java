package parkingLotProblem.models.mobility;

public class ElectricCar extends Vehicle implements ElectricVehicle{

    ElectricCar(String registrationNumber,ColorType color){
        super(registrationNumber,color,VehicleType.ELECTRIC_CAR);
    }

    @Override
    public void charge() {
        System.out.println("ElectricCar charging");
    }

    @Override
    public float getBatteryLevel() {
        return 0;
    }
}
