import java.util.Scanner;// 1st step declare class

public class CalculateForce 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		Double   rAcc , rForce;
		int iMass ;
	
		System.out.println("What is your mass?");
		iMass = keyboard.nextInt();
		
		System.out.println("What is your Acelleration?");
		rAcc = keyboard.nextDouble();
		
		rForce = iMass * rAcc ;
		
		
		System.out.println("The force you exert is  " + rForce + "Nm  >:I  ");
		
		
	}
}