package classtests.TutorialQ1;
import java.util.Scanner;

public class 1_1 {

    public static double CalculateDiscount(double price){
    double newPrice = price*0.75;
    return newPrice ;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int origionalPrice = 0 ;
        
        System.out.print("What is the origional price of the blouse? : ");
        origionalPrice = kb.nextInt();

        System.out.println("The discounted price is: " + CalculateDiscount(origionalPrice));
    }
}
