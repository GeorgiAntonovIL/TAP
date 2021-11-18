package VehicleEx.TypesOfVehicles;

public class Vehicle {
    public String model;
    public int topSpeed;
    public double fuelConsumption;

    public Vehicle(String model, int topSpeed, double fuelConsumption) {
        this.model = model;
        this.topSpeed = topSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void honk(){
        System.out.println("Honk");
    }
    public void start(){
        System.out.println("Your vehicle is starting");
    }
    public void stop(){
        System.out.println("Your vehicle has stopped");
    }
    public void fillTheTank(){
        System.out.println("Your tank is full");
    }


}
