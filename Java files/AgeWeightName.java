
import java.util.Scanner;

public class AgeWeightName
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String sName , sAge , sWeight ;
		
		
		System.out.print("What is your name?");
		sName = keyboard.nextLine();
		
		System.out.print("What is your age?");
		sAge = keyboard.nextLine();
		
		System.out.print("What is your weight?");
		sWeight = keyboard.nextLine();
		
		System.out.println(" ");
		System.out.println("Your name is " + sName +" ");
		System.out.println("Your age is " + sAge +" ");
		System.out.println("Your weight is " + sWeight +" ");
	}
}