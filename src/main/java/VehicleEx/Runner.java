package VehicleEx;

import VehicleEx.TypesOfPeople.Driver;
import VehicleEx.TypesOfPeople.Mechanic;
import VehicleEx.TypesOfVehicles.Bus;
import VehicleEx.TypesOfVehicles.Car;
import VehicleEx.TypesOfVehicles.Helicopter;
import VehicleEx.TypesOfVehicles.TypeOfPower.ElectricCar;
import VehicleEx.TypesOfVehicles.TypeOfPower.HybridCar;
import VehicleEx.TypesOfVehicles.TypeOfPower.PetrolCar;
import VehicleEx.TypesOfVehicles.Vehicle;

public class Runner {
    public static void main(String[] args) {

        Driver driver1 = new Driver(21,"Male","George");
        Driver driver2 = new Driver(28,"Female","Natalie");

        Vehicle vehicle1 = new Car("Lamborghini Urus", 305,16.9);
        Vehicle vehicle2 = new Car("Lada Niva", 137,8.3);

        Helicopter helicopter = new Helicopter("Apache",587,5.5);
        Bus bus = new Bus("Man",120,15.2);
        Mechanic mechanic = new Mechanic(30,"Male","John");

        ElectricCar electric = new ElectricCar("Tesla 8",200,5);
        Car petrol = new PetrolCar("Peugeot 206",300,7);
        HybridCar hybrid = new HybridCar("Toyota Premium",200,8);

        electric.selfDrive();
        hybrid.charge();
        System.out.println(petrol.getFuelConsumption());

        mechanic.talk();
        mechanic.talk(mechanic.getName());

        helicopter.start();
        helicopter.stop();

        bus.honk();


        race(vehicle1,driver1,vehicle2,driver2);


    }

    public static void race(Vehicle vehicle1, Driver driver1,
                            Vehicle vehicle2, Driver driver2) {
        if(vehicle1.topSpeed > vehicle2.topSpeed){
            System.out.printf("The winner is %s with %s",driver1.getName(),vehicle1.getModel());
        } else if(vehicle1.getTopSpeed() < vehicle2.getTopSpeed()){
            System.out.printf("The winner is %s with %s",driver2.getName(),vehicle2.getModel());
        } else {
            System.out.println("Its a tie");
        }
    }
}
