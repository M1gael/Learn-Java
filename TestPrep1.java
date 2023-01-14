
import java.util.Scanner;

public class TestPrep1
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	double rPerc = 0 , rTestMark = 0;
	boolean bAgain = false ;
	char cYN ='A';

		



		while (bAgain == true); 
		{
			bAgain = false;
			System.out.println("What is your testmark out of 60? ");					//Input
			rTestMark = keyboard.nextDouble();

			rPerc = (rTestMark/60)*100;
			System.out.println("Your test Percentage is " + rPerc);						//Compute and Output


			System.out.println("Would you like to mark a test?  Y/N");		
			if (cYN == 'Y')
			{
				bAgain = true;
			}

		}

	System.out.println("Exiting program");






    }
}		

//System.out.println("Would you like to mark a test?  Y/N");		
//		cYN = keyboard.next().charAt(0);
//		if (cYN == 'Y')
//		{
//			bAgain = true;
//		}
//		else 
//		{
//			bAgain = false;
//		}
		

		//ekstra

import java.util.Scanner;

public class TestPrep1
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	double rPerc = 0 , rTestMark = 0;
	boolean bAgain = true ;
	char cYN ='A';

		
		while (bAgain = true) 
		{
			bAgain = false;

			System.out.println("What is your testmark out of 60? ");					//Input
			rTestMark = keyboard.nextDouble();

			rPerc = (rTestMark/60)*100;
			System.out.println("Your test Percentage is " + rPerc);						//Compute and Output


			System.out.println("Would you like to go bAgain?  y/n");					//Determine if again
			cYN = keyboard.next().charAt(0);

			if (cYN == 'y') 
			{
				bAgain = true;
			}
			else
			{
				break;
			}
		}

	System.out.println("Exiting program");






    }
}		
