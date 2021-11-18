package VehicleEx.TypesOfVehicles;

public class Bus extends Vehicle {


    public Bus(String model, int topSpeed, double fuelConsumption) {
        super(model, topSpeed, fuelConsumption);
    }

    @Override
    public void start() {
        System.out.println("Your bus is starting");
    }

    @Override
    public void stop() {
        System.out.println("Your bus has stopped");
    }
}
