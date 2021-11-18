package VehicleEx.TypesOfVehicles.TypeOfPower;

import VehicleEx.TypesOfVehicles.Car;

public class HybridCar extends Car {
    public HybridCar(String model, int topSpeed, double fuelConsumption) {
        super(model, topSpeed, fuelConsumption);
    }

    @Override
    public void fillTheTank() {
        super.fillTheTank();
    }
    public void charge(){
        System.out.println("Your car is charging");
    }
}
