package ObjectsClasses;

public class Car {
    // Declaration of class data members (properties)//D
    String make;
    String model;
    int year;


    // Declaration of a constructor
    public Car(String make , String model , int year){
        // Initialization of instance variables using parameters
        this.make = make;
        this.model = model;
        this.year = year;
    }
    

    // Declaration of instance method "start"
    void start(){
        // Implementation of the start method
        System.out.println("The car is starting.");
    }

    // Declaration of instance method "drive"
    void drive(){
        // Implementation of the drive method
        System.out.println("The car is driving.");
    }

    // Entry point - main method
    public static void main(String[] args){
    
         // Creating an instance (object) of the Car class
         Car myCar = new Car("Toyota" , "Yaris" , 2022);
         
        // Accessing instance variables and methods
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);

        // Calling instance methods
        myCar.start();
        myCar.drive();
    }
}
