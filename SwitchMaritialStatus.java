import java.util.Scanner;

public class SwitchMaritialStatus {

public static void main(String[] args){

Scanner kb = new Scanner(System.in);
String sDescription = "";

System.out.print("Enter your maritial status");
char cGrade = kb.next().charAt(0);

switch (cGrade) {
    case 's' : 
    case 'S' : sDescription = "Single";
    break;

    case 'm' : 
    case 'M' : sDescription = "Married"; 
    break;

    case 'd' : 
    case 'D' : sDescription = "Divorced"; 
    break;

    case 'c' : 
    case 'C' : sDescription = "Civil Partnership"; 
    break;

    default : sDescription = "Invalid Martial Status.";
}

System.out.print("Your Martial Status is: " + sDescription + " ");

}
}