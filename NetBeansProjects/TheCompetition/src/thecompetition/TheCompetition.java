package thecompetition;
import java.util.*;

public class TheCompetition {

  
    public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
        
    boolean bAgain = true;
    int compCount = 1;
    int highScore = 0;
    int tempScore = 0;
    int bestComp = 0;
    
        while (bAgain == true){

            System.out.print("Enter the score for Opponent " + compCount + " :");
            tempScore = kb.nextInt();
            if (tempScore <0)
            {bAgain = false;}

            if (highScore < tempScore)
            {
                highScore = tempScore;
                bestComp = compCount;
            }

            compCount++;
        }
    System.out.println("The best Competetor: " +bestComp+ "\n" +"With a Score of : " +highScore);
    }
    
}
