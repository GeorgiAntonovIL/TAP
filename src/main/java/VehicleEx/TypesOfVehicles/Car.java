package VehicleEx.TypesOfVehicles;

import VehicleEx.TypesOfVehicles.Vehicle;

public class Car extends Vehicle {

    public Car(String model, int topSpeed, double fuelConsumption) {
        super(model, topSpeed, fuelConsumption);
    }

    @Override
    public void start() {
        System.out.println("Your car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Your car has stopped");
    }

}
