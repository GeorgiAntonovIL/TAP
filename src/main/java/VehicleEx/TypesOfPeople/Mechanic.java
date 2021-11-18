package VehicleEx.TypesOfPeople;

public class Mechanic extends Person {


    public Mechanic(int age, String gender, String name) {
        super(age, gender, name);
    }

    @Override
    public void talk() {
        System.out.println("Hello i am a mechanic");
    }
    public void talk(String name) {
        System.out.printf("Hello my name is %s\n",name);
    }

    public void fixVehicle(String model){
        System.out.printf("The mechanic has fixed your %s\n",model);
    }

}
