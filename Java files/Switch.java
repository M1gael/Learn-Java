
import java.util.Scanner;

public class Switch
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	Integer iDay = 0 ;

	System.out.println("Which weekday number is today? ");
	iDay = keyboard.nextInt();

	switch (iDay)
	{
	case 1 : System.out.println("Weekday 1 is Monday.") ; break;
	case 2 : System.out.println("Weekday 2 is Tuseday.") ; break;
	case 3 : System.out.println("Weekday 3 is Wednesday.") ; break;
	case 4 : System.out.println("Weekday 4 is Thursday.") ; break;
	case 5 : System.out.println("Weekday 5 is Friday.") ; break;
	case 6 : System.out.println("Weekday 6 is Saterday.") ; break;
	case 7 : System.out.println("Weekday 7 is Sunday.") ; break;
	default :System.out.println("Invalid ") ; break;

	}


    }
}		
