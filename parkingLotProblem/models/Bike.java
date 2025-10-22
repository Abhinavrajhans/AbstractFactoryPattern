package parkingLotProblem.models;

public class Bike extends Vehicle{

    Bike(String registrationNumber,ColorType color){
        super(registrationNumber,color,VehicleType.BIKE);
    }
}
