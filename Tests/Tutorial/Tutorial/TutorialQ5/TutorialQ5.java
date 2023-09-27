package classtests.TutorialQ5;
import java.util.Scanner;

public class TutorialQ5{

    public static final double PI = Math.PI; //declared PI

    public static double calcVolume(double r double h){
        return PI * Math.pow(r, 2) * h;
    }

    public static double calcArea(double r, double h){          // formula for area on question paper is incorrect , correct version :  2πrh + 2πr^2
        return 2*(PI*(Math.pow(r , 2))) + (2*PI*r)*h;
    }

    public static void displayValues(double radius . double height , double area , double volume){
        System.out.println("The cylender base radius is : " + radius );
        System.out.println("The cylender height is : " + height );
        System.out.println("The cylender area is : " + area);
        System.out.println("The cylender volume is : " + volume);
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("What is the cylinder height? : ");
        double cylH = kb.nextDouble(); kb.nextLine(); //Clear buffer

        System.out.print("What is the base radius of the cylinder? : ");
        double cylR = kb.nextDouble(); kb.nextLine(); //Clear buffer
    
        double cylVolume = calcVolume(cylH , cylR);
        double cylArea = calcArea(cylR , cylH);
        displayValues(cylR , cylH , cylArea , cylVolume );
    }
}