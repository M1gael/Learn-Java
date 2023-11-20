package ObjectsClasses.Student;

public class Student {

    private String name;
    private int age ;

    public Student(){
        name = "Unknown";
        age = 0;
    }

    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
