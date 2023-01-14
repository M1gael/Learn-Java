
import java.util.Scanner;

public class Momentum
{
	public static void main(String[] args)
	{
		//(obj)	(obj name)//
		Scanner keyboard = new Scanner(System.in);
		//Ceate an object to lead input from keyboard//
		
		Double rV;
		Integer iMass;
		
		System.out.print("What is the mass of the object? ");
		iMass = keyboard.nextInt();
		
		System.out.print("What is the velocity of the object? ");
		rV = keyboard.nextDouble();//NextDouble or NextInt for other viariable types//
		
		System.out.print( "Your momentum is " + (rV * iMass) + "Nm.S-1" );
    }
}
