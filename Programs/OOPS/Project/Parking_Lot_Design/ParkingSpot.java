package Programs.OOPS.Project.Parking_Lot_Design;

enum VehicleType {
    car, bike
}

class Vehicle {

    private VehicleType type;
    private String vehicleNumber;

    Vehicle(VehicleType type,
            String vehicleNumber) {
        this.type = type;
        this.vehicleNumber = vehicleNumber;
    }

    void getVehicleInformation() {
        System.out.println(this.vehicleNumber + " " + this.type);
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, VehicleType type) {
        super(VehicleType.bike, vehicleNumber);
    }

    void getVehicleInformation() {
        super.getVehicleInformation();
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, VehicleType type) {
        super(VehicleType.car, vehicleNumber);
    }

    void getVehicleInformation() {
        super.getVehicleInformation();
    }
}

public class ParkingSpot {

    private Vehicle vehicle;
    private int spotNumber;

    ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.vehicle = null;
    }

    public boolean isAvailable() {
        return this.vehicle == null;
    }

    public int getSpotNumber() {
        return this.spotNumber;
    }

    public Vehicle getParkedVehicleInfo() {
        return this.vehicle;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle(int spotNumber) {
        this.vehicle = null;
    }

}

