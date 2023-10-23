package ObjectsClasses.CreatingObjects;

public class MyVehicle {
    public static void main(String[] args){

        Car  myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Yaris";
        myCar.year = 2022;
        myCar.start();
        myCar.drive();
    }
}
