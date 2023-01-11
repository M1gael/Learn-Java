
import java.util.Scanner;

public class FlagsBursaryAndOr
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	int iMark1 = 0 , iMark2 = 0 , iMark3 = 0 , iMark4 = 0 ;
	double rAvg = 0 ;
	boolean bFlag1 = false , bFlag2 = false , bFlag3 = false;

														
	System.out.println("What is your first test mark? ");
	iMark1 = keyboard.nextInt();
	System.out.println("What is your second test mark? ");
	iMark2 = keyboard.nextInt();
	System.out.println("What is your third test mark? ");
	iMark3 = keyboard.nextInt();
	System.out.println("What is your fourth test mark? ");
	iMark4 = keyboard.nextInt();
	rAvg = (iMark1 + iMark2 + iMark3 + iMark4)/4 ; 
	
	
	if (iMark1 >=70 || iMark2 >=70 || iMark3 >=70 || iMark4 >=70) 
		{
		bFlag1 = true;
		}
		
	if (rAvg >= 65)
		{
		bFlag2 = true; 
		}
	
	if (iMark1 >=50 && iMark2 >=50 && iMark3 >=50 && iMark4 >=50) 
		{
		bFlag3 = true;
		}
	
	if (bFlag1 == true && bFlag2 == true && bFlag3 == true )
		{
		System.out.println("Bick bucks 4 u");
		}
			else 
			{
			System.out.println("no buck 4 u");
			}
	
	
	
    }
}		
