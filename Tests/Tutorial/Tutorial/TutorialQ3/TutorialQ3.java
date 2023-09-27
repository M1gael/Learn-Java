package Tests.Tutorial.Tutorial.TutorialQ3;
import java.util.Random;

public class TutorialQ3 {
    
    public static int FindMax(int a , int b , int c){
        return Math.max(Math.max(a, b),c);
    }

    public static int FindMin(int a , int b , int c){
        return Math.min(Math.min(a, b),c);
    }
  
    public static void main(String[] args){
        Random rand = new Random();

        int random1 = rand.nextInt(1000) , random2 = rand.nextInt(1000) , random3 = rand.nextInt(1000);

        System.out.println("The largest number is : " + FindMax(random1 , random2 , random3));
        System.out.println("The smallest number is : " + FindMin(random1 , random2 , random3));

    }
}
