package parkingLotProblem.models.mobility;

public class Bike extends Vehicle{

    Bike(String registrationNumber,ColorType color){
        super(registrationNumber,color,VehicleType.BIKE);
    }
}
