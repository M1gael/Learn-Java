package classtests.TutorialQ2;
import java.util.Scanner;

public class 2_2 {
    
    public static boolean getResults(int summative1 , int summative2){
        if (summative1 >= 50 || summative2 >= 50){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Student results for Summative 1?: ");
        int test1 = kb.nextInt();

        System.out.println("Student results for Summative 2?: ");
        int test2 = kb.nextInt();
    
        if (getResults(test1 , test2) == true){
            System.out.println("The student has passed.");
        }
        else{
            System.out.println("The student has NOT passed.");            
        }
    }
}
