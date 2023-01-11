
import java.util.Scanner;

public class absAbsoluteNestedIfFloatingPointCompare
{
	public static void main(String[] args)
	{
Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double rNum = in.nextDouble();

        if (rNum > 0)
        	{
        	System.out.println("Positive number entered");
        	}
        else if (rNum < 0)
        {
            if (Math.abs(rNum) < 10)
            	{
                System.out.println("Negative small");
            	}
            else if (Math.abs(rNum) > 1000000)
            	{
                System.out.println("Negative large");
            	}
            else
            	{
                System.out.println("Negative");
            	}
        }
        else
        	{
            System.out.println("Zero");
        	}
    }
}



		
