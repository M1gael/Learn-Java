
import java.util.Scanner;

public class CalculateFuelUsed
	{
    public static void main(String[] args)
	{

    int iDistance = 0;
	double rEfficiency = 0 , rFuelUsed = 0;
	
    Scanner keyboard = new Scanner(System.in);		


    System.out.println("Enter the fuel efficiency in litres/km: ");
	rEfficiency = keyboard.nextDouble();
   
    System.out.println("Enter the distance in km : ");
    iDistance = keyboard.nextInt();
        
    rFuelUsed = (rEfficiency*rFuelUsed);


    System.out.println("The fuel used is  " + rFuelUsed + "litres" );
    }
    }
