package classtests;
import java.util.Scanner;

public class AssessmentResults2{

    public static boolean validateMarks(double mark , int total){
        if (0 < mark && mark <= total) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int calcPercentage(double mark , int total){
        return (int) ((mark / total) * 100);
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

    public static void displaySummary(int pass , int fail , int total){
        System.out.print("There are " + total + " student results for this module");
        System.out.print("There are " + pass + " students who passed this module");
        System.out.print("There are " + fail + " students who failed this module");
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        boolean bAgain = true , bValidResult = false;
        int percentage = 0 , studCount = 0 , studPass = 0 , studFail = 0 ;
        final int testTotal = 80;
        double testMark = 0;
        String result = " ";

        while (bAgain == true){
            studCount++;

            System.out.print("Enter the test mark: ");
            testMark = kb.nextDouble(); kb.nextLine(); // clear buffer
            

            if (testMark == -1) {
                displaySummary(studPass , studFail , studCount);
                System.exit(0);
            }
            
            bValidResult = validateMarks(testMark , testTotal);

            if (bValidResult == true){
                percentage = calcPercentage(testMark , testTotal);
                result = determineResults(percentage);
                if (result.equals("Pass")) {
                    studPass++;
                }
                else{
                    studFail++;
                }

                displayValues(percentage , result);
            }
       }
    }
}   

