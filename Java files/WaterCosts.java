import java.util.Scanner;



public class WaterCosts

{

    public static void main(String[] args)

    {

    Scanner keyboard = new Scanner(System.in);



    double rWaterConsumed = 0 ,rTotalCost = 0 ;

    final double WATER = 16 , WATER_TAX = 19;



    System.out.println("Enter amount of water consumed (in kL) : ");

    rWaterConsumed = keyboard.nextDouble();





    rTotalCost = (9 * WATER)  + ((rWaterConsumed-9) * WATER_TAX );



    System.out.println("The cost of "+rWaterConsumed+" of water will be "+rTotalCost);

}
}
