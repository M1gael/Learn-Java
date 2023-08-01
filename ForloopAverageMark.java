import java.util.Scanner ;

public class ForloopAverageMark {


    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        double rt1 , rt2 , rt3 , rExam , rAverage ;
        int iCount = 0 ;
        String sYN = "";

        for (int i = 1 ; i<=20 ; i++) {
            System.out.print("What is the first test mark for student " + i + "? : ");
            rt1 = kb.nextDouble();

            System.out.print("What is the second test mark for student " + i + "? : ");
            rt2 = kb.nextDouble();

            System.out.print("What is the third test mark for student " + i + "? : ");
            rt3 = kb.nextDouble();

            System.out.print("What is the Exam test mark for student " + i + "? : ");
            rExam = kb.nextDouble();

            iCount++;
            rAverage =  (rt1 + rt2 + rt3)/2 + (rExam/2);
            System.out.println("Student " + i + " has an average of : " + rAverage);


            System.out.print("Again? y/n: " );
            sYN = kb.next();                                                       
            
            if ((sYN.equals("N")) || (sYN.equals("n"))) {
                System.out.print("You have calculated " + iCount + " student averages." );
                break;
            }

        }
    } 
}