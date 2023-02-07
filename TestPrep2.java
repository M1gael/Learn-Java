
import java.util.Scanner;

public class TestPrep2
{
	public static void main(String[] args)
	{
	
		for (int i=0 ; i<1 ; i++)
		{
			Scanner keyboard = new Scanner(System.in);
			String s1 = "" , s2 = "";

			System.out.println("What is the first string ? ");
			s1 = keyboard.nextLine();

			System.out.println("What is the second string ? ");
			s2 = keyboard.nextLine();

				if (s1.equalsIgnoreCase(s2) == true) 
				{
					System.out.println("The strings match ");
				}
				else
				{
					System.out.println("The strings do not match ");
				}

		
			System.out.println("Would you like to go again? [Y/N]");
			
			switch(keyboard.next().charAt(0))
			{
			case 'Y' : i=i-1 ; break;	
			case 'y' : i=i-1 ; break;
			}
			
		}

	System.out.println("Exiting program");






    }
}		
