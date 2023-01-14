import java.util.Scanner;
import java.text.DecimalFormat;

public class Formatter
{
	public static void main(String[] args)
	{
	
	Double rNum = 0.0 ;
    Scanner keyboard = new Scanner(System.in);       
    DecimalFormat formatter1 = new DecimalFormat ("R #,###.###");    		// (Entire int , Space every 3 numbers . 3 Decimals)
    


    System.out.println("Enter one real number ");
    rNum = keyboard.nextDouble();
    
	System.out.println("The formatted number is  " + formatter1.format(rNum)  + " Formatted in (R #,###.###) ");
	



//for input 123456789,123456789// 
//Formatted in (R #,###) == 123 456 789
//Formatted in (R #,###.###) == 123 456 789 , 123
    }
}		
