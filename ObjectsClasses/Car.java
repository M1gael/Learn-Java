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

/*
5. Access Modifiers:

    Definition: Access modifiers (public, private, protected) control the visibility of class members (variables and methods).

6. Encapsulation:

    Definition: Encapsulation is the bundling of data (properties) and methods that operate on the data into a single unit (class).

7. Inheritance:

    Definition: Inheritance allows a class to inherit properties and behaviors from another class.

8. Polymorphism:

    Definition: Polymorphism allows objects to be treated as instances of their parent class.

9. Static Members:

    Definition: static members belong to the class rather than instances.

10. Class Data Members:

    Definition: Class data members are shared among all instances of the class.

11. Final Keyword:

    Definition: final keyword can be used to make a class, method, or variable unmodifiable.

12. Abstract Classes and Interfaces:

    Definition: Abstract classes and interfaces provide a way to achieve abstraction in Java.
 */