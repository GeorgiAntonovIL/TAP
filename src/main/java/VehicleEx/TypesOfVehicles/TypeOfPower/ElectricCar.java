package VehicleEx.TypesOfVehicles.TypeOfPower;

import VehicleEx.TypesOfVehicles.Car;

public class ElectricCar extends Car {

    public ElectricCar(String model, int topSpeed, double fuelConsumption) {
        super(model, topSpeed, fuelConsumption);
    }

    @Override
    public void fillTheTank() {
        System.out.println("Your car is charging");
    }

    public void selfDrive(){
        System.out.println("Autopilot activated");
    }
}
