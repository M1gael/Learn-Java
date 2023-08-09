package classtests.TutorialQ2;
import java.util.Scanner;

public class 2_1 {
    
    public static String determineAngle(double degrees){
        String right = "This angle is a right angle" , notRight = "This angle is not a right angle";

        if (degrees == 90){
            return right;
        }
        else{
            return notRight;
        }
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double totalDegrees = 0;

        System.out.print("How many degrees is the angle?");
        totalDegrees = kb.nextDouble();

        System.out.println(determineAngle(totalDegrees));
    }
}
