
import java.util.Scanner;

public class CalcGreatest
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		int iNum1 , iNum2 , iNum3;
		
		
		System.out.print("Num 1? ");
		iNum1 = keyboard.nextInt();
		
		System.out.print("Num 2? ");
		iNum2 = keyboard.nextInt();
		
		
		System.out.print("Num 3? ");
		iNum3 = keyboard.nextInt();
		
		if ((iNum1 > iNum2) && (iNum1 > iNum3))
			{
			System.out.print("The greatest number is " + iNum1);
			}
			else if ((iNum2 > iNum1) && (iNum2 > iNum3))
				{
				System.out.print("The greatest number is " + iNum2);	
				}
				else if ((iNum3 > iNum1) && (iNum3 > iNum2))
					{
					System.out.print("The greatest number is " + iNum3);	
					}

		else
		{
		System.out.print("The numbers are equal");
		}
		

		System.out.print("");
		
	}
}
