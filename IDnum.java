
import java.util.Scanner;

public class IDnum
{
	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		int iID = 0 , iYear = 0 , iMonth = 0 , iDay = 0 ;
		String sMonthName = "", sYearFull = "";
		


		System.out.print("What are the first 6 digits of your ID? : ");
		
		iID = keyboard.nextInt();
		iDay = iID%100;
		
		iID = iID/100;
		iMonth = iID%10;

		iYear = iID /100;


		if ((0<=iYear) && (iYear<=23))
		{
			sYearFull = ("200" + iYear);
		}
		else
		{
			sYearFull = ("19" + iYear);
		}



		switch (iMonth)
		{
			case 1 : sMonthName = "January" ; break ;
			case 2 : sMonthName = "Febuary" ; break ;
			case 3 : sMonthName = "Martch" ; break ;
			case 4 : sMonthName = "Apil" ; break ;
			case 5 : sMonthName = "May" ; break ;
			case 6 : sMonthName = "June" ; break ;
			case 7 : sMonthName = "July" ; break ;
			case 8 : sMonthName = "August" ; break ;
			case 9 : sMonthName = "September" ; break ;
			case 10 : sMonthName = "October" ; break ;
			case 11 : sMonthName = "November" ; break ;
			case 12 : sMonthName = "December" ; break ;
			default  : sMonthName = "Invalid month number " ; break ;
			
		}



		System.out.println("Day is " + iDay);
		System.out.println("Month is " + iMonth);
		System.out.println("Year is " + iYear);

		System.out.println("Your birthday is on " +  iDay + " " +sMonthName + " " + sYearFull);
    }
}		
