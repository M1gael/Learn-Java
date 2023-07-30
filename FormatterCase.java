
import java.util.Scanner;
import java.text.DecimalFormat;

public class FormatterCase
{
	public static void main(String[] args)
	{
	Double rNum = 0.0 ;
    Scanner kb = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat ("R #,##0.00");

    System.out.println("Enter one real number ");
    rNum = kb.nextDouble();
    
    System.out.println("The formatted number is  " + formatter.format(rNum));
    }
}		
