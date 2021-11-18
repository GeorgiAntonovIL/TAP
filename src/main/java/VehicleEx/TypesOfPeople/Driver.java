package VehicleEx.TypesOfPeople;


public class Driver extends Person {
    public Driver(int age, String gender, String name) {
        super(age, gender, name);
    }


    @Override
    public void talk() {
        System.out.println("Hello i am a driver");
    }

    public void talk(String name) {
        System.out.printf("Hello my name is %s \n",name);
    }
    public void drive(String vechicle){
        System.out.printf("Driver is now driving a %s\n",vechicle);
    }


}
