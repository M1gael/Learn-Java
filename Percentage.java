
import java.util.Scanner;

public class Percentage
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);

    double rPercent , rTestmark;

    
    System.out.print("What is your mark out of a 50? ");
    rTestmark = keyboard.nextDouble();
    
    rPercent = (rTestmark / 50) * 100;

    System.out.print("You got " +rPercent+ " Percent for your test ");

    









    }
}		
