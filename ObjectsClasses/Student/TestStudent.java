package ObjectsClasses.Student;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args){
    
        Scanner kb = new Scanner(System.in);
        Student stud = new Student();           //Refers to other Student class

        String name;
        int age;

        System.out.print("What is your name? : ");
        name = kb.nextLine();

        System.out.print("What is your age? : ");
        age = kb.nextInt();

        stud.setName(name);
        stud.setAge(age);

        System.out.println("Your name is " + stud.getName() + " & you are " + stud.getAge() + "year(s) old");

    }
}
