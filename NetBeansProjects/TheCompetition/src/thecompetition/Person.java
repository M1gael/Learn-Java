package thecompetition;


public class Person {
    private String surname;
    private int age;
    private double height;
    private char gender;

    public Person() {
    }
                    //parameterised constructor
    public Person(String p_surname) //this method is overloaded because there are two of them , but with different parameters
    {
        surname = p_surname;
    }
    
    public Person(char p_gender)
    {
        gender = p_gender;
    }
    /*
    We now have three constructors/methods with the same names in the same class
    but different parameter lists (no parameters, one String parameter, and the 3rd
    constructor also have one parameter 
    */
    public Person(String p_surname , int p_age , double p_height , char p_gender)            
    {
        surname = p_surname;
        age = p_age;
        height = p_height;
        gender = p_gender;
    }
    
    public Person(char p_gender ,doublep_height, int p_age, String p_surname)
    {
        surname = p_surname;
        age = p_age;
        height = p_height;
        gender = p_gender;


        /*
        This will not work as it is not a unique compared to the constructor above it. 
        */
    }

}
