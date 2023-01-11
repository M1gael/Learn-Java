
import java.util.Scanner;

public class IfElseStatementChar
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	char G ;

	System.out.println("What yo gender? M or F , no funny buisness :");
	G = keyboard.next().charAt(0);

	if ( G == 'M' )
	{
	System.out.println("We gotta boy in here! ");
	}

		else if (G == 'F' )
		{
		System.out.println("its a GURL!");
		}

			else
			{
			System.out.println("The what ?");
			System.out.println(keyboard.nextLine());
			}






    }
}		
