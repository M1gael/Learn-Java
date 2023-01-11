
import java.util.Scanner;

public class CalcAverage
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		int iNumStudents;
		double rAverage , rNum1 , rNum2 , rNum3;
		
		
		System.out.print("Mark for student 1? ");
		rNum1 = keyboard.nextDouble();
		
		System.out.print("Mark for student 2? ");
		rNum2 = keyboard.nextDouble();
		
		
		//System.out.print("Mark for student 3? ");
		//rNum3 = keyboard.nextDouble();
		
		
		rAverage =   (rNum1 + rNum2);
		rAverage =  (rAverage)/2;
		System.out.print(" ")
		System.out.print("The average is "rAverage);
		
	}
}
