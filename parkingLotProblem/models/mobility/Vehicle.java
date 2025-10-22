package parkingLotProblem.models.mobility;

public abstract class Vehicle {
    
    private String registrationNumber;
    private ColorType color;
    private VehicleType vehicleType;

    Vehicle(String registrationNumber, ColorType color, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.vehicleType = vehicleType;
    }


    //getters and setters

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public ColorType getColor() {
        return color;
    }
    public void setColor(ColorType color) {this.color = color;}
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
