
import java.util.Scanner;
import java.util.Math;
public class Clean
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);

	
	System.out.println("Hello , Please Choose a an Option :");
	System.out.println("Simple Interest = 'A' ");
	System.out.println("Combined Interest = 'B' ");
	System.out.println("Inflation = 'C' ");

	if (keyboard.next().charAt(0) != 'A' || keyboard.next().charAt(0) != 'B' || keyboard.next().charAt(0) != 'C' )
		{
		System.out.println("Please ensure that you have entered either A , B or C.")	;
		}
		else if (keyboard.next().charAt(0) != 'A')
			{
			double rA = 0 , rP = 0 , rI = 0 , rN = 0 ;

			System.out.println("Enter your P Value");
			rP = keyboard.nextDouble();
			System.out.println("Enter your I Value");
			rI = keyboard.nextDouble();
			System.out.println("Enter your N Value");
			rN = keyboard.nextDouble();

			rA = rP*(Math,(1 + rI )
			}	







    }
}		
