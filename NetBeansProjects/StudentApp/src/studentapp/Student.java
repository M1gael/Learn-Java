package studentapp;

public class Student {
    //<access modifier><datatype><dataMember>
    private String surname;
    private String studentNumber;
    private int age;
        
    public Student()
        {
        
        }
    
    //Mutator setter Methods Syntax: public void methodName(parameter)

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getAge() {
        return age;
    }
    
    

    
}
