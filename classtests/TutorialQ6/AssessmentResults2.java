package classtests;
import java.util.Scanner;

public class AssessmentResults2{

    public static boolean validateMarks(double mark , int total){
        if ((0 < mark <= total) && (0 < total <= 100)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static int calcPercentage(double mark , int total){
        return (mark/total)*100;
    }

    public static String determineResults(int percentage){
        if (percentage > 50){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    public static void displayValues(int percentage , String result){
        System.out.println("The student has a percentage of " + percentage);
        System.out.println("The student has obtained a : " + result);
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the test mark: ");
        double testMark = kb.nextDouble(); nextLine(); // clear buffer

        System.out.print("Enter the total of the test : ");
        int testTotal = kb.nextDouble(); nextLine(); // clear buffer
        
        boolean bValidResult = validateMarks(testMark , testTotal);

        if (bValidResult == true){
            int percentage = calcPercentage(testMark , testTotal);
            String result = determineResults(percentage);
            displayValues(percentage , result);
        }
    }

}   

