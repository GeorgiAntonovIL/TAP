package VehicleEx.TypesOfVehicles;

public class Helicopter extends Vehicle {

    public Helicopter(String model, int topSpeed, double fuelConsumption) {
        super(model, topSpeed, fuelConsumption);
    }

    @Override
    public void start() {
        System.out.println("Your helicopter is flying");
    }

    @Override
    public void stop() {
        System.out.println("Your helicopter has landed");
    }
}
