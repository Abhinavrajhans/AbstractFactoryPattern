package parkingLotProblem.models.mobility;

public class Car extends Vehicle{

    public Car(String registrationNumber,ColorType color){
        super(registrationNumber,color,VehicleType.CAR);
    }
}
